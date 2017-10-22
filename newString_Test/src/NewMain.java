
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

        //// Usage of String Array object/////////////
        ////option1
        String arr[] = new String[3];
        arr[0] = "abdul";
        arr[1] = "nada";
        arr[2] = "salem";
        StringTool c2 = new StringTool(arr);
        c2.printString();

        //////option2 
        String arr1[] = {"abdul", "salem", "Nada"};
        StringTool c3 = new StringTool(arr1);
        c3.printString();
        
        //////option3
        String[] arr2 = {"abdul1","salem1","nada1"},
                 arr3 = {"abdul2","salem2","nada2"},
                 arr4 = {"abdul3","salem3","nada3"};
        StringTool c4 = new StringTool(arr2);
        StringTool c5 = new StringTool(arr3);
        StringTool c6 = new StringTool(arr4);
        c4.printString();
        c5.printString();
        c6.printString();
        
        /////// option4
        StringTool x = new StringTool(arr2);
        x.printString();
        x.texts=arr3;
        x.printString();
        x.texts=arr4;
        x.printString();
        

    }

}
