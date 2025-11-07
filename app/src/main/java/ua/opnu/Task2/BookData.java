package ua.opnu.Task2;

// Завдання 2: Клас BookData з підтримкою узагальненого інтерфейсу Comparable
public class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;
    
    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }
    
    // Обчислює рейтинг книги
    public double getRating() {
        return reviews > 0 ? total / reviews : 0.0;
    }
    
    // Порівняння: спочатку за рейтингом (вищий рейтинг = менше), потім за назвою
    @Override
    public int compareTo(BookData other) {
        // Книга з більш високим рейтингом повинна бути "менше"
        double thisRating = this.getRating();
        double otherRating = other.getRating();
        
        int ratingComparison = Double.compare(otherRating, thisRating);
        if (ratingComparison != 0) {
            return ratingComparison;
        }
        
        // У разі рівності рейтингів, порівнюємо за назвою
        return this.title.compareTo(other.title);
    }
    
    // Геттери
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getReviews() { return reviews; }
    public double getTotal() { return total; }
    
    @Override
    public String toString() {
        return String.format("BookData{title='%s', author='%s', rating=%.2f}", 
                           title, author, getRating());
    }
}