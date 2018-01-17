package enumexample;

public class Employee {

    public int EmpNo;
    public String EmpName;
    public String EmpAdress;
    private Floor WorkFloor;
    public FloorType type;

    public Employee(Floor WorkFloor, FloorType type) {
        this.WorkFloor = WorkFloor;
        this.type = type;
    }

    public Floor getWorkFloor() {
        return WorkFloor;
    }

    public void setWorkFloor(Floor WorkFloor) {
        this.WorkFloor = WorkFloor;
    }

}
