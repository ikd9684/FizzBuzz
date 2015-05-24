package jp._9684.sandbox.fizzbuzz;

import java.io.PrintStream;

/**
 * <h2>������uFizzBuzz���v�������Ă݂�</h2>
 * <p>
 * FizzBuzz���Ƃ͈ȉ��̒ʂ�B<br/>
 * 1����100�܂ł̐����v�����g����v���O�����������B<br/>
 * �������A<br/>
 * �E3�̔{���̂Ƃ��͐��̑���ɢFizz��ƁA<br/>
 * �E5�̔{���̂Ƃ��͢Buzz��ƃv�����g���A<br/>
 * �E3��5�����̔{���̏ꍇ�ɂ͢FizzBuzz��ƃv�����g���邱�ƁB<br/>
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
