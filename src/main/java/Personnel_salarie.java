/*
 * Classe abstraite qui repésente un salarié.
 * un personnel salarié peut entre un employé, un manager ou bien un vendeur.
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
public abstract class Personnel_salarie {
	/*
	 * Le nom de l'employé.
	 */
	protected String nom_emp;
	/*
	 * L'année d'arrivée
	 */
	protected int annee_arrivee;
	/*
	 * Le salaire de base d'un employé qu'on peut le modifier à tout moment.
	 */
	protected final double salaire_de_base;
	/*
	 * Le constructeur de la classe Personnel_salarie
	 */
	protected Personnel_salarie(final int base) {
		this.salaire_de_base = base;
    }
	/*
	 * La méthode abstraite pour calculer les salaires des employés de l'entreprise.
	 */
	public abstract double calculer_salaire();

}
