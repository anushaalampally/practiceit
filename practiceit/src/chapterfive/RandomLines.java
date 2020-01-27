package chapterfive;

import java.util.Random;
/*Write a method called randomLines that prints between 5 and 10 random strings of letters (between "a" and "z"), one per line. Each string should have random length of up to 80 characters.

rlcuhubm
ilons
ahidbxonunonheuxudxrcgdp
xmkmkmmmmwmwqjbaeeeerceheelciheihcreidercdeehiuhhhn
hdcrphdidcrydxgtkdhoendgcidgxfidgfufdgfuuuuuu
(Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)*/

public class RandomLines {
	
	public static void  randomLines(){
		Random r1=new Random();
		int j=r1.nextInt(5)+5;
		for(int m=0;m<j;m++){
		int k;
		int l;
		Random r=new Random();
		k=r.nextInt(80)+1;
		for(int i=0;i<k;i++){
			l=r.nextInt(26)+97;
			System.out.print(Character.toString ((char) l));
            
		}
		
		System.out.println();
		}
	}

}
