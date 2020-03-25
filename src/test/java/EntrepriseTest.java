import static org.junit.Assert.*;

import org.junit.Test;

public class EntrepriseTest {

	@Test
	
	public void test_calcul_somme_salaires() {
		
		Entreprise E=new Entreprise();
		Employe e= new Employe("Jeff Bezos",2018);
		Vendeur v=new Vendeur("Silver Blake",2015);
		v.setCharge(100.5);
		Manager m=new Manager("André Julien",2010);
		E.ajouter_employe(e);
		E.ajouter_employe(v);
		E.ajouter_employe(m);
		
		double res = 1700*2+1700*5+100.5+1700*10+100*1;
		
		assertEquals(res,E.calcule_salaire2(),0);
		
	}
}
