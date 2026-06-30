import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class practicheskaya13 {
    public static void main(String[] args) {
        
        List<String> students = new ArrayList<>();
        students.add("Анна");
        students.add("Пётр");
        students.add("Мария");
        students.add("Иван");
        students.add("Анна");
    

        System.out.println("Список студентов (ArrayList): " + students);
        System.out.println("Количество студентов в списке: " + students.size());
    
        Set<String> uniqueStudents = new HashSet<>(students);
        System.out.println("\nМножество студентов (HashSet, без дубликатов): " + uniqueStudents);
        System.out.println("Количество уникальных студентов: " + uniqueStudents.size());
    

        Map<String, Integer> studentGrades = new HashMap<>();
    
        studentGrades.put("Анна", 95);
        studentGrades.put("Пётр", 82);
        studentGrades.put("Мария", 91);
        studentGrades.put("Иван", 76);

        System.out.println("\nОценки студентов (HashMap):");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " баллов");
        }
    }
}