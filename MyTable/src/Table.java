
public class Table {

    //Attributes 
    public int columns;
    public Object[][] Items;

    // Constructor 
    public Table(int columns) {
        this.columns = columns;
        Items = new Object[0][columns];
    }

    // Method to add new row 
    public void addNewRow(Object row[]) {
        Object TempItems[][] = Items;    // transfer the old Items from main variable  to temporary variable
        Items = new Object[Items.length + 1][columns];   // increase the main variable with additional one item 
        for (int x = 0; x < TempItems.length; x++) {     // return the previouse Items from the Temporary variable to main variable 
            Items[x] = TempItems[x];
        }
        Items[Items.length - 1] = row;  // adding new row to main variable 
    }

    // method to print the Two Dimension array 
    public void PrintItems() {
        for (Object objs[] : Items) {
            for (Object obj : objs) {
                System.out.print(obj + " ; ");
            }
            System.out.println();
        }
    }

    // method to edit the two dimension array eliments
    public void editRow(int rowIndex, int columnIndex, Object newData) {
        Items[rowIndex][columnIndex] = newData;
    }
}
