package assignment.studyprog.html

import assignment.studyprog.Faculty
import org.eclipse.emf.ecore.EObject
import assignment.studyprog.Programme
import assignment.studyprog.Semester
import assignment.studyprog.Specialization
import assignment.studyprog.MandatoryCourse
import assignment.studyprog.ElectiveCourse

// «»

class Studyprog2TextGenerator {
	
	def String generateHTML(Faculty fac) {
		generateHTML(fac, new StringBuilder).toString();
	}
	
	def CharSequence generateHTML(Faculty fac, StringBuilder sb) {
		sb << '''
<html>
<head>
	<title>Faculty</title>
	<meta charset="utf-8" />
</head>
<body>

'''

	fac.programmes.forEach[generate(it, sb)]
	
	sb << '''
</body>
</html>
'''

	}
	
	def dispatch void generate(Programme programme, StringBuilder sb) {
		sb << '''
		<h1>Programme: «programme.programmeName»</h1>
		'''
		
		programme.semesters.forEach[generate(it, sb)]
		
		programme.specializations.forEach[generate(it, sb)]
	}
	
	def dispatch void generate(Semester semester, StringBuilder sb) {
		sb << '''
		<h2>Semester «semester.semesterNum»</h2>
		'''
		
		sb << '''
		<h3>Mandatory Courses</h3>'''
		semester.mandatory.forEach[generate(it, sb)]
		
		sb << '''
		<h3>Electivee Courses</h3>'''
		semester.elective.forEach[generate(it, sb)]
	}
	
	def dispatch void generate(Specialization specialization, StringBuilder sb) {
		sb << '''
		<h2>Specialization: «specialization.specializationName»</h2>
		'''
		
		specialization.semesters.forEach[generate(it, sb)]
	}
	
	def dispatch void generate(MandatoryCourse mand, StringBuilder sb) {
		sb << '''
		<div class="course">
			<h4 id="«mand.courseCode»">«mand.courseCode» «mand.courseName»</h4>
			<p>«mand.courseDescription»</p>
			<p>Group: «mand.courseGroup»</p>
			<p>Credits: «mand.courseCredit»</p></br >
		</div>
		
		'''
	}
	
	def dispatch void generate(ElectiveCourse elect, StringBuilder sb) {
		sb << '''
		<div class="course">
			<h4 id="«elect.courseCode»">«elect.courseCode» «elect.courseName»</h4>
			<p>«elect.courseDescription»</p>
			<p>Group: «elect.courseGroup»</p>
			<p>Credits: «elect.courseCredit»</p></br >
		</div>
		
		'''
	}

	// << operator
	def static StringBuilder operator_doubleLessThan(StringBuilder stringBuilder, Object o) {
		return stringBuilder.append(o);
	}
	
	/*
	// << operator
	def StringBuilder operator_doubleLessThan(StringBuilder stringBuilder, EObject eObject) {
		generateOutput(eObject, stringBuilder)
		return stringBuilder;
	}
	*/
	
}