package ua.opnu.Task1;

// Завдання 1: Узагальнений клас MyOptional для безпечної роботи з можливою відсутністю значення
public class MyOptional<T> {
    // Приватні поля
    private T value;
    private boolean present;
    
    // Конструктор без параметрів (порожній)
    public MyOptional() {
        this.present = false;
    }
    
    // Конструктор з параметром
    public MyOptional(T value) {
        if (value == null) {
            throw new IllegalArgumentException("MyOptional не приймає null");
        }
        this.value = value;
        this.present = true;
    }
    
    // Перевіряє чи є значення
    public boolean isPresent() {
        return present;
    }
    
    // Перевіряє чи порожній
    public boolean isEmpty() {
        return !isPresent();
    }
    
    // Отримує значення або кидає виняток
    public T get() {
        if (!present) {
            throw new IllegalStateException("Значення відсутнє");
        }
        return value;
    }
    
    // Повертає значення або значення за замовчуванням
    public T orElse(T defaultValue) {
        return present ? value : defaultValue;
    }
    
    @Override
    public String toString() {
        return present ? "MyOptional[value=" + value + "]" : "MyOptional[empty]";
    }
}