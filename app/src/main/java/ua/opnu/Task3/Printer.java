package ua.opnu.Task3;

// Завдання 3: Клас Printer з узагальненим методом printArray
public class Printer {
    
    // Узагальнений метод для друку масиву будь-якого типу
    public <T> void printArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}