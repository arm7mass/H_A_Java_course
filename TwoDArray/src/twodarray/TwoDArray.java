/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodarray;

/**
 *
 * @author ARM-PC
 */
public class TwoDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //two Dimensional Array
        String namesTables[][] = new String[2][3];
        namesTables[0][0] = "abdul1";
        namesTables[0][1] = "abdul2";
        namesTables[0][2] = "abdul3";
        namesTables[1][0] = "abdul4";
        namesTables[1][1] = "abdul5";
        namesTables[1][2] = "abdul6";
       // for loop to print  Two Dimensional Array ++++++++++
        for (int x = 0; x < namesTables.length; x++) {
            for (int y = 0; y < namesTables[x].length; y++) {
                System.out.println(namesTables[x][y]);
            }
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
        }
        //Enhanced for loop to print  Two Dimensional Array ++++++++++
        for (String str1[] : namesTables){
            for (String str2 : str1){
                System.out.print(str2+"  *  ");
            }
        }

    }

}
