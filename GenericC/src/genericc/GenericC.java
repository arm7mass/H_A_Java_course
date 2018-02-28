package genericc;

public class GenericC {

    public static void main(String[] args) {
        MyClass1<String> c1 = new MyClass1<String>();
        c1.mytype = "abdul";
        c1.printtype();
        MyClass1<Integer> c2 = new MyClass1<Integer>();
        c2.mytype = 122;
        c2.printtype();
        MyClass1<Boolean> c3 = new MyClass1<Boolean>();
        c3.mytype = true;
        c3.printtype();

        MyClass2<String, Integer, Boolean> MyC = new MyClass2<String, Integer, Boolean>();
        MyC.t1 = "abdul";
        MyC.t2 = 1255;
        MyC.t3 = true;
        MyC.printtype();

    }

}
