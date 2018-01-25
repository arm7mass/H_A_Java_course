package test_interface;

public class Test_Interface {
    public static void runadd (calc1 c){
       System.out.println(c.add(3, 4));
    }

    public static void main(String[] args) {
        calc c = new calc();
        calcplus cp = new calcplus();
        System.out.println(c.add(8, 4));
        System.out.println(c.sub(8, 4));
        System.out.println(c.multi(8, 4));
        System.out.println(c.div(8, 4));
        runadd(c);
        runadd(cp);
    }

}
