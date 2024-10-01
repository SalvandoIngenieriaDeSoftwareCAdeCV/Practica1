package IS.example.Practica1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practica1Application {

	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);
		/*Scanner entrada = new Scanner(System.in);
		int n;
		int dec = 0;
		while(dec != 2){
			System.out.println("Ingrese el numero n");
			n = entrada.nextInt();
			operaciones op = new operaciones();
			System.out.println("¿Que operación se realizara?");
			System.out.println("1.- Cerradura de Kleene y Cerradura Positiva");
			System.out.println("2.- Salir");
			dec = entrada.nextInt();
			switch(dec){
				case 1:
					op.cerraduraKleene(n);
					op.cerraduraPositiva(n);
				break;

				case 2:
					
				break;

				default:
					System.out.println("Ingrese una opción valida");
				break;

			}
		} */
		
		
	}

}
