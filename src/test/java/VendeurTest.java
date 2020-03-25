import static org.junit.Assert.*;

import org.junit.Test;

public class VendeurTest {

	@Test
	public void CalculSalaireVendeurTest() {
		Vendeur V= new Vendeur("Jeff Bezos",2015);
		V.setCharge(150.5);
		double res=1700*5+ 150.5;
		assertEquals(res,V.calculer_salaire(),0);
	}

}
