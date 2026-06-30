class NumberTask implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Число: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток чисел прерван");
        }
    }
}

class LetterTask implements Runnable {
    @Override
    public void run() {
        try {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Буква: " + c);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток букв прерван");
        }
    }
}

public class practicheskaya14 {
    public static void main(String[] args) {
        System.out.println("Запуск потоков");
        System.out.println("Ожидайте вывод чисел и букв\n");
        
        NumberTask numberTask = new NumberTask();
        LetterTask letterTask = new LetterTask();
        
        Thread thread1 = new Thread(numberTask);
        Thread thread2 = new Thread(letterTask);
        

        thread1.start();
        thread2.start();
        
        try {

            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Основной поток прерван");
        }
        
        System.out.println("\nВсе потоки завершены");
    }
}