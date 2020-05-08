import java.util.ArrayList;
/*
 * Cette classe représente une entreprise qui embauche des employés tels que des manageurs, 
 * des vendeurs, ect. Le but est de calculer la somme globale des salaires de l'entreprise.
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
public class Entreprise {
	/*
	 * La liste des employés de l'entreprise.
	 */
	private ArrayList<Personnel_salarie> lise_emp;
	/*
	 * Le constructeur de la classe.
	 */
	public Entreprise() {
		lise_emp = new ArrayList<Personnel_salarie>();
	}
	/*
	 * Ajouter un employé à l'entreprise
	 * @param E L'employé à ajouter
	 * 
	 */
	public void ajouter_employe(Personnel_salarie emp) {
		this.lise_emp.add(emp);
	}
	/*
	 * supprimer un employé de l'entreprise
	 * @param E L'employé à supprimer
	 * 
	 */
	public void remove_employe(Personnel_salarie emp) {
		this.lise_emp.remove(emp);
	}
	/*
	 * La fonction qui permet de calculer la somme des salaires
	 * des employés de l'entreprise.
	 * @return la sommme du salaire
	 */
	public double calculer_salaire_entreprise() {
		double somme;
		somme = 0;
		for (Personnel_salarie emp: lise_emp) {
			somme = somme + emp.calculer_salaire();
		}
		return somme;
	}
}
