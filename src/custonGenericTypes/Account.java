package custonGenericTypes;

// неверный первый вариант
/*public class Account {
    private Object id;
    private int sum;

    public Account(Object id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }*/

    // верный второй вариант
    // отфакторим наш код используя Generic Types
    public class Account <T> {       // <T> - обычно так называют Generic Types
        /* написав <T> мы уже объявили, что есть некоторый передаваемый тип,
         который мы используем внутри нашего класса и он будет подставлен в те места, где мы этот тип используем*/

        private T id;
        private int sum;

        public Account(T id, int sum) {
            this.id = id;
            this.sum = sum;
        }

        public T getId() {
            return id;
        }

        public void setId(T id) {
            this.id = id;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }





    }
