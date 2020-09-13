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
