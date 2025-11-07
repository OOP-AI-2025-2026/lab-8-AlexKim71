package ua.opnu;

import ua.opnu.Task1.Task1Demo;
import ua.opnu.Task2.Task2Demo;
import ua.opnu.Task3.Task3Demo;
import ua.opnu.Task4.Task4Demo;
import ua.opnu.Task5.Task5Demo;
import ua.opnu.Task6.Task6Demo;

// Головний клас для демонстрації всіх завдань лабораторної роботи 8
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторна робота 8: Узагальнене програмування ===\n");
        
        // Завдання 1: MyOptional
        Task1Demo.main(args);
        System.out.println();
        
        // Завдання 2: BookData з Comparable
        Task2Demo.main(args);
        System.out.println();
        
        // Завдання 3: Узагальнений Printer
        Task3Demo.main(args);
        System.out.println();
        
        // Завдання 4: Узагальнений filter
        Task4Demo.main(args);
        System.out.println();
        
        // Завдання 5: Узагальнений contains
        Task5Demo.main(args);
        System.out.println();
        
        // Завдання 6: Узагальнені кортежі
        Task6Demo.main(args);
    }
}
