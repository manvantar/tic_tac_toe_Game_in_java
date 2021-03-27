package com.bridgelabz.tictactoe_game;
import java.util.Scanner;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		char[] tictac= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		int s=tictac.length,index=0;
		System.out.println(s);
		int winner=0;
		showBroad(tictac);
		while(winner!=0) {

			winner=checkBoard(tictac);
			if(winner==0) {


				char a=chooseChar();



				char changed[]=moveIntoBoard(tictac,a,index);
				if(changed[1]=='N') {

					char changed1[]=moveIntoBoard(tictac,a,index);

				}
				else {
					tictac[index]=changed[0];

				}
			}


		}
	}

	private static int checkBoard(char[] tic) {
		int check=0;
		if((tic[1]=='x'&& tic[2]=='x'&& tic[3]=='x') ||(tic[1]=='o'&& tic[2]=='o'&& tic[3]=='o')) {

			check=1;
		}
		else if((tic[4]=='x'&& tic[5]=='x'&& tic[6]=='x') ||(tic[4]=='o'&& tic[5]=='o'&& tic[6]=='o')) {

			check=1;
		}
		else if((tic[7]=='x'&& tic[8]=='x'&& tic[9]=='x') ||(tic[7]=='o'&& tic[8]=='o'&& tic[9]=='o')) {

			check=1;
		}

		else if((tic[1]=='x'&& tic[4]=='x'&& tic[7]=='x') ||(tic[7]=='1'&& tic[4]=='o'&& tic[7]=='o')) {

			check=1;
		}
		else if((tic[2]=='x'&& tic[5]=='x'&& tic[8]=='x') ||(tic[2]=='o'&& tic[5]=='o'&& tic[8]=='o')) {

			check=1;
		}
		else if((tic[3]=='x'&& tic[6]=='x'&& tic[9]=='x') ||(tic[3]=='o'&& tic[6]=='o'&& tic[9]=='o')) {

			check=1;
		}
		else if((tic[1]=='x'&& tic[5]=='x'&& tic[9]=='x') ||(tic[1]=='o'&& tic[5]=='o'&& tic[9]=='o')) {

			check=1;
		}
		else if((tic[7]=='x'&& tic[5]=='x'&& tic[3]=='x') ||(tic[7]=='o'&& tic[5]=='o'&& tic[3]=='o')) {

			check=1;
		}


		return check;
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
			if(i==1 || i==4 || i==7) {
				System.out.print("|");
			}
			System.out.print(in[i]+" ");
			if(i==3 || i==6 || i==9) {
				System.out.print("|");
			}
			if (i==3 || i==6) {
				System.out.println();
			}
		}
	}

	static char[] moveIntoBoard(char in[],char value,int index) {
		char ret[]= {' ',' '};
		if(in[index]==' ') {
			ret[0]=value;
			ret[1]='Y';
			return ret;
		}
		else {
			System.out.println("Place is already full");
			ret[0]=in[index];
			ret[1]='N';
			return ret;
		}
	}


}
