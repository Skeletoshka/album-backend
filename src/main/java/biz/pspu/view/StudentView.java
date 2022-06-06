package biz.pspu.view;

import javax.persistence.Column;

public class StudentView {

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_lastname")
    private String studentLastName;

    @Column(name = "student_middlename")
    private String studentMiddleName;

    @Column(name = "faculty_id")
    private Integer facultyId;

    @Column(name = "faculty_name")
    private String facultyName;

    @Column(name = "student_photopath")
    private String studentPhotoPath;

    @Column(name = "student_description")
    private String studentDescription;

    @Column(name = "student_studyend")
    private Integer studentStudyEnd;

    @Column(name = "student_specialcase")
    private Integer studentSpecialCase;

    public StudentView() {
    }

    public StudentView(Integer studentId,
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

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
