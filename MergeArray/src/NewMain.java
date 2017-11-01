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
        Object[] obj1 = {"ahmed", 1, true, 'w'};
        Object[] obj2 = {"abdul", 7, true, 's', 123};
        Object[] objR;
        MergeArray ma = new MergeArray(obj1, obj2);
        objR = ma.MergeTwoArray();
        for (Object x : objR) {
            System.out.println(x);
        }
    }
}


