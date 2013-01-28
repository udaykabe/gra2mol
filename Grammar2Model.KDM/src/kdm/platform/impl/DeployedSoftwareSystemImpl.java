/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kdm.platform.impl;

import java.util.Collection;

import kdm.action.ActionElement;

import kdm.code.AbstractCodeElement;

import kdm.core.AggregatedRelationship;
import kdm.core.KDMEntity;
import kdm.core.KDMRelationship;

import kdm.core.impl.ElementImpl;

import kdm.kdm.ExtendedValue;
import kdm.kdm.KDMModel;
import kdm.kdm.Stereotype;

import kdm.platform.AbstractPlatformRelationship;
import kdm.platform.DeployedComponent;
import kdm.platform.DeployedSoftwareSystem;
import kdm.platform.PlatformPackage;

import kdm.source.SourceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Software System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link kdm.platform.impl.DeployedSoftwareSystemImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link kdm.platform.impl.DeployedSoftwareSystemImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link kdm.platform.impl.DeployedSoftwareSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link kdm.platform.impl.DeployedSoftwareSystemImpl#getSource <em>Source</em>}</li>
 *   <li>{@link kdm.platform.impl.DeployedSoftwareSystemImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link kdm.platform.impl.DeployedSoftwareSystemImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link kdm.platform.impl.DeployedSoftwareSystemImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link kdm.platform.impl.DeployedSoftwareSystemImpl#getGroupedComponent <em>Grouped Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeployedSoftwareSystemImpl extends ElementImpl implements DeployedSoftwareSystem {
	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected EList<Stereotype> stereotype;

	/**
	 * The cached value of the '{@link #getTaggedValue() <em>Tagged Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedValue> taggedValue;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> source;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPlatformRelationship> relation;

	/**
	 * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionElement> abstraction;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCodeElement> implementation;

	/**
	 * The cached value of the '{@link #getGroupedComponent() <em>Grouped Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedComponent> groupedComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedSoftwareSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.DEPLOYED_SOFTWARE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getStereotype() {
		if (stereotype == null) {
			stereotype = new EObjectResolvingEList<Stereotype>(Stereotype.class, this, PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__STEREOTYPE);
		}
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedValue> getTaggedValue() {
		if (taggedValue == null) {
			taggedValue = new EObjectContainmentEList<ExtendedValue>(ExtendedValue.class, this, PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__TAGGED_VALUE);
		}
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPlatformRelationship> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<AbstractPlatformRelationship>(AbstractPlatformRelationship.class, this, PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeElement> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<AbstractCodeElement>(AbstractCodeElement.class, this, PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedComponent> getGroupedComponent() {
		if (groupedComponent == null) {
			groupedComponent = new EObjectResolvingEList<DeployedComponent>(DeployedComponent.class, this, PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT);
		}
		return groupedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createAggregation(KDMEntity otherEntity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteAggregation(AggregatedRelationship aggregation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getInbound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getOutbound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getOwnedRelation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getInAggregated() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getOutAggregated() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMEntity getOwner() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getOwnedElement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getGroup() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getGroupedElement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMModel getModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__STEREOTYPE:
				return getStereotype();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__TAGGED_VALUE:
				return getTaggedValue();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__NAME:
				return getName();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__SOURCE:
				return getSource();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__RELATION:
				return getRelation();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__ABSTRACTION:
				return getAbstraction();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__IMPLEMENTATION:
				return getImplementation();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT:
				return getGroupedComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__STEREOTYPE:
				getStereotype().clear();
				getStereotype().addAll((Collection<? extends Stereotype>)newValue);
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends ExtendedValue>)newValue);
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends AbstractPlatformRelationship>)newValue);
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends AbstractCodeElement>)newValue);
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT:
				getGroupedComponent().clear();
				getGroupedComponent().addAll((Collection<? extends DeployedComponent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__STEREOTYPE:
				getStereotype().clear();
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__SOURCE:
				getSource().clear();
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__RELATION:
				getRelation().clear();
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__ABSTRACTION:
				getAbstraction().clear();
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT:
				getGroupedComponent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__STEREOTYPE:
				return stereotype != null && !stereotype.isEmpty();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__SOURCE:
				return source != null && !source.isEmpty();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__RELATION:
				return relation != null && !relation.isEmpty();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT:
				return groupedComponent != null && !groupedComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DeployedSoftwareSystemImpl
