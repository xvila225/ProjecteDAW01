package gestioDades.aplicacio;

import java.io.*;

public class Interficie {
	
	public String llegirNom()  throws IOException{
		/* El mètode main necessita la clàusula throws IOException perquè al cridar el mètode readLine
		 * sinó ho tinguessim es produiria un error de compilació. Hi ha mètodes que requereixen que controlis
		 * possibles errors que es poden produir en la execució del programa. Per exemple que al llegir dades
		 * no tinguis memòria RAM.
		 */	
		
		InputStreamReader entrada = new InputStreamReader(System.in);
		/*La classe InputStreamReader controla l'entrada de dades a través del teclat. Es a dir, recull informació del teclat.
		* System.in indica la entrada estàndar de dades, que és el teclat.*/
		
		BufferedReader teclat = new BufferedReader(entrada);
		/* La classe BufferedReader reserva memòria per guardar les dades que s'inserten. Es a dir, guarda la informació a memòria*/
		
		// Per utilitzar les dues classes anteriors necessitem importar java.io.*
		
		/* També es podria haver posat tot junt:
		 * BufferedReader teclat = new BufferedReader(new InputStreamReader(System.in));
		 */
		
		System.out.println("Inserti el nom de l'Alumne:");
		
		/* El objecte de tipus BufferedReader té un mètode anomenat readLine() que obté tot el que
		 * s'inserta a través del teclat fins que l'usuari presioni enter.
		 */
		String nom = teclat.readLine();
		//return "Joan";
		return nom;
		
	}	
	
	public void mostrarNomAlumne(String nomAlumne){
		System.out.println("El nom de l'Alumne és: ".concat(nomAlumne));
	}

}
