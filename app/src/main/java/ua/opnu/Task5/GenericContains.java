package ua.opnu.Task5;

// Завдання 5: Узагальнена версія методу contains
public class GenericContains {
    
    // Узагальнений метод contains з обмеженнями типів
    public static <T extends Comparable<T>, V extends T> boolean contains(T[] array, V element) {
        for (T item : array) {
            if (item.compareTo(element) == 0) {
                return true;
            }
        }
        return false;
    }
}