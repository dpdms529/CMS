package cms.backend.domain;

public class Credit {
    int ge; //교양
    int basicGE; //기초교양
    int coreGE; // 핵심 교양
    int generalGE; // 일반 교양
    int otherGE; // 기타 교양
    int geTotal;
    int requiredMajor;
    int selectiveMajor;
    int commonRequired;
    int generalSelection;
    int bsm;
    int majorGE;
    int design;
    int engineeringSubject;

    public int getGe() {
        return ge;
    }

    public void setGe(int ge) {
        this.ge = ge;
    }

    public int getBasicGE() {
        return basicGE;
    }

    public void setBasicGE(int basicGE) {
        this.basicGE = basicGE;
    }

    public int getCoreGE() {
        return coreGE;
    }

    public void setCoreGE(int coreGE) {
        this.coreGE = coreGE;
    }

    public int getGeneralGE() {
        return generalGE;
    }

    public void setGeneralGE(int generalGE) {
        this.generalGE = generalGE;
    }

    public int getOtherGE() {
        return otherGE;
    }

    public void setOtherGE(int otherGE) {
        this.otherGE = otherGE;
    }

    public int getGeTotal() {
        return geTotal;
    }

    public void setGeTotal(int geTotal) {
        this.geTotal = geTotal;
    }

    public int getRequiredMajor() {
        return requiredMajor;
    }

    public void setRequiredMajor(int requiredMajor) {
        this.requiredMajor = requiredMajor;
    }

    public int getSelectiveMajor() {
        return selectiveMajor;
    }

    public void setSelectiveMajor(int selectiveMajor) {
        this.selectiveMajor = selectiveMajor;
    }

    public int getCommonRequired() {
        return commonRequired;
    }

    public void setCommonRequired(int commonRequired) {
        this.commonRequired = commonRequired;
    }

    public int getGeneralSelection() {
        return generalSelection;
    }

    public void setGeneralSelection(int generalSelection) {
        this.generalSelection = generalSelection;
    }

    public int getBsm() {
        return bsm;
    }

    public void setBsm(int bsm) {
        this.bsm = bsm;
    }

    public int getMajorGE() {
        return majorGE;
    }

    public void setMajorGE(int majorGE) {
        this.majorGE = majorGE;
    }

    public int getDesign() {
        return design;
    }

    public void setDesign(int design) {
        this.design = design;
    }

    public int getEngineeringSubject() {
        return engineeringSubject;
    }

    public void setEngineeringSubject(int engineeringSubject) {
        this.engineeringSubject = engineeringSubject;
    }
}
