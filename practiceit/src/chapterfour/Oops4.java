package chapterfour;

/*The following program contains 7 errors. Correct the errors and submit a working version of the program. The corrected version of the program should produce the following output:

a is the smallest!*/

public class Oops4 {
    public static void main(String[] args) {
       
        minimum(7,42);
      
    }

    public static void minimum(int a, int b) {
        if (a < b) {
             System.out.println("a is the smallest!");
           
        } else {
             System.out.println("b is the smallest!");
        }
       
    }
}