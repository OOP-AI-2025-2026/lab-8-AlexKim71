package ua.opnu.Task3;

// Демонстрація роботи узагальненого Printer
public class Task3Demo {
    public static void main(String[] args) {
        System.out.println("=== Завдання 3: Узагальнений Printer ===");
        
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        
        System.out.print("Integer масив: ");
        myPrinter.printArray(intArray);
        
        System.out.print("String масив: ");
        myPrinter.printArray(stringArray);
        
        // Додаткові тести з іншими типами
        Double[] doubleArray = {1.5, 2.7, 3.14};
        Character[] charArray = {'A', 'B', 'C'};
        
        System.out.print("Double масив: ");
        myPrinter.printArray(doubleArray);
        
        System.out.print("Character масив: ");
        myPrinter.printArray(charArray);
    }
}