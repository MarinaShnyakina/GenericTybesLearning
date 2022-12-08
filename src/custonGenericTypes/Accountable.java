package custonGenericTypes;

// отрефакторим наш код, сделаем Интерфейс и в нем реализуем наши типы
public interface Accountable <T> {
    T getId();
    void setId(T id);
    void setSum(int sum);
    int getSum();

}
