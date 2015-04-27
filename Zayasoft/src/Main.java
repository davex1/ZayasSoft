import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int opcion=-1;
		
		int a=0,b=0;
		
		
		Scanner teclado = new Scanner(System.in);
		
		while (opcion!=0){
			
			System.out.println("Introduce 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir y 0 para salir: ");
			opcion=teclado.nextInt();
			if(opcion==1 || opcion==2 || opcion==3 || opcion==4){
				System.out.println("Introduce el valor del primer numero: ");
				a=teclado.nextInt();
				System.out.println("Introduce el valor del segundo numero: ");
				b=teclado.nextInt();
			}
		
			switch (opcion) {
			case 1:  Modulo2.sumar(a, b);
				break;
			case 2:  Modulo2.restar(a, b);
				break;
			case 3:  Modulo2.multiplicar(a, b);
				break;
			case 4:  Modulo2.division(a, b);
				break;
			case 0 : System.out.println("Has salido del programa.");
				break;
			default : System.out.println("Opción incorrecta.");
			}	
			System.out.println("");
			
		}
	
	}

}
