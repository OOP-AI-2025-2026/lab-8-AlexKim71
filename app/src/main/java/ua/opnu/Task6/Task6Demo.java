package ua.opnu.Task6;

// Демонстрація роботи узагальнених кортежів
public class Task6Demo {
    
    // Метод що повертає інформацію про студента та його рейтинг
    public static GenericTwoTuple<String, Integer> getStudentRating(String name) {
        // Імітуємо обчислення рейтингу
        int rating = name.length() * 10; // Простий алгоритм для демонстрації
        return new GenericTwoTuple<>(name, rating);
    }
    
    // Метод що повертає координати та висоту точки
    public static GenericThreeTuple<Double, Double, Double> getPoint3D(String pointName) {
        // Імітуємо отримання координат
        double x = Math.random() * 100;
        double y = Math.random() * 100;
        double z = Math.random() * 100;
        return new GenericThreeTuple<>(x, y, z);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Завдання 6: Узагальнені кортежі ===");
        
        // Демонстрація GenericTwoTuple
        System.out.println("--- GenericTwoTuple ---");
        
        // Приклад 1: Студент та рейтинг
        GenericTwoTuple<String, Integer> studentRating = getStudentRating("Іван Петров");
        System.out.println("Студент та рейтинг: " + studentRating);
        System.out.println("Ім'я: " + studentRating.first + ", Рейтинг: " + studentRating.second);
        
        // Приклад 2: Товар та ціна
        GenericTwoTuple<String, Double> product = new GenericTwoTuple<>("Ноутбук", 25000.50);
        System.out.println("Товар та ціна: " + product);
        
        // Приклад 3: Координати
        GenericTwoTuple<Integer, Integer> coordinates = new GenericTwoTuple<>(10, 20);
        System.out.println("Координати: " + coordinates);
        
        // Демонстрація GenericThreeTuple
        System.out.println("\n--- GenericThreeTuple ---");
        
        // Приклад 1: 3D точка
        GenericThreeTuple<Double, Double, Double> point3D = getPoint3D("Point A");
        System.out.println("3D точка: " + point3D);
        System.out.printf("X: %.2f, Y: %.2f, Z: %.2f%n", 
                         point3D.first, point3D.second, point3D.third);
        
        // Приклад 2: Студент, група та середній бал
        GenericThreeTuple<String, String, Double> studentInfo = 
            new GenericThreeTuple<>("Марія Іванова", "ІП-21", 4.75);
        System.out.println("Інформація про студента: " + studentInfo);
        
        // Приклад 3: Різні типи даних
        GenericThreeTuple<String, Integer, Boolean> mixedData = 
            new GenericThreeTuple<>("Тест", 42, true);
        System.out.println("Змішані дані: " + mixedData);
    }
}