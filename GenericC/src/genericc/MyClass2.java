package genericc;

public class MyClass2<type1, type2, type3> {

    public type1 t1;
    public type2 t2;
    public type3 t3;

    public void printtype() {
        System.out.println(t1.getClass().getName());
        System.out.println(t2.getClass().getName());
        System.out.println(t3.getClass().getName());

    }

}
