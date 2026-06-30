import java.util.HashMap;
import java.util.Map;

public class practicheskaya17 {
    public static void main(String[] args) {

        HashMap<String, Integer> journal = new HashMap<>();
        
        journal.put("Анна", 95);
        journal.put("Пётр", 82);
        journal.put("Мария", 91);
        journal.put("Иван", 76);
        journal.put("Елена", 88);
        
        System.out.println("Журнал успеваемости");
        System.out.println("Все студенты и их оценки:");
        for (Map.Entry<String, Integer> entry : journal.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " баллов");
        }
        
        String studentName = "Мария";
        Integer grade = journal.get(studentName);
        System.out.println("\nОценка студента " + studentName + ": " + grade + " баллов");
        
        String checkName = "Иван";
        if (journal.containsKey(checkName)) {
            System.out.println("Студент " + checkName + " есть в журнале");
        } else {
            System.out.println("Студент " + checkName + " отсутствует в журнале");
        }
        
        String checkName2 = "Сергей";
        if (journal.containsKey(checkName2)) {
            System.out.println("Студент " + checkName2 + " есть в журнале");
        } else {
            System.out.println("Студент " + checkName2 + " отсутствует в журнале");
        }
        
        String removeName = "Пётр";
        journal.remove(removeName);
        System.out.println("\nСтудент " + removeName + " удалён из журнала");
        
        System.out.println("\nОставшиеся студенты в журнале:");
        for (Map.Entry<String, Integer> entry : journal.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " баллов");
        }
        
        System.out.println("\nВсего студентов в журнале: " + journal.size());
    }
}