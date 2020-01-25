package pth;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
			String s;
			int ci = Integer.parseInt(br.readLine());
			for (int i = 0; i < ci; i++) {
				System.out.println("Case #"+ (i+1) +":");
		    //while((s=br.readLine())!=null){
		    	String[] words = br.readLine().split("\\s");
		    	//System.out.println(words[0]);
		    	String one = words[0];
		    	String two = words[1];
		    	Maze maze = new Maze();
		    	List<String> l = new ArrayList<>();
				l = maze.lab(one,two);
				for (int j = 0; j < l.size(); j++) {
					   System.out.println(l.get(j));
				}
		    }
			//}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Îøèáêà!");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
