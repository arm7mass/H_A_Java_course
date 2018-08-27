package Entity;

import company_sql.Tools;
import javax.swing.JTable;

public class Project implements mainData {

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
        String strInsert = "insert into project values ("
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
        String strUpdate = "update Project set "
                + "ProjectName='" + ProjectName + "',"
                + "Location='" + Location + "',"
                + "DeptNO=" + DeptNO
                + " where ProjectNO=" + ProjectNO;
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if (isUpdate) {
            Tools.msgBox("Project Is Updated ");
        }
    }

    @Override
    public void delete() {
        String strDelete = "delete from project"
                + " where ProjectNO =" + ProjectNO;
        boolean isDeleted = db.go.runNonQuery(strDelete);
        if (isDeleted) {
            Tools.msgBox("Project is Deleted ");
        }
    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("project", "ProjectNO");

    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("project_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from project_data "
                + "where Project_NO=" + ProjectNO;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select projectNO from project "
                + " where ProjectName ='" + name + "'";
        String strVal = (String) db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select ProjectName from project "
                + "where ProjectNO=" + value;
        String strName = (String) db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }

}
