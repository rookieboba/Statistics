package chap03_01;
import java.util.Scanner;

public class name {

	public static int sum=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.print("���� 10�� �Է�:");
		for(int i=0;i<arr.length;i++){
			arr[i]=stdin.nextInt(); 	
			if(arr[i]%3==0)
				sum+=arr[i];
		}
		System.out.print("�հ�:");
		System.out.print(sum);
	}
}
