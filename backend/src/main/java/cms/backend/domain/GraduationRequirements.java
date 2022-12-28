package cms.backend.domain;

public class GraduationRequirements {
    int admissionYear;
    int graduationCreteriaCredit;
    String graduationCriteriaName;

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public int getGraduationCreteriaCredit() {
        return graduationCreteriaCredit;
    }

    public void setGraduationCreteriaCredit(int graduationCreteriaCredit) {
        this.graduationCreteriaCredit = graduationCreteriaCredit;
    }

    public String getGraduationCriteriaName() {
        return graduationCriteriaName;
    }

    public void setGraduationCriteriaName(String graduationCriteriaName) {
        this.graduationCriteriaName = graduationCriteriaName;
    }
}
