package cms.backend.subject;

import java.util.List;

public class Subject {
    int year;
    int semester;
    int targetGrade;
    String title;
    int credit;
    String completionClassification;
    String abeek;
    int abeekCredit;
    List<Subject> preSubjects;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getTargetGrade() {
        return targetGrade;
    }

    public void setTargetGrade(int targetGrade) {
        this.targetGrade = targetGrade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCompletionClassification() {
        return completionClassification;
    }

    public void setCompletionClassification(String completionClassification) {
        this.completionClassification = completionClassification;
    }

    public String getAbeek() {
        return abeek;
    }

    public void setAbeek(String abeek) {
        this.abeek = abeek;
    }

    public int getAbeekCredit() {
        return abeekCredit;
    }

    public void setAbeekCredit(int abeekCredit) {
        this.abeekCredit = abeekCredit;
    }

    public List<Subject> getPreSubjects() {
        return preSubjects;
    }

    public void setPreSubjects(List<Subject> preSubjects) {
        this.preSubjects = preSubjects;
    }
}
