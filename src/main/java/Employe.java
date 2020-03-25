import java.util.Calendar;

public class Employe {
	/*
	 * Le nom de l'employé.
	 */
	private final String nom_emp;
	/*
	 * Lannee d'arrivee
	 */
	private final int annee_arrivee;
	/*
	 * Le salaire de base qui est égale à 1500 + 200
	 */
	public static final int SALAIRE_DE_BASE = 1700;
	/*
	 * Le constructeur de la calsse Employe.
	 * @param nom est le nom de l'employé
	 
	 
	 * @param annee est l'année d'arrivée de l'employé
	 */
	public Employe(final String nom_emp, final int annee_emp) {
		this.nom_emp = nom_emp;
		this.annee_arrivee = annee_emp;
	}
	public String getNom() {
		return nom_emp;
	}
	/*
	 * Fontion qui calcule le salaire d'un employé.
	 * @return le salaire de l'employé en fonction de son ancienneté
	 */
	public double calculer_salaire() {
		Calendar c = Calendar.getInstance();
		
		int anneeCourante = c.get(Calendar.YEAR);
		int res= SALAIRE_DE_BASE * (anneeCourante - annee_arrivee);
		
		return res;
	}
	/*
	 * Fontion qui renvoie le salaire de base d'un employé.
	 * @return le salaire de l'employé
	 */
	public int getSalaire() {
		return SALAIRE_DE_BASE;
	}
	

}
