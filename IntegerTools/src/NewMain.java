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
        int nums[] = {2, 4, 6, 8, 10};
        IntegerTools i = new IntegerTools(nums);
        //with return 
        System.out.println(i.getSumArray());
        //without return 
        i.getSum_Array();
        
        int nums1[]= {1,2,3,4};
        int nums2[]= {4,5,6,7};
        int result[];
        IntegerTools i1 = new IntegerTools(nums1,nums2);
        result = i1.getAdditionalTwoArray();
        for (int x : result ){
            System.out.println(x);
        }

    }

}
