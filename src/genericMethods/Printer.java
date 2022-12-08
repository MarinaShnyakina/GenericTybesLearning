package genericMethods;

public class Printer {

    public <T> void print(T[] items) { // по умолчанию тут стоит Object - public <T extends Object> void print(T[] items) {
        for(T item : items){
            System.out.println(item);
        }
    }
}
