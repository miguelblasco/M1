import java.util.Scanner;

public class Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String NombreCompleto = "Miguel Blasco Gonz�lez";
		String FechaNacimiento = "11/10/1977";
		int birthYear = 0;
				
		System.out.println(NombreCompleto);
		System.out.println(FechaNacimiento);
		System.out.print("\n");
		System.out.print("Introduce tu a�o de nacimiento: ");
		
		Scanner entrada = new Scanner(System.in);
        birthYear = entrada.nextInt();
        System.out.print("\n");
        
		if (birthYear % 4 == 0){
			System.out.print("Tu a�o de nacimiento es bisiesto");	
		}else System.out.print("Tu a�o de nacimiento no es bisiesto");
		
		entrada.close();	
	}
}
