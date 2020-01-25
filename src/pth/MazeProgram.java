package pth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MazeProgram {
	
	public static void main(String[] args) {
		MazeProgram prog = new MazeProgram();
		prog.run();
	}
	
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\small-test.in.txt"));
			//BufferedReader br = new BufferedReader(new FileReader("D:\\large-test.in.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\small.output.txt"));
			//BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\large.output.txt"));
			String s;
			int ci = Integer.parseInt(br.readLine());
			for (int i = 0; i < ci; i++) {
				//System.out.println("Case #"+ (i+1) +":");
		    	String[] words = br.readLine().split("\\s");
		    	String one = words[0];
		    	String two = words[1];
		    	Maze maze = new Maze();
		    	List<String> l = new ArrayList<>();
				l = maze.lab(one,two);
				/*for (int j = 0; j < l.size(); j++) {
					   System.out.println(l.get(j));
				}*/
	            bw.write("Case #"+ (i+1) +":"+ "\n");
	            for (int j = 0; j < l.size(); j++) {       	
	            	bw.write(l.get(j) + "\n");
				}
	            bw.flush();
		    }
			System.out.println("Готово!");
			 br.close();
	         bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ошибка!");
			//e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
