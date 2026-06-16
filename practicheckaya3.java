import java.util.Scanner;

public class practicheckaya3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ЗАДАНИЕ 1
        System.out.println("Задание 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // ЗАДАНИЕ 2
        System.out.println("Задание 2:");
        int sum = 0;
        int j = 1;
        while (j <= 100) {
            sum = sum + j;
            j++;
        }
        System.out.println("Сумма = " + sum);
        System.out.println();
        
        // ЗАДАНИЕ 3
        System.out.println("Задание 3");
        String password;
        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
            if (!password.equals("java123")) {
                System.out.println("Неверный пароль. Попробуйте снова.");
            }
        } while (!password.equals("java123"));
        
        System.out.println("Пароль верный! Доступ разрешен.");
    }
}