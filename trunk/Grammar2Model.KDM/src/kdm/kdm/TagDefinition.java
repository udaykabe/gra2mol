/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.kdm;

import kdm.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kdm.kdm.TagDefinition#getTag <em>Tag</em>}</li>
 *   <li>{@link kdm.kdm.TagDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see kdm.kdm.KdmPackage#getTagDefinition()
 * @model
 * @generated
 */
public interface TagDefinition extends Element {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see kdm.kdm.KdmPackage#getTagDefinition_Tag()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link kdm.kdm.TagDefinition#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see kdm.kdm.KdmPackage#getTagDefinition_Type()
	 * @model dataType="kdm.core.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link kdm.kdm.TagDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // TagDefinition
