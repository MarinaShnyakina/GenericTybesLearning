package genericMethods;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer();
        String[] strings = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] integers = {54, 96, 735, 2, 7453};
        printer.<String>print(strings);
        printer.<Integer>print(integers);

    }
}
