package custonGenericTypes;

public class Main {
    public static void main(String[] args){

        // неверный первый вариант
        /*Account acc1 = new Account(12345, 5000);
        System.out.println(acc1.getId());

        Account acc2 = new Account("sid12345", 5000);
        System.out.println(acc2.getId());

        // так можно
        int a = ((Integer) acc1.getId()) + 10; // Опасное преобразование типов
        System.out.println(a);

        // но так нельзя, потому что там Object
        int b = ((Integer) acc2.getId()) + 10; // Опасное преобразование типов
        System.out.println(b);*/

        // верный второй вариант
       /* Account <Integer> acc1 = new Account(12345, 5000);
        System.out.println(acc1.getId());

        Account <String> acc2 = new Account("sid12345", 5000);
        System.out.println(acc2.getId());*/

        // это код с преобразованием
        // нам IJ уже не даст допустить ошибку
        // int b = ((Integer) acc2.getId()) + 10;
        // System.out.println(b);

        // а так мы можем, потому что асс1 - Integer, можно сложить
        // int a = ((Integer) acc1.getId()) + 10;
        // System.out.println(a);

        // но так как преобразование нам уже не нужно, то лучше написать так
       /* int a = acc1.getId() + 10;
        System.out.println(a);

        // а так нельзя
        int b = acc2.getId() + 10;
        System.out.println(b);*/

      // третий вариант interface Accountable
        Account <String> acc2 = new Account("sid12345", 5000);
        System.out.println(acc2.getId());
    }
}
