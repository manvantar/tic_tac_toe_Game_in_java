package com.bridgelabz.tictactoe_game;
import java.util.*;

public class TicTacToe {

	public static void main(String[] args) {
		int index=0,findwinner=0, won=0;
		char[] tictac= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		//System.out.println(s);
		Random r=new Random();
		int toss=r.nextInt(10)%2+1;
		if(toss==1) {
			//System.out.println("Player x won the toss");
			//char a=chooseChar(1);
		}
		else {
			//System.out.println("Player o won the toss");
			//char a=chooseChar(2);
		}

		showBroad(tictac);
		int i =1;
		while( won !=1) {
			int winner0[]=checkBoard(tictac);
			won=winner0[0];
			if(won==0) {
				char a;
				a=chooseChar(i);
				System.out.println(a+ "  player choose the place or index");
				Scanner s1=new Scanner(System.in);
				index=s1.nextInt();
				char changed[]=moveIntoBoard(tictac,a,index);
				int winner2[]=checkBoard(tictac);
				won=winner2[0];
				if(changed[1]=='N') {
					while(changed[1]=='N') {

						System.out.println(a+ "  place is full choose the place or index");
						index=s1.nextInt();
						showBroad(tictac);
						char changed1[]=moveIntoBoard(tictac,a,index);
						changed[1]=changed1[1];
						if(changed1[1]=='Y') {
							tictac[index]=changed1[0];
							showBroad(tictac);
						}
					}
				}
				else {
					tictac[index]=changed[0];
					showBroad(tictac);
				}
			}
			i++;
		}
		int winner1[]=checkBoard(tictac);
		won=winner1[0];
		findwinner=winner1[1];
		if(winner1[1]==1) {

			System.out.println("x won");
		}
		else if(winner1[1]==2) {
			System.out.println("o won");

		}
	}

	private static int[] checkBoard(char[] tic) {
		int check[]={0,0};		

		if((tic[1]=='x'&& tic[2]=='x'&& tic[3]=='x') ||(tic[4]=='x'&& tic[5]=='x'&& tic[6]=='x')||
				(tic[7]=='x'&& tic[8]=='x'&& tic[9]=='x')|| (tic[1]=='x'&& tic[4]=='x'&& tic[7]=='x')||
				(tic[2]=='x'&& tic[5]=='x'&& tic[8]=='x')||(tic[3]=='x'&& tic[6]=='x'&& tic[9]=='x')||
				(tic[1]=='x'&& tic[5]=='x'&& tic[9]=='x')||(tic[7]=='x'&& tic[5]=='x'&& tic[3]=='x')) {
			check[1]=1;
			check[0]=1;
		}
		else if((tic[1]=='o'&& tic[2]=='o'&& tic[3]=='o') ||(tic[4]=='o'&& tic[5]=='o'&& tic[6]=='o')||
				(tic[7]=='o'&& tic[8]=='o'&& tic[9]=='o')||(tic[7]=='1'&& tic[4]=='o'&& tic[1]=='o')||
				(tic[2]=='o'&& tic[5]=='o'&& tic[8]=='o')||(tic[3]=='o'&& tic[6]=='o'&& tic[9]=='o')||
				(tic[1]=='o'&& tic[5]=='o'&& tic[9]=='o')||(tic[7]=='o'&& tic[5]=='o'&& tic[3]=='o')) {
			check[1]=2;
			check[0]=1;
		}
		//System.out.println("check is "+ check[0]);

		return check ;
	}


	static char chooseChar(int a){
		char usr;
		int user=a%2;
		if(user==1) {
			usr='x';
		}
		else {
			usr='o';
		}
		return usr;
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

		System.out.println();

	}

	static char[] moveIntoBoard(char in[],char value,int index) {
		char ret[]= {' ','N'};
		int s=in.length;

		if(index<=s && in[index]==' ') {
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
