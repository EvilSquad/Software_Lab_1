public class Matrix {

    public static void main(String[] args) {
        try {
            // Створення та ініціалізація матриці
            long[][] matrix = {
                    {12, 5, 8},
                    {6, 15, 3},
                    {9, 7, 1}
            };

            // Виклик методу для виведення початкової матриці
            System.out.println("Початкова матриця:");
            printMatrix(matrix);

            // Виклик методу для транспонування та виведення транспонованої матриці
            long[][] transposedMatrix = transposeMatrix(matrix);
            System.out.println("Транспонована матриця:");
            printMatrix(transposedMatrix);

            // Обчислення суми найменших елементів кожного стовпця та виведення її в консоль
            long sumOfMinElements = calculateSumOfMinElements(matrix);
            System.out.println("Сума найменших елементів кожного стовпця (до транспонування): " + sumOfMinElements);
            long sumOfMinElementsT = calculateSumOfMinElements(transposedMatrix);
            System.out.println("Сума найменших елементів кожного стовпця (після транспонування): " + sumOfMinElementsT);


        } catch (Exception e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        }
    }

    // Метод для виведення матриці в консоль
    public static void printMatrix(long[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод для транспонування матриці
    public static long[][] transposeMatrix(long[][] matrix) {
        long[][] result = new long[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Метод для обчислення суми мінімальних елементів усіх стовпців
    public static long calculateSumOfMinElements(long[][] matrix) {
        int cols = matrix[0].length;
        long sum = 0;

        for (int j = 0; j < cols; j++) {
            long min = matrix[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            sum += min;
        }
        return sum;
    }
}
