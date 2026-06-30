import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class practicheskaya12 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1995, 3, 15);
        
        Period age = Period.between(birthDate, today);
        
        LocalDate nextBirthday = birthDate.withYear(today.getYear());
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        long daysUntilNextBirthday = java.time.temporal.ChronoUnit.DAYS.between(today, nextBirthday);
        
        System.out.println("Текущая дата: " + today.format(formatter));
        System.out.println("Дата рождения: " + birthDate.format(formatter));
        System.out.println("Возраст: " + age.getYears() + " лет, " + age.getMonths() + " месяцев, " + age.getDays() + " дней");
        System.out.println("Дней до следующего дня рождения: " + daysUntilNextBirthday);
    }
}