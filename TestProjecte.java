package gestioDades.aplicacio;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;


public class TestProjecte {
	@Test
	   public void testNom() throws IOException {
	      System.out.println("Sumar dos nombres positius ...");
	       Alumne al = new Alumne();
	       al.setNom("Joan");
	       assertTrue( al.getNom()== "Joan");
	    
	   }
	
	@Test
	   public void testEdat() throws IOException {
	      System.out.println("Sumar dos nombres positius ...");
	       Alumne al = new Alumne();
	       al.setEdat(10);
	       assertTrue( al.getEdat()== 10);
	   }

}
