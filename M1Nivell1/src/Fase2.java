import java.util.*;

public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada=new Scanner(System.in);
		
        short YEAR = 1948; //ha de ser una constante
        byte gap = 4; //cada 4 a�os es a�o bisiesto
        int leapYear = 0; //inicializaci�n a�o bisiesto
        
        System.out.print("Introduce tu a�o de nacimiento: ");
        int birthYear=entrada.nextInt();
        System.out.print("\n");

        
        while (birthYear > YEAR)
        {   
            YEAR += gap;
            leapYear = leapYear + 1;   
        }
        System.out.print("Entre tu a�o de nacimiento y 1948 hay " + leapYear + " a�os bisiestos");
             
        entrada.close();
    }
}
	


