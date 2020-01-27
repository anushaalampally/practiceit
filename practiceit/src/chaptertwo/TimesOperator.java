package chaptertwo;

/*Suppose a real number variable x is defined. Write a single Java statement that stores as a variable y the result of the computation below, modifying the expression to use the * operator exactly four times when computing an equivalent value (hint: how could you factor out x here?).

y = 12.3x4 - 9.1x3 + 19.3x2 - 4.6x + 34.2*/
public class TimesOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		int y;
		    y=  (int) (12.3*x*x*x*x-9.1*x*x*x+4.6*x+34.2);
		    System.out.println("the value y:"+y);

	}

}
