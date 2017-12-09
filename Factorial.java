import java.util.Scanner;
public class Factorial {
	public static void fac(int n){
		long total = 1 ;
		for (int i = n ; i > 0 ; i--){
			total *= i ;
		}
		System.out.println(total);
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an  integer (Max. 25) : ");
		int x = input.nextInt();
		fac(x);
	}

}