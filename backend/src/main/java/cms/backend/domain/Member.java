package cms.backend.domain;

import javax.security.auth.Subject;
import java.util.List;

public class Member {
    String studentId;
    String name;
    String password;
    List<Subject> takenSubjects;
    Credit credit;

    public Member(String studentId, String name, String password, List<Subject> takenSubjects, Credit credit) {
        this.studentId = studentId;
        this.name = name;
        this.password = password;
        this.takenSubjects = takenSubjects;
        this.credit = credit;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Subject> getTakenSubjects() {
        return takenSubjects;
    }

    public void setTakenSubjects(List<Subject> takenSubjects) {
        this.takenSubjects = takenSubjects;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }
}
