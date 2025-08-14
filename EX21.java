
package Lec2_Variable;
public class EX21 {
    public static void main(String[] args) {
        int x = 1;
        int y = x + ++x - x-- - x++ + x - x--;
        System.out.println("Exercise 21:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

