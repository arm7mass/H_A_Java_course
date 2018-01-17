package enumexample;

public class EnumExample {

    public static void main(String[] args) {
        Employee e = new Employee(Floor.f1, FloorType.in);
        e.EmpNo = 12554;
        e.EmpName = "Abdulrhman";
        e.EmpAdress = "Doha";
        /*
        e.WorkFloor = Floor.f3;
        e.WorkFloor.setNum(1000000000);
        System.out.println(e.WorkFloor.getNum() + " " + e.WorkFloor.getName());
        e.WorkFloor = Floor.f5;
        System.out.println(e.WorkFloor.getNum() + " " + e.WorkFloor.getName());
         */

        System.out.println(e.getWorkFloor().getNum());
        System.out.println(e.getWorkFloor().name());
        System.out.println(e.type);
    }

}
