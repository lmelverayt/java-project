public class practicheckaya4 {
    public static void main(String[] args) {
        // I
        int[] numbers = {10, 25, 7, 42, 18};
        
        // II
        System.out.print("Элементы массива: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // III
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Сумма всех элементов: " + sum);
        
        // IV
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        
        // V
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 42) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число 42 найдено в массиве!");
        } else {
            System.out.println("Число 42 не найдено в массиве.");
        }
    }
}