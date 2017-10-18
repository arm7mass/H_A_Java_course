/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARM-PC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student(77,"abdul");
       // s1.StudentNumber = 1234;
       // s1.StudentName = "abdul";
        s1.StudentCode = "aaa111";
        s1.BranchName = "biomed";
        System.out.println(s1.getAllDataInString());
        System.out.println(s1.getAllData()[0]);
        ////////////////////////////
        
        Student s2 = new Student(88,"salem");
        //s2.StudentNumber = 4567;
        // s2.StudentName = "salem";
        s2.StudentCode = "bbb2222";
        s2.BranchName = "Doctor";
        System.out.println(s2.getAllDataInString());
        System.out.println(s2.getAllData()[0]);
        ////////////////////////////
        
        Student s3 = new Student(100,"nada");
        System.out.println(s3.getAllDataInString());
    }

}
