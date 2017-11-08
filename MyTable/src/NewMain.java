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
        
        Table t = new Table(3);
        Object obj1[] = {"abdul1", "abdul2", "abdul3"};
        Object obj2[] = {"abdul4", "abdul5", "abdul6"};
        t.addNewRow(obj1);
        t.addNewRow(obj2);
        t.addNewRow(new Object[]{"abdul7", "abdul8", "abdul9"});
        t.PrintItems();
    }
    
}
