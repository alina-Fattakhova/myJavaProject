package school.lesson1;

public class AppData {
    private String[] tableHeadings;
    private int[][] tableContents;

    public AppData(String[] tableHeadings, int[][] tableContents) {
        this.tableHeadings = tableHeadings;
        this.tableContents = tableContents;
    }

    public String[] getTableHeadings() {
        return tableHeadings;
    }

    public void setTableHeadings(String[] tableHeadings) {
        this.tableHeadings = tableHeadings;
    }

    public int[][] getTableContents() {
        return tableContents;
    }

    public void setTableContents(int[][] tableContents) {
        this.tableContents = tableContents;
    }
}
