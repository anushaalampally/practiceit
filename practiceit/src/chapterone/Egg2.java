package chapterone;

/*
Write a complete Java program in a class named Egg2 that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

_______
/       \
/         \
\         /
\_______/
-"-'-"-'-"-
_______
/       \
/         \
\         /
\_______/
-"-'-"-'-"-
\         /
\_______/
_______
/       \
/         \
-"-'-"-'-"-
\         /
\_______/
*/
public class Egg2 {
	
	 public static void main(String[] args){
		        method1();
		        method3();
		        method2();
		        method1();
		        method3();
		        method2();
		        method3();
		        method1();
		        method2();
		        method3();
		       
		    }
		    public static void method1(){
		        System.out.println("  _______");
		        System.out.println(" /       \\");
		        System.out.println("/         \\");
		        
		       }
		    public static void method2(){
		       
		         System.out.println("-\"-'-\"-'-\"-");
		        
		    }
		    public static void method3(){
		         System.out.println("\\         / ");
		         System.out.println(" \\_______/ ");
		    }

}
