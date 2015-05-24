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
