
package Lec2_Variable;
public class EX22 {
    public static void main(String[] args) {
        int x = 1;
        int z = x - x-- - x++ + --x - x + x-- + x;
        System.out.println("Exercise 22:");
        System.out.println("x = " + x);
        System.out.println("z = " + z);
    }
}
