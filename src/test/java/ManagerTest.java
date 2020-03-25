import static org.junit.Assert.*;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void Calcule_Salaire_ManagerTest() {
		Manager M= new Manager("Jeff Bezos",2015);
		M.setNb_personnes(2);
		
		double res= 1700*5 + 100*2;
		assertEquals(res,M.calculer_salaire(),0);
	}

}
