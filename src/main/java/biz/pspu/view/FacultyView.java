package biz.pspu.view;

import javax.persistence.Column;

public class FacultyView {

    @Column(name = "faculty_id")
    private Integer facultyId;

    @Column(name = "faculty_name")
    private String facultyName;

    @Column(name = "faculty_shortname")
    private String facultyShortName;

    public FacultyView() {
    }

    public FacultyView(Integer facultyId, String facultyName, String facultyShortName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyShortName = facultyShortName;
    }

    public Integer getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyShortName() {
        return facultyShortName;
    }

    public void setFacultyShortName(String facultyShortName) {
        this.facultyShortName = facultyShortName;
    }
}
