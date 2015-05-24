package jp._9684.sandbox.fizzbuzz;

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
public abstract class AbstractFizzBuzz {

    private static PrintStream out = System.out;

    protected static void writeLine(Object o) {
        out.println(o);
    }
    protected static void writeLine(String format, Object... args) {
        out.printf(format, args);
        out.println();
    }

}
