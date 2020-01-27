package chapterfive;


/*The following method attempts to examine a number and return whether that number is prime (i.e., has no factors other than 1 and itself). A flag named prime is used. However, the Boolean logic is not implemented correctly, so the method does not always return the correct answer. In what cases does the method report an incorrect answer? Find the problem and change the code so that it will always return a correct result.*/

public class IsPrime {
	
	public static boolean isPrime(int n) {
		    boolean prime =false;
		    for (int i = 2; i < n; i++) {
		        if (n % i == 0) {
		            prime = false;
		                break;
		        } else {
		            prime = true;
		        }
		    }
		    return prime;
		}

}
