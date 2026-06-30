class Book {
    private String title;
    private String author;
    private int year;
    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
        System.out.println();
    }
}

public class practicheskaya6 {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Толстой", 1869);
        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", 1866);
        
        System.out.println("=== Книга 1 ===");
        book1.displayInfo();
        
        System.out.println("=== Книга 2 ===");
        book2.displayInfo();
        
        System.out.println("=== Демонстрация геттеров ===");
        System.out.println("Название первой книги: " + book1.getTitle());
        System.out.println("Автор первой книги: " + book1.getAuthor());
        System.out.println("Год первой книги: " + book1.getYear());
        System.out.println();
        
        System.out.println("=== Демонстрация сеттеров ===");
        book1.setTitle("Анна Каренина");
        book1.setYear(1877);
        System.out.println("Обновленная информация о первой книге:");
        book1.displayInfo();
    }
}