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

package gts.modernization.model.Gra2MoL.Query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getType <em>Type</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getOperation <em>Operation</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getElement <em>Element</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getExpression <em>Expression</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getNext <em>Next</em>}</li>
 *   <li>{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterUnit()
 * @model
 * @generated
 */
public interface FilterUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.Gra2MoL.Query.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Query.FilterType
	 * @see #setType(FilterType)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterUnit_Type()
	 * @model
	 * @generated
	 */
	FilterType getType();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Query.FilterType
	 * @see #getType()
	 * @generated
	 */
	void setType(FilterType value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link gts.modernization.model.Gra2MoL.Query.FilterOperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Query.FilterOperationType
	 * @see #setOperation(FilterOperationType)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterUnit_Operation()
	 * @model
	 * @generated
	 */
	FilterOperationType getOperation();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see gts.modernization.model.Gra2MoL.Query.FilterOperationType
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(FilterOperationType value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(QueryElement)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterUnit_Element()
	 * @model containment="true"
	 * @generated
	 */
	QueryElement getElement();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(QueryElement value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(FilterExpression)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterUnit_Expression()
	 * @model containment="true"
	 * @generated
	 */
	FilterExpression getExpression();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(FilterExpression value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(FilterUnit)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterUnit_Next()
	 * @model containment="true"
	 * @generated
	 */
	FilterUnit getNext();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(FilterUnit value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see gts.modernization.model.Gra2MoL.Query.QueryPackage#getFilterUnit_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link gts.modernization.model.Gra2MoL.Query.FilterUnit#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // FilterUnit
