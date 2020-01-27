package chaptertwo;

/*The following program redundantly repeats the same expressions many times.
Modify the program to remove all redundant expressions using variables of appropriate types.*/
public class Receipt {

	public static void main(String[] args) {
		int    x=38+40+30;
		        double y=.08;
		        double z=.15;
		        System.out.println("Subtotal:");
		        System.out.println(x);
		        System.out.println("Tax:");
		        
		        double a=x*y;
		        System.out.println(a);
		        System.out.println("Tip:");
		        
		        double b=x*z;
		        System.out.println(b);
		        System.out.println("Total:");
		        System.out.println(x+a+b);

	}

}
