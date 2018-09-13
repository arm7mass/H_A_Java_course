package Entity;

import company_sql.Tools;
import javax.swing.JTable;

public class WorkOn implements mainData {
    
    private int EmpNO;
    private int ProjectNO;
    
    public int getEmpNO() {
        return EmpNO;
    }
    
    public void setEmpNO(int EmpNO) {
        this.EmpNO = EmpNO;
    }
    
    public int getProjectNO() {
        return ProjectNO;
    }
    
    public void setProjectNO(int ProjectNO) {
        this.ProjectNO = ProjectNO;
    }
    
    @Override
    public void add() {
        String strInsert = "insert into workon values ("
                + EmpNO + ","
                + ProjectNO + ")";
        boolean isAdded = db.go.runNonQuery(strInsert);
        if (isAdded) {
            Tools.msgBox("Sowrk is Added !");
        }
    }
    
    @Override
    public void update() {
        Tools.msgBox("Update Method is not Working In WorkOn Method ");
        
    }
    
    @Override
    public void delete() {
        String strDelete = "delete from workon where "
                + "EmpNO=" + EmpNO
                + "and"
                + "ProjectNO=" + ProjectNO;
        boolean isDeleted = db.go.runNonQuery(strDelete);
        if (isDeleted) {
            Tools.msgBox("WorkON is Deleted...");
            
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
