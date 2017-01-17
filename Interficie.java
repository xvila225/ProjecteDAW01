package gestioDades.aplicacio;

import java.io.*;

public class Interficie {
	
	public String llegirNom()  throws IOException{
		/* El m�tode main necessita la cl�usula throws IOException perqu� al cridar el m�tode readLine
		 * sin� ho tinguessim es produiria un error de compilaci�. Hi ha m�todes que requereixen que controlis
		 * possibles errors que es poden produir en la execuci� del programa. Per exemple que al llegir dades
		 * no tinguis mem�ria RAM.
		 */	
		
		InputStreamReader entrada = new InputStreamReader(System.in);
		/*La classe InputStreamReader controla l'entrada de dades a trav�s del teclat. Es a dir, recull informaci� del teclat.
		* System.in indica la entrada est�ndar de dades, que �s el teclat.*/
		
		BufferedReader teclat = new BufferedReader(entrada);
		/* La classe BufferedReader reserva mem�ria per guardar les dades que s'inserten. Es a dir, guarda la informaci� a mem�ria*/
		
		// Per utilitzar les dues classes anteriors necessitem importar java.io.*
		
		/* Tamb� es podria haver posat tot junt:
		 * BufferedReader teclat = new BufferedReader(new InputStreamReader(System.in));
		 */
		
		System.out.println("Inserti el nom de l'Alumne:");
		
		/* El objecte de tipus BufferedReader t� un m�tode anomenat readLine() que obt� tot el que
		 * s'inserta a trav�s del teclat fins que l'usuari presioni enter.
		 */
		String nom = teclat.readLine();
		//return "Joan";
		return nom;
		
	}	
	
	public void mostrarNomAlumne(String nomAlumne){
		System.out.println("El nom de l'Alumne �s: ".concat(nomAlumne));
	}

}
