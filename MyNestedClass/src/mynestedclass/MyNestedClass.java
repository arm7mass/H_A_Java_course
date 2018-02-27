package mynestedclass;

public class MyNestedClass {

    public static void main(String[] args) {
        Company com = new Company();
        Company.Department Dept = new Company.Department();
        Company.Building build = com.new Building();

    }

}
