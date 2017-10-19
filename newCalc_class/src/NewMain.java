
import java.util.Scanner;

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
        double num1=0 ;
        double num2=0;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter first number ");
        num1= s.nextDouble();
        System.out.println("please enetr your second number ");
        num2=s.nextDouble();
        calc c= new calc(num1,num2);
        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.multi());
        System.out.println(c.div());
        
    }
    
}
