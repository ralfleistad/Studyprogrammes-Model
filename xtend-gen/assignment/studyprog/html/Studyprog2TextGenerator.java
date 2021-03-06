package assignment.studyprog.html;

import assignment.studyprog.ElectiveCourse;
import assignment.studyprog.Faculty;
import assignment.studyprog.MandatoryCourse;
import assignment.studyprog.Programme;
import assignment.studyprog.Semester;
import assignment.studyprog.Specialization;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Studyprog2TextGenerator {
  public String generateHTML(final Faculty fac) {
    StringBuilder _stringBuilder = new StringBuilder();
    return this.generateHTML(fac, _stringBuilder).toString();
  }
  
  public CharSequence generateHTML(final Faculty fac, final StringBuilder sb) {
    StringBuilder _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<title>Faculty</title>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<meta charset=\"utf-8\" />");
      _builder.newLine();
      _builder.append("</head>");
      _builder.newLine();
      _builder.append("<body>");
      _builder.newLine();
      _builder.newLine();
      Studyprog2TextGenerator.operator_doubleLessThan(sb, _builder);
      final Consumer<Programme> _function = (Programme it) -> {
        this.generate(it, sb);
      };
      fac.getProgrammes().forEach(_function);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("</body>");
      _builder_1.newLine();
      _builder_1.append("</html>");
      _builder_1.newLine();
      _xblockexpression = Studyprog2TextGenerator.operator_doubleLessThan(sb, _builder_1);
    }
    return _xblockexpression;
  }
  
  protected void _generate(final Programme programme, final StringBuilder sb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h1>Programme: ");
    String _programmeName = programme.getProgrammeName();
    _builder.append(_programmeName);
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    Studyprog2TextGenerator.operator_doubleLessThan(sb, _builder);
    final Consumer<Semester> _function = (Semester it) -> {
      this.generate(it, sb);
    };
    programme.getSemesters().forEach(_function);
    final Consumer<Specialization> _function_1 = (Specialization it) -> {
      this.generate(it, sb);
    };
    programme.getSpecializations().forEach(_function_1);
  }
  
  protected void _generate(final Semester semester, final StringBuilder sb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h2>Semester ");
    int _semesterNum = semester.getSemesterNum();
    _builder.append(_semesterNum);
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    Studyprog2TextGenerator.operator_doubleLessThan(sb, _builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("<h3>Mandatory Courses</h3>");
    Studyprog2TextGenerator.operator_doubleLessThan(sb, _builder_1);
    final Consumer<MandatoryCourse> _function = (MandatoryCourse it) -> {
      this.generate(it, sb);
    };
    semester.getMandatory().forEach(_function);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("<h3>Electivee Courses</h3>");
    Studyprog2TextGenerator.operator_doubleLessThan(sb, _builder_2);
    final Consumer<ElectiveCourse> _function_1 = (ElectiveCourse it) -> {
      this.generate(it, sb);
    };
    semester.getElective().forEach(_function_1);
  }
  
  protected void _generate(final Specialization specialization, final StringBuilder sb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h2>Specialization: ");
    String _specializationName = specialization.getSpecializationName();
    _builder.append(_specializationName);
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    Studyprog2TextGenerator.operator_doubleLessThan(sb, _builder);
    final Consumer<Semester> _function = (Semester it) -> {
      this.generate(it, sb);
    };
    specialization.getSemesters().forEach(_function);
  }
  
  protected void _generate(final MandatoryCourse mand, final StringBuilder sb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"course\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h4 id=\"");
    String _courseCode = mand.getCourseCode();
    _builder.append(_courseCode, "\t");
    _builder.append("\">");
    String _courseCode_1 = mand.getCourseCode();
    _builder.append(_courseCode_1, "\t");
    _builder.append(" ");
    String _courseName = mand.getCourseName();
    _builder.append(_courseName, "\t");
    _builder.append("</h4>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<p>");
    String _courseDescription = mand.getCourseDescription();
    _builder.append(_courseDescription, "\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<p>Group: ");
    String _courseGroup = mand.getCourseGroup();
    _builder.append(_courseGroup, "\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<p>Credits: ");
    double _courseCredit = mand.getCourseCredit();
    _builder.append(_courseCredit, "\t");
    _builder.append("</p></br >");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    Studyprog2TextGenerator.operator_doubleLessThan(sb, _builder);
  }
  
  protected void _generate(final ElectiveCourse elect, final StringBuilder sb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"course\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h4 id=\"");
    String _courseCode = elect.getCourseCode();
    _builder.append(_courseCode, "\t");
    _builder.append("\">");
    String _courseCode_1 = elect.getCourseCode();
    _builder.append(_courseCode_1, "\t");
    _builder.append(" ");
    String _courseName = elect.getCourseName();
    _builder.append(_courseName, "\t");
    _builder.append("</h4>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<p>");
    String _courseDescription = elect.getCourseDescription();
    _builder.append(_courseDescription, "\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<p>Group: ");
    String _courseGroup = elect.getCourseGroup();
    _builder.append(_courseGroup, "\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<p>Credits: ");
    double _courseCredit = elect.getCourseCredit();
    _builder.append(_courseCredit, "\t");
    _builder.append("</p></br >");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    Studyprog2TextGenerator.operator_doubleLessThan(sb, _builder);
  }
  
  public static StringBuilder operator_doubleLessThan(final StringBuilder stringBuilder, final Object o) {
    return stringBuilder.append(o);
  }
  
  public void generate(final EObject elect, final StringBuilder sb) {
    if (elect instanceof ElectiveCourse) {
      _generate((ElectiveCourse)elect, sb);
      return;
    } else if (elect instanceof MandatoryCourse) {
      _generate((MandatoryCourse)elect, sb);
      return;
    } else if (elect instanceof Programme) {
      _generate((Programme)elect, sb);
      return;
    } else if (elect instanceof Semester) {
      _generate((Semester)elect, sb);
      return;
    } else if (elect instanceof Specialization) {
      _generate((Specialization)elect, sb);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(elect, sb).toString());
    }
  }
}
