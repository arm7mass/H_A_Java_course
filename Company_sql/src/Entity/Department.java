package Entity;

import company_sql.Tools;
import javax.swing.JTable;

public class Department implements mainData {

    private int DeptNo;
    private String DeptName;
    private String Location;

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public void add() {
        String strInsert = "insert into department value (" + DeptNo + "," + "'" + DeptName + "'," + "'" + Location + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);// this is to check if the selected statement is excuted 
        if (isAdd) {
            Tools.msgBox("Department is Added ");
        }
    }

    @Override
    public void update() {
        String strUpdate = "update department set " + "DeptName" + DeptName + "," + "Location ' " + Location + "'" + "where DeptNo= " + DeptNo;
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if (isUpdate) {
            Tools.msgBox("Department is updated ");
        }

    }

    @Override
    public void delete() {
        String strDelete = "delete from department " + "where department No = " + DeptNo;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if (isDelete) {
            Tools.msgBox("Department is updated ");
        }
    }

    @Override
    public String getAutoNumber() {
        //String strAuto = db.go.getAutoNumber("department", "deptno");
        //return strAuto;
        return db.go.getAutoNumber("dpartment", "DeptNo");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("department_data", table);

    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = " select * from department_data " + "where DeptNo = " + DeptNo;
        db.go.fillToJTable(strSelect, table);

    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select DeptNo from department " + "where department ='" + name + "'";
        String strVal = (String) db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select deptname from department " + "where DeptNo = " + DeptNo;
        String strName = (String) db.go.getTableData(strSelect).Items[0][0];
        return strName;

    }

}
