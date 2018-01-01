/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritenceexample;

/**
 *
 * @author ARM-PC
 */
public class InheritenceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("abdul");
        Customer c = new Customer("Masoud");
        Student s = new Student("Salem");
        Employee e = new Employee("Salem");
        Doctor d = new Doctor("Nada");

        System.out.println(p.name);
        System.out.println(c.name);
        System.out.println(s.name);
        System.out.println(e.name);
        System.out.println(d.name);

    }

}
