package cse360assignment02;

public class AddingMachine {

    private int total;
    private StringBuffer transaction;

    public AddingMachine(){
        /*
         *
         */
        total = 0;
        transaction = new StringBuffer("0");

    }

    public int getTotal(){
        /* This method return
         * the total result
         */
        return total;
    }

    public void add(int value){
        /* This method takes in an integer
         * and add to the global variable total
         */
        total += value;
        transaction.append(" + " + value);

    }

    public void subtract(int value){
        /* This method takes in an integer
         * and subtract to the global variable total
         */
        total -= value;
        transaction.append(" - " + value);

    }

    public String toString(){
        /* This method print out
         * the final result statement
         */
        return transaction.toString();
    }

    public void clear(){
        /* This method clears out the program and reset the variable total
         *
         */
        total = 0;
        transaction = new StringBuffer("0");

    }
    public static void main(String[] arg){
        AddingMachine calc = new AddingMachine();
        calc.add(4);
        calc.subtract(2);
        calc.add(5);
        System.out.println(calc.toString());
        System.out.println(calc.total);
    }

}

