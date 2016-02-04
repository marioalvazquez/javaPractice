import java.util.Scanner;
public class New{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.println("Deme un número:");
		String x = lector.nextLine();
		System.out.println("Deme el siguiente:");
		String y = lector.nextLine();
		String total = x+y;
		int resultado = Integer.parseInt(total,16);
		System.out.println("su número en Decimal es: " + resultado + ".");

	}
}

