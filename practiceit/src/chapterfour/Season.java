package chapterfour;

/*Write a method named season that takes two integers as parameters representing a month and day and that returns a String indicating the season for that month and day. Assume that months are specified as an integer between 1 and 12 (1 for January, 2 for February, and so on) and that the day of the month is a number between 1 and 31.

If the date falls between 12/16 and 3/15, you should return "Winter". If the date falls between 3/16 and 6/15, you should return "Spring". If the date falls between 6/16 and 9/15, you should return "Summer". And if the date falls between 9/16 and 12/15, you should return "Fall".*/

public class Season {
	
	public static String season(int i,int j){
		String  Fall="Fall";
		String  Winter="Winter";
		String  Summer="Summer";
		String  Spring="Spring";
		
		
		if((i==12)||(i<=3)){
			if(i==1||i==2){
				return Winter;
			}
			else if(i==3&&j<=15){
				return Winter;
					}
			else if(i==3&&j>=16){
					return Spring;
							}
			else if(i==12&&j<=15){
				return Fall;
					}
            else if(i==12&&j>=16){
				return Winter;
					}
			
				}
		else if(i>=4&&i<=6){
			
		        if(i==6&&j<=15){
		        	return Spring;
		        }
		         else if(i==4||i==5){
		        	return Spring;
		        }
		         else if(i==6&&j>=16){
		        	 return Summer;
		         }
			
		}
		else if(i>=7&&i<=9){
			
			 if(i==9&&j<=15){
			
			  return Summer;
			 }
			 else if(i==9&&j>=16){
				 return  Fall;
			 }
			 else if(i==7||i==8){
				 return Summer;
			 }
			
		}
		
			 return Fall;
			 

}

}
