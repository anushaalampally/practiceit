package chapterfour;
/*
Write a static method called quadrant that takes as parameters a pair of real numbers representing an (x, y) point and that returns the quadrant number for that point. Recall that quadrants are numbered as integers from 1 to 4 with the upper-right quadrant numbered 1 and the subsequent quadrants numbered in a counter-clockwise fashion:
	
	Notice that the quadrant is determined by whether the x and y coordinates are positive or negative numbers. If a point falls on the x-axis or the y-axis, then the method should return 0. Below are sample calls on the method.

			Call	Value Returned
			quadrant(12.4, 17.8)	1
			quadrant(-2.3, 3.5)	2
			quadrant(-15.2, -3.1)	3
			quadrant(4.5, -42.0)	4
			quadrant(0.0, 3.14)	0*/


public class Quadrant {
	
	public static int quadrant(double i,double j){
		 if(i>0&&j>0){
				return 1;
			}
				else  if(i<0&&j>0){
					return 2;
				}
					else  if(i<0&&j<0){
					 return 3;
					}
					 else if(i>0&&j<0){
							return 4;
						}
					 else{
						
						 return 0;
					 }
			
				}

}
