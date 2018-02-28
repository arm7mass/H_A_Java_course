package genericc;

public class MyClass1<MyType> {

    public MyType mytype;

    public void printtype() {
        System.out.println(mytype.getClass().getName());
    }

}
