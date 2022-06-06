package biz.pspu.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student", schema = "dbo")
public class Student {

    @Id
    @Column(name = "student_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    @Column(name = "student_name", nullable = false)
    @NotNull(message = "Поле \"Имя студента\" не может быть пустым")
    @Size(max = 50, message = "Поле \"Имя студента\" не может содержать больше {max} символов")
    private String studentName;

    @Column(name = "student_lastname", nullable = false)
    @NotNull(message = "Поле \"Фамилия студента\" не может быть пустым")
    @Size(max = 50, message = "Поле \"Фамилия студента\" не может содержать больше {max} символов")
    private String studentLastName;

    @Column(name = "student_middlename")
    @NotNull(message = "Поле \"Отчество студента\" не может быть пустым")
    @Size(max = 50, message = "Поле \"Отчество студента\" не может содержать больше {max} символов")
    private String studentMiddleName;

    @Column(name = "faculty_id", nullable = false)
    @NotNull(message = "Поле \"Факультет студента\" не может быть пустым")
    private Integer facultyId;

    @Column(name = "student_photopath", nullable = false)
    @NotNull(message = "Поле \"Фото студента\" не может быть пустым")
    @Size(max = 50, message = "Поле \"Фото студента\" не может содержать больше {max} символов")
    private String studentPhotoPath;

    @Column(name = "student_description")
    @NotNull(message = "Поле \"Описание заслуг студента\" не может быть пустым")
    private String studentDescription;

    @Column(name = "student_studyend")
    @NotNull(message = "Поле \"Год окончания студента\" не может быть пустым")
    private Integer studentStudyEnd;

    @Column(name = "student_specialcase", nullable = false)
    @NotNull(message = "Поле \"Особый случай студента\" не может быть пустым")
    private Integer studentSpecialCase;

    public Student() {
    }

    public Student(Integer studentId,
                   String studentName,
                   String studentLastName,
                   String studentMiddleName,
                   Integer facultyId,
                   String studentPhotoPath,
                   String studentDescription,
                   Integer studentStudyEnd,
                   Integer studentSpecialCase) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.studentMiddleName = studentMiddleName;
        this.facultyId = facultyId;
        this.studentPhotoPath = studentPhotoPath;
        this.studentDescription = studentDescription;
        this.studentStudyEnd = studentStudyEnd;
        this.studentSpecialCase = studentSpecialCase;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentMiddleName() {
        return studentMiddleName;
    }

    public void setStudentMiddleName(String studentMiddleName) {
        this.studentMiddleName = studentMiddleName;
    }

    public Integer getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public String getStudentPhotoPath() {
        return studentPhotoPath;
    }

    public void setStudentPhotoPath(String studentPhotoPath) {
        this.studentPhotoPath = studentPhotoPath;
    }

    public String getStudentDescription() {
        return studentDescription;
    }

    public void setStudentDescription(String studentDescription) {
        this.studentDescription = studentDescription;
    }

    public Integer getStudentStudyEnd() {
        return studentStudyEnd;
    }

    public void setStudentStudyEnd(Integer studentStudyEnd) {
        this.studentStudyEnd = studentStudyEnd;
    }

    public Integer getStudentSpecialCase() {
        return studentSpecialCase;
    }

    public void setStudentSpecialCase(Integer studentSpecialCase) {
        this.studentSpecialCase = studentSpecialCase;
    }
}
