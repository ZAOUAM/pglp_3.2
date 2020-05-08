import static org.junit.Assert.*;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void Calcule_Salaire_ManagerTest() {
		
		Manager M= new Manager("Jeff Bezos",2015);
		M.setNb_personnes(2);
		
		double res= 1500+ 100*2; // 2*100 car il s'occupe de deux employés
		assertEquals(res,M.calculer_salaire(),0);
	}

}
