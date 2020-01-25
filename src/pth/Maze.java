package pth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze {
	
	public List<String> lab(String pr, String ob) {
		String p = pr;
		String o = ob;	
		int angle = 180;
		int raz;
		if (p.length() > o.length()) {
			raz = p.length();
		}
		else {
			raz = o.length();
		}
		Cell [][]arr = new Cell[raz*2][raz*2];
		for(int k = 0; k < arr.length; k++) {
			for(int z = 0; z < arr[k].length; z++) {		
				arr[k][z] = new Cell("0");
			}
		}

		int n = raz;
		int m = raz;

		arr[n][m].setProi("y");
		arr[n][m].setN(true);

		for (int i = 1; i < p.length()-1; i++) {
			if (p.charAt(i) == 'W') {
				if (angle == 180) {
					arr[n][m].setProi("y");
					arr[n][m].setS(true);
					n++;
				}
				else if (angle == 270) {
					arr[n][m].setProi("y");
					arr[n][m].setW(true);
					m--;
				}
				else if (angle == 0) {
					
					arr[n][m].setProi("y");
					arr[n][m].setN(true);
					n--;
				}
				else if (angle == 90) {
					arr[n][m].setProi("y");
					arr[n][m].setE(true);
					m++;
				}
			}

			else if (p.charAt(i) == 'L') {
				if (angle == 0) {
					angle = 270;
				}
				else if (angle == 90) {
					angle-=90;
				}
				else if (angle == 180) {
					angle-=90;
				}
				else if (angle == 270) {
					angle-=90;
				}
			}
			else if (p.charAt(i) == 'R') {
				if (angle == 0) {
					angle+=90;
				}
				else if (angle == 90) {
					angle+=90;
				}
				else if (angle == 180) {
					angle+=90;
				}
				else if (angle == 270) {
					angle = 0;
				}
			}
		}
		
		
		if (angle == 0) {
			arr[n][m].setN(true);
			angle = 180;
		}
		else if (angle == 90) {
			arr[n][m].setE(true);
			angle = 270;
		}
		else if (angle == 180) {
			arr[n][m].setS(true);
			angle = 0;
		}
		else if (angle == 270) {
			arr[n][m].setW(true);
			angle = 90;
		}
		
		for (int i = 1; i < o.length()-1; i++) {
			if (o.charAt(i) == 'W') {
				if (angle == 180) {
					arr[n][m].setProi("y");
					arr[n][m].setS(true);
					n++;

				}
				else if (angle == 270) {
					arr[n][m].setProi("y");
					arr[n][m].setW(true);
					m--;

				}
				else if (angle == 0) {
					
					arr[n][m].setProi("y");
					arr[n][m].setN(true);
					n--;

				}
				else if (angle == 90) {
					arr[n][m].setProi("y");
					arr[n][m].setE(true);
					m++;

				}
			}

			else if (o.charAt(i) == 'L') {
				if (angle == 0) {
					angle = 270;
				}
				else if (angle == 90) {
					angle-=90;
				}
				else if (angle == 180) {
					angle-=90;
				}
				else if (angle == 270) {
					angle-=90;
				}
			}
			else if (o.charAt(i) == 'R') {

				if (angle == 0) {
					angle+=90;
				}
				else if (angle == 90) {
					angle+=90;
				}
				else if (angle == 180) {
					angle+=90;
				}
				else if (angle == 270) {
					angle = 0;
				}
			}
		}
		arr[n][m].setN(true);

		List<String> fin = new ArrayList<>();
		for(int k = 0; k < arr.length; k++) {
			String t = "";
			for(int z = 0; z < arr[k].length; z++) {
				if (arr[k][z].getProi().equals("y")) {
					if (arr[k][z].isN() && !arr[k][z].isS() && !arr[k][z].isW() && !arr[k][z].isE()) {
						t = t + "1";
					}
					if (!arr[k][z].isN() && arr[k][z].isS() && !arr[k][z].isW() && !arr[k][z].isE()) {
						t = t + "2";
					}
					if (arr[k][z].isN() && arr[k][z].isS() && !arr[k][z].isW() && !arr[k][z].isE()) {
						t = t + "3";
					}
					if (!arr[k][z].isN() && !arr[k][z].isS() && arr[k][z].isW() && !arr[k][z].isE()) {
						t = t + "4";
					}
					if (arr[k][z].isN() && !arr[k][z].isS() && arr[k][z].isW() && !arr[k][z].isE()) {
						t = t + "5";
					}
					if (!arr[k][z].isN() && arr[k][z].isS() && arr[k][z].isW() && !arr[k][z].isE()) {
						t = t + "6";
					}
					if (arr[k][z].isN() && arr[k][z].isS() && arr[k][z].isW() && !arr[k][z].isE()) {
						t = t + "7";
					}
					if (!arr[k][z].isN() && !arr[k][z].isS() && !arr[k][z].isW() && arr[k][z].isE()) {
						t = t + "8";
					}
					if (arr[k][z].isN() && !arr[k][z].isS() && !arr[k][z].isW() && arr[k][z].isE()) {
						t = t + "9";
					}
					if (!arr[k][z].isN() && arr[k][z].isS() && !arr[k][z].isW() && arr[k][z].isE()) {
						t = t + "a";
					}
					if (arr[k][z].isN() && arr[k][z].isS() && !arr[k][z].isW() && arr[k][z].isE()) {
						t = t + "b";
					}
					if (!arr[k][z].isN() && !arr[k][z].isS() && arr[k][z].isW() && arr[k][z].isE()) {
						t = t + "c";
					}
					if (arr[k][z].isN() && !arr[k][z].isS() && arr[k][z].isW() && arr[k][z].isE()) {
						t = t + "d";
					}
					if (!arr[k][z].isN() && arr[k][z].isS() && arr[k][z].isW() && arr[k][z].isE()) {
						t = t + "e";
					}
					if (arr[k][z].isN() && arr[k][z].isS() && arr[k][z].isW() && arr[k][z].isE()) {
						t = t + "f";
					}
				}	
			}
			fin.add(t);
		}
		fin.removeAll(Arrays.asList(""));
		return fin;		
	}
}
