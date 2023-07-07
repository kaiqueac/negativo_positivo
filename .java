import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Qual o seu número?");
		x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("Não negativo");
		}
		else if (x <= -1){
			System.out.println("Negativo");
			}
		sc.close();
	}
}
