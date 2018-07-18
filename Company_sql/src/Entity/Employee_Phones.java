package Entity;

import company_sql.Tools;
import javax.swing.JTable;

public class Employee_Phones implements mainData {
    
    private int EmpNO;
    private String Phone;
    
    public int getEmpNO() {
        return EmpNO;
    }
    
    public void setEmpNO(int EmpNO) {
        this.EmpNO = EmpNO;
    }
    
    public String getPhone() {
        return Phone;
    }
    
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    @Override
    public void add() {
        String strInsert = "insert into employee_phones values ("
                + EmpNO + "'"
                + "'" + Phone + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if (isAdd) {
            Tools.msgBox("Phone Number is added ");
        }
    }
    
    @Override
    public void update() {
        Tools.msgBox("Update Method in Rmployee_Phones class is not working !");
    }
    
    @Override
    public void delete() {
        String strDelete = "delete from employee_phones "
                + "where "
                + " EmpNO=" + EmpNO
                + " and phone ='" + Phone + "'";
        boolean isDelete = db.go.runNonQuery(strDelete);
        if (isDelete) {
            Tools.msgBox("Phone Number is deleted !");
        }
    }

    //the following method is only for Employee_phones class
    public void deleteByEmp() {
        String steDelete = "delete from Employee_phones"
                + " where EmpNO=" + EmpNO;
        boolean isDelete = db.go.runNonQuery(steDelete);
        if (isDelete) {
            Tools.msgBox("Employee Phones Are Deleted !");
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
