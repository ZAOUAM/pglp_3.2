
import org.junit.Test;

public class EmployeTest {

	@Test
	public void Calcule_salaire_EmployeTest() {
		
		
		Employe E= new Employe("Jeff Bezos",2018); // 2020 - 2018 = 2 ans donc 2*20£ = 40£
		double expected=1540; // 1500 salaire de base + 40£
		assert (E.calculer_salaire()==expected);
	}

}
