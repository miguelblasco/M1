import java.util.Scanner;

public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int YEAR = 1948; 
        int gap = 4; //cada 4 años es año bisiesto
        int leapYear = 0; //inicialización año bisiesto
        int birthYear = 0;
        boolean esBisiesto;
        String loEs = "Tu año de nacimiento es bisiesto";
        String noLoEs = "Tu año de nacimiento no es bisiesto";

            System.out.print("Introduce tu año de nacimiento:");
            
            Scanner entrada = new Scanner(System.in);
            birthYear = entrada.nextInt();

        if (birthYear >= YEAR) { //if para garantizar que birthYear sea mayor que YEAR
        

            for (int i = YEAR; i <= birthYear; i += gap) {
                leapYear = leapYear + 1;

                System.out.println(YEAR);
                YEAR = YEAR + gap;
            }

            YEAR = YEAR - (leapYear * 4); //para que YEAR vuelva a ser 1948
            System.out.println("Entre tu año de nacimiento" + birthYear + " y " + YEAR + " hay " + leapYear + " años bisiestos");

            esBisiesto = (birthYear % gap) == 0;
            
            
            if (esBisiesto) {
            	System.out.print(esBisiesto + ":" + loEs);
            }else System.out.print(esBisiesto + ":" + noLoEs);

        }else System.out.print("Incorrecto: el año debe ser >= 1948");
               
        entrada.close();
    }
}
