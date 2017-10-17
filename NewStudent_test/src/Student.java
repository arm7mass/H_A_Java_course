
class Student {

    public int StudentNumber;
    public String StudentName;
    public String StudentCode;
    public String BranchName;
    private double grade ;

    public String[] getAllData() {
        String strAll[] = {String.valueOf(StudentNumber), StudentName, StudentCode, BranchName};
        return strAll;
    }

    public String getAllDataInString() {
        String strAll = String.valueOf(StudentNumber) + ";" + StudentName + ";" + StudentCode + ";" + BranchName;
        return strAll;
    }

}
