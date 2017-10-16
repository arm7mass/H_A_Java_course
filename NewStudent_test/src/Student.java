
class Student {

    int StudentNumber;
    String StudentName;
    String StudentCode;
    String BranchName;

    String[] getAllData() {
        String strAll[] = {String.valueOf(StudentNumber), StudentName, StudentCode, BranchName};
        return strAll;
    }

    String getAllDataInString() {
        String strAll = String.valueOf(StudentNumber) + ";" + StudentName + ";" + StudentCode + ";" + BranchName;
        return strAll;
    }

}
