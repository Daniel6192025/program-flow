
/**
 * Write a description of class HelloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoWhileLoops
{

    int a = 5;
    int c = 1;
    int b = 2;
    int d = -8;

    public void run() {
        int i = 0;
        do {
            System.out.println("i is" + i + "less than 15");
        } while ( i < 15 );
    }
    {
        int k = 6;
        do {
            System.out.println("k is" + k + "greater than 5");
        } while ( k > 5);
    }
    {
        do {
            System.out.print("a is" + a + "less than 10" + " " + " b is" + b + "less than or equal to 20");
        } while (a < 10 && b <= 20);
    }

    public static void main(String[] args)
    {        
        DoWhileLoops hw = new DoWhileLoops();
        hw.run();
    }
}

