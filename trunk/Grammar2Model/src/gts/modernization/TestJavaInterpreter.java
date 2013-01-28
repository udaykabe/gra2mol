/*******************************************************************************
 * Copyright (c) 2008, 2011
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/


package gts.modernization;

import gts.modernization.interpreter.Gra2MoLInterpreter;
import gts.modernization.model.CST.Element;
import gts.modernization.model.CST.impl.CSTPackageImpl;
import gts.modernization.model.Gra2MoL.Core.Transformation;
import gts.modernization.parser.gra2mol.Gra2MoLLexer;
import gts.modernization.parser.gra2mol.Gra2MoLParser;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * Test the interpreter using Java files as input
 * 
 * @author <a href="mailto:jlcanovas@um.es">Javier Canovas</a>
 *
 */
public class TestJavaInterpreter {
	public static void main(String[] args) {

		Transformation transformation = loadTransformation("files/pruebaJava.view");
		saveTransformation("debug/vistaJava.ecore", transformation);
		Element e = loadCST("files/modelcst.java.ecore");	
		
		
		Gra2MoLInterpreter interpreter = new Gra2MoLInterpreter(e, transformation, "metamodel/kdm.ecore", "KDM_MetaModel", "debug/interpretado.ecore");
		interpreter.execute();
	}
	
	public static Transformation loadTransformation(String path) {
		try {
			CharStream input = new ANTLRFileStream(path);
			Gra2MoLLexer lex = new Gra2MoLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lex);
			Gra2MoLParser parser = new Gra2MoLParser(tokens);
			Gra2MoLParser.transformationDefinition_return r = parser.transformationDefinition();	
			return r.transformationReturn;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public static Element loadCST(String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		rs.getPackageRegistry().put("http://gts.inf.um.es/modernization/cst", CSTPackageImpl.eINSTANCE);

		Resource r = rs.getResource(URI.createFileURI(path), true);
		Element t = null;
		try {
			r.load(null);
			t = (Element) r.getContents().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return t;

	}
	
	public static void saveTransformation(String path, Transformation n) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource r = rs.createResource(URI.createFileURI(path));
		try {
			r.getContents().add(n);
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}	
}
