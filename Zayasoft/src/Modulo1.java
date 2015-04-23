import java.util.Scanner;


public class Modulo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int i = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		n=teclado.nextInt();
		
		while(i<n){
			System.out.println("Modulo ejecutándose");
			i++;
		}
		
	}
	
	

}
