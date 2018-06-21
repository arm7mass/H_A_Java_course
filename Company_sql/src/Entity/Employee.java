package Entity;

import company_sql.Tools;
import javax.swing.JTable;

public class Employee implements mainData {
    
    private int EmpNO;
    private String EmpName;
    private String Address;
    private double Salary;
    private String HiringDate;
    private String BirthDate;
    private int DeptNO;
    
    public int getEmpNO() {
        return EmpNO;
    }
    
    public void setEmpNO(int EmpNO) {
        this.EmpNO = EmpNO;
    }
    
    public String getEmpName() {
        return EmpName;
    }
    
    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }
    
    public String getAddress() {
        return Address;
    }
    
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public double getSalary() {
        return Salary;
    }
    
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    public String getHiringDate() {
        return HiringDate;
    }
    
    public void setHiringDate(String HiringDate) {
        this.HiringDate = HiringDate;
    }
    
    public String getBirthDate() {
        return BirthDate;
    }
    
    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }
    
    public int getDeptNO() {
        return DeptNO;
    }
    
    public void setDeptNO(int DeptNO) {
        this.DeptNO = DeptNO;
    }
    
    @Override
    public void add() {
        String strInsert = "insert into Employee values (" + EmpNO
                + ",'" + EmpName + "',"
                + "'" + Address + "',"
                + Salary + ","
                + "'" + HiringDate + "',"
                + "'" + BirthDate + "',"
                + DeptNO + ")";
        boolean isAdded = db.go.runNonQuery(strInsert);
        if (isAdded) {
            Tools.msgBox("Employee Record Is added");
        }
        
    }
    
    @Override
    public void update() {
        String strUpdate = "update employee set "
                + "EmpName='" + EmpName + "',"
                + "Address='" + Address + "',"
                + "Salary=" + Salary + ","
                + "HiringDate='" + HiringDate + "',"
                + "BirthDate='" + BirthDate + "',"
                + "DeptNO=" + DeptNO
                + "where Emp EmpNO= " + EmpNO;
        boolean isUpdated = db.go.runNonQuery(strUpdate);
        if (isUpdated) {
            Tools.msgBox("The Employee Record is updated ");
        }
    }
    
    @Override
    public void delete() {
        String strDelete = "delete from Employee " + "where EmpNO= " + EmpNO;
        boolean isdeleted = db.go.runNonQuery(strDelete);
        if (isdeleted) {
            Tools.msgBox("Employee Record is deleted ");
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
