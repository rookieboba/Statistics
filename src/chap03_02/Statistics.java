package chap03_02;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class Statistics {

	static void Random(int i,int j){
		Random rd=new Random();
		int score[][]=new int[i][j];
		for(i=0;i<score.length;i++){
			for(j=0;j<score[0].length;j++){
				score[i][j]=rd.nextInt(101);
			}
		}
		
	}
	
	static void Print(int i,int j){
		
		int score[][]=new int[i][j];
		
		for(i=0;i<score.length;i++){
			for(j=0;j<score[0].length;j++){
				
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void Sort(int i,int j){
		int[][]score=new int [i][j];
		
		for(i=0;i<score.length;i++){
			for(j=0;j<score[0].length;j++){
				Arrays.sort(score[i][j]);
			}
		}
	}
	
	public static void main(String args[]){

		Scanner stdin=new Scanner(System.in);
		
		System.out.print("행과 열 입력하시오>>");
		int i=stdin.nextInt();
		int j=stdin.nextInt();
		
		Random(i,j);
		Sort(i,j);
		Print(i,j);
	}
}
