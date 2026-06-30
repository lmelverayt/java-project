public class practicheskaya18 {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 8, 3},
            {12, 7, 4},
            {9, 6, 2}
        };
        
        System.out.println("=== Матрица 3x3 ===");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } 
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        
        System.out.println("\nСумма всех элементов матрицы: " + sum);
    }
}