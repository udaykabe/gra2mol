/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.data;

import kdm.code.Datatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.data.DatatypeOf#getTo <em>To</em>}</li>
 *   <li>{@link kdm.data.DatatypeOf#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.data.DataPackage#getDatatypeOf()
 * @model
 * @generated
 */
public interface DatatypeOf extends AbstractDataRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Datatype)
	 * @see kdm.data.DataPackage#getDatatypeOf_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datatype getTo();

	/**
	 * Sets the value of the '{@link kdm.data.DatatypeOf#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Datatype value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ComplexContentType)
	 * @see kdm.data.DataPackage#getDatatypeOf_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComplexContentType getFrom();

	/**
	 * Sets the value of the '{@link kdm.data.DatatypeOf#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ComplexContentType value);

} // DatatypeOf
