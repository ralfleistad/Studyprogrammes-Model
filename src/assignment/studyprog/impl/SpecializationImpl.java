/**
 */
package assignment.studyprog.impl;

import assignment.studyprog.Programme;
import assignment.studyprog.Semester;
import assignment.studyprog.Specialization;
import assignment.studyprog.StudyprogPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment.studyprog.impl.SpecializationImpl#getSpecializationName <em>Specialization Name</em>}</li>
 *   <li>{@link assignment.studyprog.impl.SpecializationImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link assignment.studyprog.impl.SpecializationImpl#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The default value of the '{@link #getSpecializationName() <em>Specialization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIALIZATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecializationName() <em>Specialization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationName()
	 * @generated
	 * @ordered
	 */
	protected String specializationName = SPECIALIZATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecializationName() {
		return specializationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializationName(String newSpecializationName) {
		String oldSpecializationName = specializationName;
		specializationName = newSpecializationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.SPECIALIZATION__SPECIALIZATION_NAME, oldSpecializationName, specializationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme getSpecializations() {
		if (eContainerFeatureID() != StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializations(Programme newSpecializations, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecializations, StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializations(Programme newSpecializations) {
		if (newSpecializations != eInternalContainer() || (eContainerFeatureID() != StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS && newSpecializations != null)) {
			if (EcoreUtil.isAncestor(this, newSpecializations))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecializations != null)
				msgs = ((InternalEObject)newSpecializations).eInverseAdd(this, StudyprogPackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
			msgs = basicSetSpecializations(newSpecializations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS, newSpecializations, newSpecializations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, StudyprogPackage.SPECIALIZATION__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecializations((Programme)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS:
				return basicSetSpecializations(null, msgs);
			case StudyprogPackage.SPECIALIZATION__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS:
				return eInternalContainer().eInverseRemove(this, StudyprogPackage.PROGRAMME__SPECIALIZATIONS, Programme.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATION_NAME:
				return getSpecializationName();
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS:
				return getSpecializations();
			case StudyprogPackage.SPECIALIZATION__SEMESTERS:
				return getSemesters();
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
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATION_NAME:
				setSpecializationName((String)newValue);
				return;
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS:
				setSpecializations((Programme)newValue);
				return;
			case StudyprogPackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
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
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATION_NAME:
				setSpecializationName(SPECIALIZATION_NAME_EDEFAULT);
				return;
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS:
				setSpecializations((Programme)null);
				return;
			case StudyprogPackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
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
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATION_NAME:
				return SPECIALIZATION_NAME_EDEFAULT == null ? specializationName != null : !SPECIALIZATION_NAME_EDEFAULT.equals(specializationName);
			case StudyprogPackage.SPECIALIZATION__SPECIALIZATIONS:
				return getSpecializations() != null;
			case StudyprogPackage.SPECIALIZATION__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (specializationName: ");
		result.append(specializationName);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
