/*
 * La classe manager décrit une personne de l'entreprise qui se charge des autres
 * employés. Donc son salaire se diffère de celui de l'employé : on ajoute à son 
 * salaire de base 100£ par personne sous ses ordres.
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
public class Manager extends Personnel_salarie {
	/*
	 * Le nombre de personnes en charge par le manager
	 */
	private int nb_personnes;
	/*
	 * constante qu'on va multiplier par le nombre d'employés en charge par le manager
	 * pour calculer son salaire
	 */
	public static final int lambda = 100;
	/*
	 * Le constructeur de Manager.
	 * @param nom Le nom du manager
	 * @param annee l'annee d'arrivée du manager
	 */
	public Manager(final String nom, final int annee) {
		super(1500);
		this.annee_arrivee=annee;
		this.nom_emp=nom;
		nb_personnes = 1; //par default une seule personne pour chaque manager
	}
	/*
	 * La fonction qui calcule le salaire du manager
	 *  en fonction du nombre de personnes;
	 * @return retourne le salaire du manager
	 */
	@Override
	public double calculer_salaire() {
		return salaire_de_base + nb_personnes * lambda;
	}
	/*
	 * Modifier le nombre de personnes en charge par le manager.
	 */
	public void setNb_personnes(final int nb) {
		this.nb_personnes = nb;
	}

}
