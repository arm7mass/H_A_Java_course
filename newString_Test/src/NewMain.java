
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
        String str;
        Scanner c = new Scanner(System.in);
        System.out.println("please enter your text ");
        str = c.nextLine();
        StringTool c1 = new StringTool(str);
        c1.PrintVharByChar();
        System.out.println("//////inreverse//////");
        c1.printcharBycharinverse();
    }

}
