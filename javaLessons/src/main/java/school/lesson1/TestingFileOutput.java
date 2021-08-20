package school.lesson1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestingFileOutput {
    public static void main(String[] args) {
        String[] headings = {"First", "Second", "Third"};
        int[][] contents = {{100, 200, 123}, {300, 400, 500}};
        AppData data = new AppData(headings, contents);
        save(data);
    }

    public static void save(AppData data) {
        try {
            File csvTable = new File("D:\\Desktop\\table.csv");
            FileOutputStream fos = new FileOutputStream(csvTable, false);
            for (String heading : data.getTableHeadings()) {
                fos.write(heading.getBytes());
                fos.write(";".getBytes());
            }
            for (int[] line : data.getTableContents()) {
                fos.write("\n".getBytes());
                for (int cell : line) {
                    fos.write(String.valueOf(cell).getBytes());
                    fos.write(";".getBytes());
                }
            }
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
