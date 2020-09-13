/**
 */
package assignment.studyprog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment.studyprog.Programme#getProgrammeName <em>Programme Name</em>}</li>
 *   <li>{@link assignment.studyprog.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link assignment.studyprog.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link assignment.studyprog.Programme#getNeededCredits <em>Needed Credits</em>}</li>
 *   <li>{@link assignment.studyprog.Programme#getTotalSemesters <em>Total Semesters</em>}</li>
 *   <li>{@link assignment.studyprog.Programme#getStartYear <em>Start Year</em>}</li>
 *   <li>{@link assignment.studyprog.Programme#getEndYear <em>End Year</em>}</li>
 * </ul>
 *
 * @see assignment.studyprog.StudyprogPackage#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='programmeHasEnoughSemesters'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 programmeHasEnoughSemesters='self.specializations.semesters-&gt;size() + self.semesters-&gt;size() = self.totalSemesters'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Name</em>' attribute.
	 * @see #setProgrammeName(String)
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_ProgrammeName()
	 * @model
	 * @generated
	 */
	String getProgrammeName();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Programme#getProgrammeName <em>Programme Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Name</em>' attribute.
	 * @see #getProgrammeName()
	 * @generated
	 */
	void setProgrammeName(String value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.studyprog.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.studyprog.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_Semesters()
	 * @model containment="true" upper="6"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Needed Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed Credits</em>' attribute.
	 * @see #setNeededCredits(int)
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_NeededCredits()
	 * @model
	 * @generated
	 */
	int getNeededCredits();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Programme#getNeededCredits <em>Needed Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needed Credits</em>' attribute.
	 * @see #getNeededCredits()
	 * @generated
	 */
	void setNeededCredits(int value);

	/**
	 * Returns the value of the '<em><b>Total Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Semesters</em>' attribute.
	 * @see #setTotalSemesters(int)
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_TotalSemesters()
	 * @model
	 * @generated
	 */
	int getTotalSemesters();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Programme#getTotalSemesters <em>Total Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Semesters</em>' attribute.
	 * @see #getTotalSemesters()
	 * @generated
	 */
	void setTotalSemesters(int value);

	/**
	 * Returns the value of the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Year</em>' attribute.
	 * @see #setStartYear(int)
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_StartYear()
	 * @model
	 * @generated
	 */
	int getStartYear();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Programme#getStartYear <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Year</em>' attribute.
	 * @see #getStartYear()
	 * @generated
	 */
	void setStartYear(int value);

	/**
	 * Returns the value of the '<em><b>End Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Year</em>' attribute.
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_EndYear()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getEndYear();

} // Programme
