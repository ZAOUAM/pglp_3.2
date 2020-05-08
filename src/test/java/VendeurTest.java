import static org.junit.Assert.*;

import org.junit.Test;

public class VendeurTest {

	@Test
	public void CalculSalaireVendeurTest() {
		
		Vendeur V= new Vendeur("Jeff Bezos",2015); //5ans
		V.setCharge(150.5); // charge
		double res=1500+ 150.5;
		assertEquals(res,V.calculer_salaire(),0);
	}
}
