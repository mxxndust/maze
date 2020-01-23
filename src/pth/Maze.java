package pth;

import java.util.ArrayList;
import java.util.List;


public class Maze {

	public static void main(String[] args) {
		Maze maze = new Maze();
		maze.run();

	}
	
	public void run() {
		String p = "WRWWLWWLWWLWLWRRWRWWWRWWRWLW";
		String o = "WWRRWLWLWWLWWLWWRWWRWWLW";		
		int angle = 180;	
		String [][] arr = new String [p.length()*2][p.length()*2];
		/*for(int k = 0; k < arr.length; k++) {
			for(int z = 0; z < arr[k].length; z++) {		
				//arr[k][z]= "0";
				System.out.print(arr[k][z] + "\t");
			}
			System.out.println();
		}*/
		//List<List<String>> row = new ArrayList<>();

		int n = arr.length/2;
		int m = arr.length/2;
		for (int i = 1; i < p.length()-1; i++) {
			if (p.charAt(i) == 'W') {
				if (angle == 180) {

					if (arr[n][m] == null) {
						arr[n][m] = "s";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "s";
			        }
					n++;
				}
				else if (angle == 270) {
					
					if (arr[n][m] == null) {
			        	arr[n][m] = "w";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "w";
			        }
					m--;
				}
				else if (angle == 0) {
					
					if (arr[n][m] == null) {
			        	arr[n][m] = "n";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "n";
			        }
					n--;
				}
				else if (angle == 90) {
					
					if (arr[n][m] == null) {
			        	arr[n][m] = "e";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "e";
			        }
					m++;
				}
			}

			else if (p.charAt(i) == 'L') {
				if (angle == 0) {
					angle = 270;
				}
				else {
					angle-=90;
				}
			}
			else if (p.charAt(i) == 'R') {
				if (angle == 270) {
					angle = 0;
				}
				else {
					angle+=90;
				}
			}
		}
		System.out.println(angle);
		switch (angle) {
		case 0:
			angle = 180;
		case 90:
			angle = 270;
		case 180:
			angle = 0;
		case 270:
			angle = 90;
		}
		//angle = 0;
		System.out.println(angle);
		for (int i = 1; i < o.length()-2; i++) {
			if (o.charAt(i) == 'W') {
				if (angle == 180) {

					if (arr[n][m] == null) {
						arr[n][m] = "s";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "s";
			        }
					n++;
				}
				else if (angle == 270) {
					
					if (arr[n][m] == null) {
			        	arr[n][m] = "w";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "w";
			        }
					m--;
				}
				else if (angle == 0) {
					
					if (arr[n][m] == null) {
			        	arr[n][m] = "n";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "n";
			        }
					n--;
				}
				else if (angle == 90) {
					
					if (arr[n][m] == null) {
			        	arr[n][m] = "e";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "e";
			        }
					m++;
				}
			}

			else if (o.charAt(i) == 'L') {
				if (angle == 0) {
					angle = 270;
				}
				else {
					angle-=90;
				}
			}
			else if (o.charAt(i) == 'R') {
				if (angle == 270) {
					angle = 0;
				}
				else {
					angle+=90;
				}
			}
		}
		for(int k = 0; k < arr.length; k++) {
			for(int z = 0; z < arr[k].length; z++) {		
				System.out.print(arr[k][z] + "\t");
			}
			System.out.println();
		}
	}
}
