package custonGenericTypes;

public class Main {
    public static void main(String[] args){
        Account acc1 = new Account(12345, 5000);
        System.out.println(acc1.getId());

        Account acc2 = new Account("sid12345", 5000);
        System.out.println(acc2.getId());

        // так можно
        int a = ((Integer) acc1.getId()) + 10;
        System.out.println(a);

        // но так нельзя, потому что там Object
        int b = ((Integer) acc2.getId()) + 10;
        System.out.println(b);

    }
}
