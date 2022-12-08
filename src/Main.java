import java.util.ArrayList;
import java.util.HashMap;
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
        // ОсновнойТип <ТипПараметр>
        // ОсновнойТип <ТипПараметр1>, ОсновнойТип <ТипПараметр2>, ОсновнойТип <ТипПараметр3> и т.д.

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

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(7, "Привет");
        map.put(15, "Hello");

        ArrayList<String> listHello = new ArrayList<>();
        listHello.add("Привет");
        listHello.add("Hi");

        ArrayList<String> listBye = new ArrayList<>();
        listBye.add("Пока");
        listBye.add("Good Bye");

        // вложенный ArrayList в ArrayList
        ArrayList<ArrayList<String>> list = new ArrayList();
        list.add(listHello);
        list.add(listBye);

        // можем сразу перечислить оба списка
        for(ArrayList<String> list2 : list){
            for(String s : list2){
                System.out.println(s);
            }
        }

    }
}


/*
*               то, что мы делаем в коде                       то, во что преобразует компилятор
* ArrayList<Integer> List = new ArrayList<Integer>();          ArrayList list = new ArrayList;
* list.add(1);                                                 list.add((Integer) 1);
* int x = list.get(0);                                         int x = (Integer) list.get(0);
* list.set(0,10);                                              list.set(0, (Integer) 10);
* */

