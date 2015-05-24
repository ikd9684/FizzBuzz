import java.io.PrintStream;


/**
 * <h2>いわゆる「FizzBuzz問題」を解いてみた</h2>
 * <p>
 * FizzBuzz問題とは以下の通り。<br/>
 * 1から100までの数をプリントするプログラムを書け。<br/>
 * ただし、<br/>
 * ・3の倍数のときは数の代わりに｢Fizz｣と、<br/>
 * ・5の倍数のときは｢Buzz｣とプリントし、<br/>
 * ・3と5両方の倍数の場合には｢FizzBuzz｣とプリントすること。<br/>
 * </p>
 *
 * @author ikd9684
 */
public class FizzBuzz {

    private static PrintStream out;

    public static void main(String[] args) {

        out = System.out;

        simpleFizzBuzz();
    }

    private static void writeLine(Object o) {
        out.println(o);
    }
    private static void writeLine(String format, Object... args) {
        out.printf(format, args);
        out.println();
    }

    public static void simpleFizzBuzz() {

        writeLine("Simple.");

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
