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
        System.out.println("------------------");
        t.editRow(1, 2, "abdul10");
        t.editRow(0, 2, "abdul.abdul");
        System.out.println("get one Value :");
        System.out.println(t.getValue(0, 0));
        System.out.println(t.getRow(1)[1]);
        System.out.println("---------------");
        t.DeleteRow(2);
        t.PrintItems();
    }

}
