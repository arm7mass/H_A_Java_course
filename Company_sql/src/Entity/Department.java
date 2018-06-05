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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAllRows(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getOneRow(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValueByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameByValue(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
