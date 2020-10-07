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
		<h1>«programme.programmeName»</h1>
		'''
		
		programme.semesters.forEach[generate(it, sb)]
		
		programme.specializations.forEach[generate(it, sb)]
	}
	
	def dispatch void generate(Semester semester, StringBuilder sb) {
		sb << '''
		<h2>Semester «semester.semesterNum»</h2>
		'''
		
		semester.mandatory.forEach[generate(it, sb)]
		semester.elective.forEach[generate(it, sb)]
	}
	
	def dispatch void generate(Specialization specialization, StringBuilder sb) {
		sb << '''
		<h2>«specialization.specializationName»</h2>
		'''
		
		specialization.semesters.forEach[generate(it, sb)]
	}
	
	def dispatch void generate(MandatoryCourse mand, StringBuilder sb) {
		
	}
	
	def dispatch void generate(ElectiveCourse elect, StringBuilder sb) {
		
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