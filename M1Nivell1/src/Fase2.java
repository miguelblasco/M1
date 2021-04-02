import java.util.*;

public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada=new Scanner(System.in);
		
        short YEAR = 1948; //ha de ser una constante
        byte gap = 4; //cada 4 años es año bisiesto
        int leapYear = 0; //inicialización año bisiesto
        
        System.out.print("Introduce tu año de nacimiento: ");
        int birthYear=entrada.nextInt();
        System.out.print("\n");

        
        while (birthYear > YEAR)
        {   
            YEAR += gap;
            leapYear = leapYear + 1;   
        }
        System.out.print("Entre tu año de nacimiento y 1948 hay " + leapYear + " años bisiestos");
             
        entrada.close();
    }
}
	


