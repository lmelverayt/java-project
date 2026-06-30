import java.util.Random;

public class Practicheskaya15_16 {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("ЗАДАНИЕ 1: Одномерный массив");
        
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        
        System.out.print("Массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int max = numbers[0];
        int min = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        
        System.out.println("\n ЗАДАНИЕ 2: Двумерный массив");
        
        int size = 5;
        int[][] matrix = new int[size][size];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        
        System.out.println("Квадратная матрица " + size + "x" + size + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nЗАДАНИЕ 3: Треугольник Паскаля");
        
        int rows = 6;
        int[][] pascal = new int[rows][];
        

        for (int i = 0; i < rows; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }
        
        System.out.println("Треугольник Паскаля (" + rows + " строк):");
        for (int i = 0; i < pascal.length; i++) {

            for (int k = 0; k < rows - i - 1; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + "   ");
            }
            System.out.println();
        }
    }
}