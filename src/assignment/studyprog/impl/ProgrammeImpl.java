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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment.studyprog.impl.ProgrammeImpl#getProgrammeName <em>Programme Name</em>}</li>
 *   <li>{@link assignment.studyprog.impl.ProgrammeImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link assignment.studyprog.impl.ProgrammeImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link assignment.studyprog.impl.ProgrammeImpl#getNeededCredits <em>Needed Credits</em>}</li>
 *   <li>{@link assignment.studyprog.impl.ProgrammeImpl#getTotalSemesters <em>Total Semesters</em>}</li>
 *   <li>{@link assignment.studyprog.impl.ProgrammeImpl#getStartYear <em>Start Year</em>}</li>
 *   <li>{@link assignment.studyprog.impl.ProgrammeImpl#getEndYear <em>End Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getProgrammeName() <em>Programme Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgrammeName() <em>Programme Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeName()
	 * @generated
	 * @ordered
	 */
	protected String programmeName = PROGRAMME_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * The default value of the '{@link #getNeededCredits() <em>Needed Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int NEEDED_CREDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeededCredits() <em>Needed Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededCredits()
	 * @generated
	 * @ordered
	 */
	protected int neededCredits = NEEDED_CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalSemesters() <em>Total Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSemesters()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_SEMESTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalSemesters() <em>Total Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSemesters()
	 * @generated
	 * @ordered
	 */
	protected int totalSemesters = TOTAL_SEMESTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected static final int START_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected int startYear = START_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndYear() <em>End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndYear()
	 * @generated
	 * @ordered
	 */
	protected static final int END_YEAR_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogPackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgrammeName() {
		return programmeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgrammeName(String newProgrammeName) {
		String oldProgrammeName = programmeName;
		programmeName = newProgrammeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.PROGRAMME__PROGRAMME_NAME, oldProgrammeName, programmeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentEList<Specialization>(Specialization.class, this, StudyprogPackage.PROGRAMME__SPECIALIZATIONS);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, StudyprogPackage.PROGRAMME__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNeededCredits() {
		return neededCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeededCredits(int newNeededCredits) {
		int oldNeededCredits = neededCredits;
		neededCredits = newNeededCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.PROGRAMME__NEEDED_CREDITS, oldNeededCredits, neededCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalSemesters() {
		return totalSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalSemesters(int newTotalSemesters) {
		int oldTotalSemesters = totalSemesters;
		totalSemesters = newTotalSemesters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.PROGRAMME__TOTAL_SEMESTERS, oldTotalSemesters, totalSemesters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartYear() {
		return startYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartYear(int newStartYear) {
		int oldStartYear = startYear;
		startYear = newStartYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.PROGRAMME__START_YEAR, oldStartYear, startYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getEndYear() {
		// TODO: implement this method to return the 'End Year' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		
		return this.startYear + (this.totalSemesters / 2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogPackage.PROGRAMME__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case StudyprogPackage.PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
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
			case StudyprogPackage.PROGRAMME__PROGRAMME_NAME:
				return getProgrammeName();
			case StudyprogPackage.PROGRAMME__SEMESTERS:
				return getSemesters();
			case StudyprogPackage.PROGRAMME__SPECIALIZATIONS:
				return getSpecializations();
			case StudyprogPackage.PROGRAMME__NEEDED_CREDITS:
				return getNeededCredits();
			case StudyprogPackage.PROGRAMME__TOTAL_SEMESTERS:
				return getTotalSemesters();
			case StudyprogPackage.PROGRAMME__START_YEAR:
				return getStartYear();
			case StudyprogPackage.PROGRAMME__END_YEAR:
				return getEndYear();
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
			case StudyprogPackage.PROGRAMME__PROGRAMME_NAME:
				setProgrammeName((String)newValue);
				return;
			case StudyprogPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyprogPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyprogPackage.PROGRAMME__NEEDED_CREDITS:
				setNeededCredits((Integer)newValue);
				return;
			case StudyprogPackage.PROGRAMME__TOTAL_SEMESTERS:
				setTotalSemesters((Integer)newValue);
				return;
			case StudyprogPackage.PROGRAMME__START_YEAR:
				setStartYear((Integer)newValue);
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
			case StudyprogPackage.PROGRAMME__PROGRAMME_NAME:
				setProgrammeName(PROGRAMME_NAME_EDEFAULT);
				return;
			case StudyprogPackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				return;
			case StudyprogPackage.PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case StudyprogPackage.PROGRAMME__NEEDED_CREDITS:
				setNeededCredits(NEEDED_CREDITS_EDEFAULT);
				return;
			case StudyprogPackage.PROGRAMME__TOTAL_SEMESTERS:
				setTotalSemesters(TOTAL_SEMESTERS_EDEFAULT);
				return;
			case StudyprogPackage.PROGRAMME__START_YEAR:
				setStartYear(START_YEAR_EDEFAULT);
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
			case StudyprogPackage.PROGRAMME__PROGRAMME_NAME:
				return PROGRAMME_NAME_EDEFAULT == null ? programmeName != null : !PROGRAMME_NAME_EDEFAULT.equals(programmeName);
			case StudyprogPackage.PROGRAMME__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case StudyprogPackage.PROGRAMME__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case StudyprogPackage.PROGRAMME__NEEDED_CREDITS:
				return neededCredits != NEEDED_CREDITS_EDEFAULT;
			case StudyprogPackage.PROGRAMME__TOTAL_SEMESTERS:
				return totalSemesters != TOTAL_SEMESTERS_EDEFAULT;
			case StudyprogPackage.PROGRAMME__START_YEAR:
				return startYear != START_YEAR_EDEFAULT;
			case StudyprogPackage.PROGRAMME__END_YEAR:
				return getEndYear() != END_YEAR_EDEFAULT;
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
		result.append(" (programmeName: ");
		result.append(programmeName);
		result.append(", neededCredits: ");
		result.append(neededCredits);
		result.append(", totalSemesters: ");
		result.append(totalSemesters);
		result.append(", startYear: ");
		result.append(startYear);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
