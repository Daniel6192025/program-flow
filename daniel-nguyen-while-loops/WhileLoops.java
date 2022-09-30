
/**
 * Write a description of class HelloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileLoops
{

    int a = 5;
    int c = 1;
    int b = 2;
    int d = -8;

    
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is" + i + "less than 15");
        }
    }
    {
        int k = 6;
        while (k > 5) {
            System.out.println("k is" + k + "greater than 5");
        }
    }
    {
        while (a < 10 && b <= 20) {
            System.out.print("a is" + a + "less than 10" + " " + " b is" + b + "less than or equal to 20");
        }
    }

    public static void main(String[] args)
    {        
        WhileLoops hw = new WhileLoops();
        hw.run();
    }
}

