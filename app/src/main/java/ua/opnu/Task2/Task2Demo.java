package ua.opnu.Task2;

import java.util.Arrays;

// Демонстрація роботи BookData з Comparable
public class Task2Demo {
    public static void main(String[] args) {
        System.out.println("=== Завдання 2: BookData з Comparable ===");
        
        // Створюємо масив книг
        BookData[] books = {
            new BookData("Java Programming", "Іван Іванов", 100, 450.0),
            new BookData("Python Basics", "Петро Петров", 80, 400.0),
            new BookData("Advanced Java", "Марія Сидорова", 50, 250.0),
            new BookData("Data Structures", "Олег Коваленко", 120, 480.0)
        };
        
        System.out.println("До сортування:");
        for (BookData book : books) {
            System.out.println(book);
        }
        
        // Сортуємо за рейтингом (вищий рейтинг спочатку)
        Arrays.sort(books);
        
        System.out.println("\nПісля сортування (за рейтингом):");
        for (BookData book : books) {
            System.out.println(book);
        }
    }
}