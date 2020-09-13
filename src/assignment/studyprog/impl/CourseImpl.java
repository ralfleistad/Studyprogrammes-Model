/**
 */
package assignment.studyprog.impl;

import assignment.studyprog.Course;
import assignment.studyprog.StudyprogPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment.studyprog.impl.CourseImpl#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link assignment.studyprog.impl.CourseImpl#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link assignment.studyprog.impl.CourseImpl#getCourseCredit <em>Course Credit</em>}</li>
 *   <li>{@link assignment.studyprog.impl.CourseImpl#getCourseDescription <em>Course Description</em>}</li>
 *   <li>{@link assignment.studyprog.impl.CourseImpl#getCourseGroup <em>Course Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected String courseName = COURSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected String courseCode = COURSE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseCredit() <em>Course Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCredit()
	 * @generated
	 * @ordered
	 */
	protected static final double COURSE_CREDIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCourseCredit() <em>Course Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCredit()
	 * @generated
	 * @ordered
	 */
	protected double courseCredit = COURSE_CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseDescription() <em>Course Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseDescription() <em>Course Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseDescription()
	 * @generated
	 * @ordered
	 */
	protected String courseDescription = COURSE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseGroup() <em>Course Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseGroup() <em>Course Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroup()
	 * @generated
	 * @ordered
	 */
	protected String courseGroup = COURSE_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseName(String newCourseName) {
		String oldCourseName = courseName;
		courseName = newCourseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.COURSE__COURSE_NAME, oldCourseName, courseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseCode(String newCourseCode) {
		String oldCourseCode = courseCode;
		courseCode = newCourseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.COURSE__COURSE_CODE, oldCourseCode, courseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCourseCredit() {
		return courseCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseCredit(double newCourseCredit) {
		double oldCourseCredit = courseCredit;
		courseCredit = newCourseCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.COURSE__COURSE_CREDIT, oldCourseCredit, courseCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseDescription() {
		return courseDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseDescription(String newCourseDescription) {
		String oldCourseDescription = courseDescription;
		courseDescription = newCourseDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.COURSE__COURSE_DESCRIPTION, oldCourseDescription, courseDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseGroup() {
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseGroup(String newCourseGroup) {
		String oldCourseGroup = courseGroup;
		courseGroup = newCourseGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogPackage.COURSE__COURSE_GROUP, oldCourseGroup, courseGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogPackage.COURSE__COURSE_NAME:
				return getCourseName();
			case StudyprogPackage.COURSE__COURSE_CODE:
				return getCourseCode();
			case StudyprogPackage.COURSE__COURSE_CREDIT:
				return getCourseCredit();
			case StudyprogPackage.COURSE__COURSE_DESCRIPTION:
				return getCourseDescription();
			case StudyprogPackage.COURSE__COURSE_GROUP:
				return getCourseGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogPackage.COURSE__COURSE_NAME:
				setCourseName((String)newValue);
				return;
			case StudyprogPackage.COURSE__COURSE_CODE:
				setCourseCode((String)newValue);
				return;
			case StudyprogPackage.COURSE__COURSE_CREDIT:
				setCourseCredit((Double)newValue);
				return;
			case StudyprogPackage.COURSE__COURSE_DESCRIPTION:
				setCourseDescription((String)newValue);
				return;
			case StudyprogPackage.COURSE__COURSE_GROUP:
				setCourseGroup((String)newValue);
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
			case StudyprogPackage.COURSE__COURSE_NAME:
				setCourseName(COURSE_NAME_EDEFAULT);
				return;
			case StudyprogPackage.COURSE__COURSE_CODE:
				setCourseCode(COURSE_CODE_EDEFAULT);
				return;
			case StudyprogPackage.COURSE__COURSE_CREDIT:
				setCourseCredit(COURSE_CREDIT_EDEFAULT);
				return;
			case StudyprogPackage.COURSE__COURSE_DESCRIPTION:
				setCourseDescription(COURSE_DESCRIPTION_EDEFAULT);
				return;
			case StudyprogPackage.COURSE__COURSE_GROUP:
				setCourseGroup(COURSE_GROUP_EDEFAULT);
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
			case StudyprogPackage.COURSE__COURSE_NAME:
				return COURSE_NAME_EDEFAULT == null ? courseName != null : !COURSE_NAME_EDEFAULT.equals(courseName);
			case StudyprogPackage.COURSE__COURSE_CODE:
				return COURSE_CODE_EDEFAULT == null ? courseCode != null : !COURSE_CODE_EDEFAULT.equals(courseCode);
			case StudyprogPackage.COURSE__COURSE_CREDIT:
				return courseCredit != COURSE_CREDIT_EDEFAULT;
			case StudyprogPackage.COURSE__COURSE_DESCRIPTION:
				return COURSE_DESCRIPTION_EDEFAULT == null ? courseDescription != null : !COURSE_DESCRIPTION_EDEFAULT.equals(courseDescription);
			case StudyprogPackage.COURSE__COURSE_GROUP:
				return COURSE_GROUP_EDEFAULT == null ? courseGroup != null : !COURSE_GROUP_EDEFAULT.equals(courseGroup);
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
		result.append(" (courseName: ");
		result.append(courseName);
		result.append(", courseCode: ");
		result.append(courseCode);
		result.append(", courseCredit: ");
		result.append(courseCredit);
		result.append(", courseDescription: ");
		result.append(courseDescription);
		result.append(", courseGroup: ");
		result.append(courseGroup);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
