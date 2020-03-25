import java.util.ArrayList;

public class Entreprise {
	
	private ArrayList<Employe> lise_emp;
	public Entreprise() {
		lise_emp = new ArrayList<Employe>();
	}
	
	/*
	 * La fonction qui permet de calculer la somme des salaires
	 *  des employés de l'entreprise
	 *  
	 * @return la sommme du salaire
	 */
	public double calcule_salaire2() {
		double somme;
		somme = 0;
		for (Employe emp: lise_emp) {
			somme = somme + emp.calculer_salaire();
		}
		return somme;
	}
	

	/*
	 * Ajouter un employé à l'entreprise
	 * @param E L'employé à ajouter
	 * 
	 */
	public void ajouter_employe(final Employe emp) {
		this.lise_emp.add(emp);
	}

}
