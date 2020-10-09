# Studyprogrammes-Model
This is an assignment for the course *TDT4250 Advanced Software Design* at NTNU. This repository might be expanded as more assignments may build on top of this one.

## Assignment 1
The structure of this project is more or less identical to the structure of the project developed during lectures. 
The model contains studyprogrammes, specializations, semesters and courses. Additionally there are implemented constraints using both OCL and by manually writing.
Per definition of the assignment I've also used a EDataType for *courseCode* and a derivied feature to compute graduation year.

### Visualization of the model structure in PlantUML.
![This is the EMF ecore model at the time of submitting](/images/model_v_1.png)

### Constraints
The following constraint is implemented on the *Programme* class usin OCL.
![OCL constraint](/images/constraint_ocl_1.png)

The next constraint is manually written in the *StudyprogValidator* class. The diagnostics severity was also changed from 'ERROR' to 'WARNING'.
![Manually written constraint](/images/constraint_manual_1.png)

## Assignment 2
For this part of the project I've chosen to do a M2T (Model to text) transformation usin xtend.
Running the transformation is done by running the java file "Studyprog2TextGeneratorMain.java" which is in the package "assignment.studyprog.html", however, at the moment you will have to change the target URI in the same file.
The target URI points to a index.html file in the same package using an absolute path. This should be refactored to be more dynamic, which I will implement if I have enough time and can figure it out.
The method for getting a Faculty object uses "assignment.studyprog.example/Example.java" to create an URI and get a Faculty.xmi resource.

The resulting webpage is very plain and contains no styling, but gives a quick overview of some of the available programmes and specializations.
