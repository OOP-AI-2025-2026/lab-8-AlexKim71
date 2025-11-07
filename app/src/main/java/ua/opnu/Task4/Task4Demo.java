package ua.opnu.Task4;

import java.util.Arrays;
import java.util.function.Predicate;

// Демонстрація роботи узагальненого filter
public class Task4Demo {
    public static void main(String[] args) {
        System.out.println("=== Завдання 4: Узагальнений filter ===");
        
        // Тест з Integer масивом
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Predicate<Integer> isEven = n -> n % 2 == 0;
        
        Integer[] evenNumbers = GenericFilter.filter(numbers, isEven);
        System.out.println("Початковий масив: " + Arrays.toString(numbers));
        System.out.println("Парні числа: " + Arrays.toString(evenNumbers));
        
        // Тест з String масивом
        String[] words = {"Java", "Python", "JavaScript", "C++", "Go"};
        Predicate<String> longWords = s -> s.length() > 4;
        
        String[] filteredWords = GenericFilter.filter(words, longWords);
        System.out.println("\nПочатковий масив слів: " + Arrays.toString(words));
        System.out.println("Слова довші за 4 символи: " + Arrays.toString(filteredWords));
        
        // Тест з Double масивом
        Double[] doubles = {1.5, 2.3, 3.7, 4.1, 5.9};
        Predicate<Double> greaterThan3 = d -> d > 3.0;
        
        Double[] filteredDoubles = GenericFilter.filter(doubles, greaterThan3);
        System.out.println("\nПочатковий масив Double: " + Arrays.toString(doubles));
        System.out.println("Числа більше 3.0: " + Arrays.toString(filteredDoubles));
    }
}