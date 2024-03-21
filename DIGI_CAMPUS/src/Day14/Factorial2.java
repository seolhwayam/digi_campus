package Day14;

import java.util.Scanner;

public class Factorial2 {
	int num=1;
	int n;
	
	public int factorial(int a) {
		n=a;
		while(true) {
			if(n==0) {
				break;
			}
			num*=n;
			n--;
			factorial(n);
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		System.out.println("팩토리얼 수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		Factorial2 f = new Factorial2();
		System.out.println("팩토리얼 결과 : "+f.factorial(sc.nextInt()));

	}

}
