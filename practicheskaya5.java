public class practicheskaya5{
    public static void main(String[] args) {
        
        // 1
        int result1 = sum(10, 20);
        System.out.println("Сумма 10 + 20 = " + result1);
        
        // 2
        int result2 = sum(10, 20, 30);
        System.out.println("Сумма 10 + 20 + 30 = " + result2);
        
        // 3
        System.out.println("Число 7 четное? " + isEven(7));
        System.out.println("Число 8 четное? " + isEven(8));
        
        // 4
        printMessage("Привет, мир!");
        printMessage("Это мой метод!");
    }
    
    // 1
    public static int sum(int a, int b) {
        return a + b;
    }
    
    // 2
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    // 3
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // 4
    public static void printMessage(String message) {
        System.out.println(message);
    }
}