import java.util.Calendar;
/*
 * Cette classe représente un employé d'une entreprise quelconque.
 * Chaque employé possède un nom "nom_emp", la date d'arrivée de l'employé dans 
 * l'entreprise "annee_arrivee" et son salaire de base "salaire_de_base"
 * fixé 1500£.
 * 
 * @author ZAOUAM Sirageddibe
 * @version 2.0
 */
public class Employe extends Personnel_salarie {
	/*
	 * Le constructeur de la calsse Employé.
	 * @param nom est le nom de l'employé
	 * @param annee est l'année d'arrivée de l'employé
	 */
	public Employe(final String nom_emp, final int annee_emp) {
		super(1500);
		this.nom_emp = nom_emp;
		this.annee_arrivee = annee_emp;
	}
	/*
	 * Retourne le nom de l'employé
	 * @return le nom de l'employe
	 */
	public String getNom() {
		return nom_emp;
	}
	/*
	 * Retourne la date d'arrivé de l'employé
	 * @return l'année d'arrivée
	 */
	public int getDate_arrivee() {
		return annee_arrivee;
	}
	/*
	 * Fontion qui calcule le salaire d'un employé.
	 * @return le salaire de l'employé en fonction de son ancienneté
	 */
	public double calculer_salaire() {
		Calendar c = Calendar.getInstance();
		
		int anneeCourante = c.get(Calendar.YEAR);
		double res= salaire_de_base + (anneeCourante - annee_arrivee) *20;
		
		return res;
	}
	/*
	 * Fontion qui renvoie le salaire de base d'un employé.
	 * @return le salaire de l'employé
	 */
	public double getSalaire() {
		return salaire_de_base;
	}
	

}
