package morseCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MorseTree {

	public static void main(String[] args) throws FileNotFoundException {
		MorseNode tree = new MorseNode(' ');
		Scanner input = new Scanner(new File("Morse1.dat"));
		while(input.hasNext()){
			MorseNode temp = tree;
			String line = input.nextLine();
			int length = Integer.parseInt(line.substring(2, 3));
			String code = line.substring(4);
			
			for(int i = 0; i < length - 1; i++){
				if(code.substring(i, i+1).equals("."))
					temp = temp.getDot();
				else
					temp = temp.getDash();
			}
			if(code.substring(code.length() - 1).equals("."))
				temp.setDot(new MorseNode(line.charAt(0)));
			else
				temp.setDash(new MorseNode(line.charAt(0)));
			
		}
		input = new Scanner(new File("Morse2.dat"));
		while(input.hasNext()){
			String line = input.nextLine();
		}
	}
	public static void inOrder(MorseNode root){
		if(root != null){
			inOrder(root.getDot());
			System.out.print(root.getValue());
			inOrder(root.getDash());
		}
	}
}
