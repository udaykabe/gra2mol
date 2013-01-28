/**
 * <copyright>
 * </copyright>
 *
 * $Id: Node.java,v 1.1 2008/01/14 09:09:07 Javier Canovas Exp $
 */
package gts.modernization.model.CST;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.CST.Node#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.CST.CSTPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Element {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link gts.modernization.model.CST.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see gts.modernization.model.CST.CSTPackage#getNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getChildren();
	
	List<Leaf> getLeaves();
	
	List<Node> getNodes();
	
	Leaf findLeaf(String kind);
	
	Leaf getLeaf(String kind, int position);

	Node getNode(String kind, int position);
	
	String extractContent(boolean introduceSpaces);
	
	List<Leaf> getAllLeaves(String kind);
	
	boolean deepEquals(Node node);

} // Node
