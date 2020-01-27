package chapterten;

/*
Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of 
the strings of even length from the list.*/
import java.util.ArrayList;

public class RemoveEvenLength {
	public static void removeEvenLength(ArrayList<String> a){
		for(int i=0;i<a.size();i++){
			if(a.get(i).length()%2==0){
				a.remove(a.get(i));
                i--;
			}
			}
		System.out.println(a);
	}
}
