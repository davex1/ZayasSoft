
public class Modulo2 {

	public static void main(String[] args) {
		
		sumar(2,2);
		restar(4,2);
		multiplicar(3,3);
		division(5,2);
		
		
	}
	
	
		public static void sumar(int a, int b){
			System.out.println("El resultado de la suma es: "+a+b);
		}
	
		public static void restar(int a, int b){
			System.out.println("El resultado de la resta es: "+(a-b));
		}
	
		public static void multiplicar(int a, int b){
			System.out.println("El resultado de la multiplicacion es: "+(a*b));
		}
	
		public static void division(double a, double b){
			System.out.println("El resultado de la division es: "+(a/b));
		}
	
	
}
