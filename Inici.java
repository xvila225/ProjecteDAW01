package gestioDades.aplicacio;

import java.io.IOException;

public class Inici {

	public static void main(String[] args) throws IOException {

		Alumne a1 = new Alumne();
		Interficie it = new Interficie();
		String nom = new String("");

		nom = it.llegirNom();
		a1.setNom(nom);

		it.mostrarNomAlumne(a1.getNom());

	}

}
