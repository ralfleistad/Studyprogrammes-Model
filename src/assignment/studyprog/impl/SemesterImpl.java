/**
 */
package assignment.studyprog.impl;

import assignment.studyprog.ElectiveCourse;
import assignment.studyprog.MandatoryCourse;
import assignment.studyprog.Semester;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment.studyprog.impl.SemesterImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link assignment.studyprog.impl.SemesterImpl#getElective <em>Elective</em>}</li>
 *   <li>{@link assignment.studyprog.impl.SemesterImpl#getSemesterNum <em>Semester Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected EList<MandatoryCourse> mandatory;

	/**
	 * The cached value of the '{@link #getElective() <em>Elective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElective()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectiveCourse> elective;

	/**
	 * The default value of the '{@link #getSemesterNum() <em>Semester Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNum()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTER_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemesterNum() <em>Semester Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNum()
	 * @generated
	 * @ordered
	 */
	protected int semesterNum = SEMESTER_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MandatoryCourse> getMandatory() {
		if (mandatory == null) {
			mandatory = new EObjectContainmentEList<MandatoryCourse>(MandatoryCourse.class, this, StudyprogPackage.SEMESTER__MANDATORY);
		}
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectiveCourse> getElective() {
		if (elective == null) {
			elective = new EObjectContainmentEList<ElectiveCourse>(ElectiveCourse.class, this, StudyprogPackage.SEMESTER__ELECTIVE);
		}
		return elective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSemesterNum() {
		return semesterNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesterNum(int newSemesterNum) {
		int oldSemesterNum = semesterNum;
		semesterNum = newSemesterNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.SEMESTER__SEMESTER_NUM, oldSemesterNum, semesterNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogPackage.SEMESTER__MANDATORY:
				return ((InternalEList<?>)getMandatory()).basicRemove(otherEnd, msgs);
			case StudyprogPackage.SEMESTER__ELECTIVE:
				return ((InternalEList<?>)getElective()).basicRemove(otherEnd, msgs);
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
			case StudyprogPackage.SEMESTER__MANDATORY:
				return getMandatory();
			case StudyprogPackage.SEMESTER__ELECTIVE:
				return getElective();
			case StudyprogPackage.SEMESTER__SEMESTER_NUM:
				return getSemesterNum();
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
			case StudyprogPackage.SEMESTER__MANDATORY:
				getMandatory().clear();
				getMandatory().addAll((Collection<? extends MandatoryCourse>)newValue);
				return;
			case StudyprogPackage.SEMESTER__ELECTIVE:
				getElective().clear();
				getElective().addAll((Collection<? extends ElectiveCourse>)newValue);
				return;
			case StudyprogPackage.SEMESTER__SEMESTER_NUM:
				setSemesterNum((Integer)newValue);
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
			case StudyprogPackage.SEMESTER__MANDATORY:
				getMandatory().clear();
				return;
			case StudyprogPackage.SEMESTER__ELECTIVE:
				getElective().clear();
				return;
			case StudyprogPackage.SEMESTER__SEMESTER_NUM:
				setSemesterNum(SEMESTER_NUM_EDEFAULT);
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
			case StudyprogPackage.SEMESTER__MANDATORY:
				return mandatory != null && !mandatory.isEmpty();
			case StudyprogPackage.SEMESTER__ELECTIVE:
				return elective != null && !elective.isEmpty();
			case StudyprogPackage.SEMESTER__SEMESTER_NUM:
				return semesterNum != SEMESTER_NUM_EDEFAULT;
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
		result.append(" (semesterNum: ");
		result.append(semesterNum);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
