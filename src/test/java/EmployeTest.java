import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeTest {

	@Test
	public void Calcule_salaire_EmployeTest() {
		
		
		Employe E= new Employe("Jeff Bezos",2018);
		double expected=3400;
		assert (E.calculer_salaire()==expected);
	}

}
