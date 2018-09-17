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
            Tools.msgBox("Work is Added !");
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
                + " and"
                + " ProjectNO= " + ProjectNO;
        boolean isDeleted = db.go.runNonQuery(strDelete);
        if (isDeleted) {
            Tools.msgBox("WorkON is Deleted...");

        }
    }

    @Override
    public String getAutoNumber() {
        Tools.msgBox("getAutoNumber Method is not Working In WorkOn Method ");
        return "";
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("workon_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from workon_data where "
                + "Employee_NO= " + EmpNO
                + " and "
                + "project_no= " + ProjectNO;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        Tools.msgBox("getValueByName Method is not Working In WorkOn Method ");
        return "";
    }

    @Override
    public String getNameByValue(String value) {
        Tools.msgBox("getNameByValue Method is not Working In WorkOn Method ");
        return "";
    }

}
