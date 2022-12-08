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



        Object[] objects = {10, "Привет", 3.14}; //здесь происходит автоупаковка

        for (Object o : objects){
            if(o instanceof String){
                String s = (String) o; // тут мы делаем Cast - преобразование
                System.out.println(s);
            }
        }


    }
}