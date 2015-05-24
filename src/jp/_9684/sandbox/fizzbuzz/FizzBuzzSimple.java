package jp._9684.sandbox.fizzbuzz;

public class FizzBuzzSimple extends AbstractFizzBuzz {

    public static void main(String[] args) {

        writeLine("Simple.");

        runFizzBuzz();
    }

    public static void runFizzBuzz() {

        for (int i = 1; i <= 100; i++) {

            String s = "";
            if(i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if (s.equals("")) {
                s = String.valueOf(i);
            }

            writeLine("%d : %s", i, s);
        }
    }

}
