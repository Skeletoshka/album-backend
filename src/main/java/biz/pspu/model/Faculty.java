package biz.pspu.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "faculty", schema = "dbo")
public class Faculty {

    @Id
    @Column(name = "faculty_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer facultyId;

    @Column(name = "faculty_name", nullable = false)
    @NotNull(message = "Поле \"Полное название факультета\" не может быть пустым")
    @Size(max = 100, message = "Поле \"Полное название факультета\" не может содержать больше {max} символов")
    private String facultyName;

    @Column(name = "faculty_shortname", nullable = false)
    @NotNull(message = "Поле \"Короткое название факультета\" не может быть пустым")
    @Size(max = 20, message = "Поле \"Короткое название факультета\" не может содержать больше {max} символов")
    private String facultyShortName;

    public Faculty() {
    }

    public Faculty(Integer facultyId,
                   String facultyName,
                   String facultyShortName) {
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
