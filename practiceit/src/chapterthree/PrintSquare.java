package chapterthree;

/*
Write a method called printSquare that takes in two integer parameters, a min and a max, and prints the numbers in the range from min to max inclusive in a square pattern. The square pattern is easier to understand by example than by explanation, so take a look at the sample method calls and their resulting console output in the table below.

Each line of the square consists of a circular sequence of increasing integers between min and max. Each line prints a different permutation of this sequence. The first line begins with min, the second line begins with min + 1, and so on. When the sequence in any line reaches max, it wraps around back to min.

You may assume the caller of the method will pass a min and a max parameter such that min is less than or equal to max.

Call	printSquare(1, 5);
Output:
	12345
	23451
	34512
	45123
	51234
printSquare(3, 9);
Output:
	3456789
	4567893
	5678934
	6789345
	7893456
	8934567
	9345678
printSquare(0, 3);	
output:
	0123
	1230
	2301
	3012
printSquare(5, 5);
output:
	5
	*/


public class PrintSquare {
	


	
	public static void  printSquare(int a,int b){
		int c;
		int k=a;
		c=a;
		for(int i=0;i<=b-a;i++){
			
			for(int j=0;j<=b-a;j++){
				System.out.print(c);
				c++;
				if(c>b){
					c=a;
				}
				}
			k++;
			c=k;
          System.out.println();

        }
    }

}
