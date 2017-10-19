
// the class
public class Student {
// attributes 
    public int StudentNumber;
    public String StudentName;
    public String StudentCode;
    public String BranchName;
    private double grade;
    
// constructor   
    public Student(int Student_number , String Student_name ) {
        System.out.println(" constructor1 new student is created :\n ");
        StudentNumber = Student_number;
        StudentName = Student_name;
        StudentCode = "empty code";
        BranchName = "empty branch";
    }
    public Student (){
      System.out.println(" constructor2 new student is created :\n ");  
    }
    public Student(String Student_Code){
         System.out.println(" constructor3  new student is created :\n ");
        StudentCode = Student_Code;
    }
// method 1
    public String[] getAllData() {
        String strAll[] = {String.valueOf(StudentNumber), StudentName, StudentCode, BranchName};
        return strAll;
    }
    
// method 2
    public String getAllDataInString() {
        String strAll = String.valueOf(StudentNumber) + ";" + StudentName + ";" + StudentCode + ";" + BranchName;
        return strAll;
    }

}
