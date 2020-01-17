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
		
		int angle = 0;
		
		/*if (angle == 0) {
			List<List<String>> row = new ArrayList<>();
			//for(List<String> s : row) {
			for(int n=0; n < row.size(); ++n) {
				ArrayList <String> col = new ArrayList<>();
				//for(String st : col) {
				for(int m=0; m < row.size(); ++m) {
					
				}
			}
		}*/
		
		for (int i = 0; i < p.length()-2; ++i) {
			if (p.valueOf(i).equals('W')) {
				if (angle == 180) {
					
				}
				else if (angle == 270) {
					
				}
				else if (angle == 360) {
					
				}
				else if (angle == 90) {
					
				}
				
				//Cell currentCell = row.get().get();
			}
			else if (p.valueOf(i).equals('L')) {
				if (angle == 0) {
					angle = 270;
				}
				else {
					angle-=90;
				}
			}
			else if (p.valueOf(i).equals('R')) {
				if (angle == 270) {
					angle = 0;
				}
				else {
					angle+=90;
				}
			}
		}
	}

}
