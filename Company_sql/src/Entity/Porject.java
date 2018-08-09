package Entity;

import company_sql.Tools;
import javax.swing.JTable;

public class Porject implements mainData {
    
    private int ProjectNO;
    private String ProjectName;
    private String Location;
    private int DeptNO;
    
    public int getProjectNO() {
        return ProjectNO;
    }
    
    public void setProjectNO(int ProjectNO) {
        this.ProjectNO = ProjectNO;
    }
    
    public String getProjectName() {
        return ProjectName;
    }
    
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }
    
    public String getLocation() {
        return Location;
    }
    
    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    public int getDeptNO() {
        return DeptNO;
    }
    
    public void setDeptNO(int DeptNO) {
        this.DeptNO = DeptNO;
    }
    
    @Override
    public void add() {
        String strInsert = "inert into project values ("
                + ProjectNO + ","
                + "'" + ProjectName + "',"
                + "'" + Location + "',"
                + DeptNO + ")";
        Boolean isAdd = db.go.runNonQuery(strInsert);
        if (isAdd) {
            Tools.msgBox("Project Is Added ");
        }
    }
    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
