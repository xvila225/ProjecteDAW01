package gestioDades.aplicacio;

public class Alumne {
	
	private String nom = new String("");
	private int edat = 0;
	
	
	
	
	/**
	 * Funció per actualitzar el nom de l'Alumne
	 * @param nomAl jajaja
	 */
	public void setNom(String nomAl){
		nom= nomAl;
	}

	public String getNom(){
		return this.nom;
	}
	
	
	public void setEdat (int edatAl){
		
		edat=edatAl;
	}	
	
	public int getEdat(){
		return edat;
	}
	

}
