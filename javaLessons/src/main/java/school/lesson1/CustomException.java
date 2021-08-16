package school.lesson1;

public class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

class MyArrayDataException extends CustomException {

    MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные находятся в ячейке [%d, %d]\n", row, col));
    }
}

class MyArraySizeException extends CustomException {

    MyArraySizeException() {
        super("Размерность массива должна быть [4 x 4]\n");
    }
}

  class Converter {
    static int strConverter(String[][] strArray)
            throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (4 != strArray.length) throw new MyArraySizeException();
        for (int i = 0; i < strArray.length; i++) {
            if (4 != strArray[i].length) throw new MyArraySizeException();
            for (int k = 0; k < strArray[i].length; k++) {
                try {
                    sum += Integer.parseInt(strArray[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {


        String[][] correctMatrix = {
                {"3", "3", "3", "3"},
                {"2", "2", "2", "2"},
                {"4", "4", "4", "4"},
                {"8", "8", "8", "8"}
        };
        String[][] wrongSizeMatrix = {
                {"1", "1", "1", "1"},
                {"5", "5", "5", "5"},
                {"2", "2", "2", "2"},
                {"0", "0"}
        };
        String[][] wrongCharMatrix = {
                {"9", "9", "2", "3"},
                {"1", "1", "5", "7"},
                {"2", "W", "7", "6"},
                {"1", "9", "4", "5"}
        };

        try {
            System.out.println("Вариант 1:");
            System.out.println("Сумма всех элементов массива = " + Converter.strConverter(correctMatrix) + ".\n");
        } catch (CustomException e) {
            e.getMessage();
        }

        try {
            System.out.println("Вариант 2:");
            System.out.println("Сумма всех элементов массива = " + Converter.strConverter(wrongSizeMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Вариант 3:");
            System.out.println("Сумма всех элементов массива = " + Converter.strConverter(wrongCharMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
