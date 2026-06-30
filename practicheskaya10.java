import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class practicheskaya10 {
   
    private static final String FILE_NAME = "students.txt";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Сохранить список студентов");
        System.out.println("2. Загрузить список студентов");
        System.out.print("Выберите действие (1 или 2): ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1:
                saveStudentsToFile();
                break;
            case 2:
                loadStudentsFromFile();
                break;
            default:
                System.out.println("Неверный выбор");
        }
        
        scanner.close();
    }
    
    private static void saveStudentsToFile() {

        List<String> students = Arrays.asList(
            "Анна Иванова",
            "Пётр Петров", 
            "Мария Сидорова",
            "Иван Смирнов",
            "Елена Кузнецова"
        );
        
        System.out.println("\nЗапись в файл");
        System.out.println("Список студентов для сохранения:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
        
        try (FileWriter writer = new FileWriter(FILE_NAME)) {

            for (String student : students) {
                writer.write(student + "\n");
            }

            System.out.println("\n✅ Список студентов успешно сохранён в файл: " + FILE_NAME);
            
        } catch (IOException e) { 
            System.err.println("Ошибка при сохранении файла: " + e.getMessage());
        }
    }
    
    private static void loadStudentsFromFile() {
        System.out.println("\nЧтение из файла");
        
        try {

            List<String> students = Files.readAllLines(Paths.get(FILE_NAME));
            
            System.out.println("Список студентов из файла " + FILE_NAME + ":");
            
            if (students.isEmpty()) {
                System.out.println("Файл пуст!");
            } else {

                for (int i = 0; i < students.size(); i++) {
                    System.out.println((i + 1) + ". " + students.get(i));
                }
                System.out.println("\nВсего студентов: " + students.size());
            }
            
        } catch (IOException e) { // Обработка ошибок (согласно теории п.2.6)
            System.err.println(" Ошибка при чтении файла: " + e.getMessage());
            System.err.println(" Возможно, файл " + FILE_NAME + " не существует.");
            System.err.println(" Сначала сохраните список студентов (выберите пункт 1)");
        }
    }
}