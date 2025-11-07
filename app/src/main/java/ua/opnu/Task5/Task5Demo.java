package ua.opnu.Task5;

// Демонстрація роботи узагальненого contains
public class Task5Demo {
    public static void main(String[] args) {
        System.out.println("=== Завдання 5: Узагальнений contains ===");
        
        // Тест з String масивом
        String[] words = {"Java", "Python", "JavaScript", "C++", "Go"};
        
        System.out.println("Масив слів: [Java, Python, JavaScript, C++, Go]");
        System.out.println("Містить 'Java': " + GenericContains.contains(words, "Java"));
        System.out.println("Містить 'Ruby': " + GenericContains.contains(words, "Ruby"));
        
        // Тест з Integer масивом
        Integer[] numbers = {1, 5, 10, 15, 20};
        
        System.out.println("\nМасив чисел: [1, 5, 10, 15, 20]");
        System.out.println("Містить 10: " + GenericContains.contains(numbers, 10));
        System.out.println("Містить 7: " + GenericContains.contains(numbers, 7));
        
        // Тест з Character масивом
        Character[] chars = {'A', 'B', 'C', 'D', 'E'};
        
        System.out.println("\nМасив символів: [A, B, C, D, E]");
        System.out.println("Містить 'C': " + GenericContains.contains(chars, 'C'));
        System.out.println("Містить 'Z': " + GenericContains.contains(chars, 'Z'));
    }
}