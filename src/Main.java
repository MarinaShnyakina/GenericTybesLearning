import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       /* Object o = new Scanner(System.in);



        //((Scanner) o ).nextInt(); // Приведение типа, которое указано здесь (это часть кода) называется Cast, Casting - каст одного типа данный другой, т.е. преобразование
        //System.out.println(o instanceof Scanner); // это оператор проверяющий является ли объект о, принадлежащий классу Scanner, является ли он Scanner'ом, если нет, то при запуске будет выведен false
        //пишем логику, которая будет ветвить наше преобразование, если у нас будет instanceof true, то тогда мы ничего не делаем, либо преобразовываем к Scanner'у
        Scanner scanner = null;

        if (o instanceof Scanner) scanner = (Scanner) o;

        if(scanner != null) {
            scanner.nextInt();
        }

        Object o1 = new String();

        Object o2 = new Integer(15);*/


        // Неудачный пример приведения в ArrayList
        /*Object[] objects = {10, "Привет", 3.14}; //здесь происходит автоупаковка

        for (Object o : objects){
            if(o instanceof String){
                String s = (String) o; // тут мы делаем Cast - преобразование
                System.out.println(s);
            }
        }

        ArrayList numbers = new ArrayList(); // сохраняет object

        for(int i = 0; i < 10; i++){ // сохранять в коллекцию числа 10, 20, ... 100
            numbers.add(i*10);
           // numbers.add(i*10.4f); так он не может, выходит ошибка
        }

        int sum = 0;
        for(Object o : numbers){
            sum = sum + (Integer) o;
        }
        System.out.println(sum);*/


        // Объявление Generics
        // Основной тип <Тип параметр>

        Object[] objects = {10, "Привет", 3.14}; //здесь происходит автоупаковка

        for (Object o : objects){
            if(o instanceof String){
                String s = (String) o; // тут мы делаем Cast - преобразование
                System.out.println(s);
            }
        }

        ArrayList <Integer> numbers = new ArrayList(); // сохраняет object

        for(int i = 0; i < 10; i++){ // сохранять в коллекцию числа 10, 20, ... 100
            numbers.add(i*10);

            // numbers.add(10.4f); такой код уже не запуститься, Java ограничит нас
        }

        int sum = 0;
        for(Integer o : numbers){
            sum = sum + o;
        }
        System.out.println(sum);

    }
}