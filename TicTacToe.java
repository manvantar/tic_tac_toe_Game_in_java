package com.bridgelabz.tictactoe_game;
import java.util.Scanner;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		char[] tictac= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		int s=tictac.length;
		System.out.println(s);
		char a=chooseChar();
		showBroad(tictac);
	}

	static char chooseChar(){
		Scanner s=new Scanner(System.in);
		System.out.println("choose x or o");
		char input=s.next().charAt(0);

		while(input !='x' && input != 'o') {	
			System.out.println("please choose x or o");	
			input=s.next().charAt(0);	
		}
		return input;

	} 
	static void showBroad(char in[]){
		int s=in.length;
		for (int i = 1; i < in.length; i++) {
			System.out.print(in[i]+" ");
			if (i==3 || i==6) {
				System.out.println();
			}

		}


	}


}
