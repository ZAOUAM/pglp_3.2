
public class Manager extends Employe {
	/*
	 * Le nombre de personnes en charge par le manager
	 */
	private int nb_personnes;
	public static final int lambda = 100;
	/*
	 * Le constructeur de Manager.
	 * @param nom Le nom du manager
	 * @param annee l'annee d'arrivée du manager
	 */
	public Manager(final String nom, final int annee) {
		super(nom, annee);
		nb_personnes = 1; //par default une seule personne pour chaque manager
	}
	/*
	 * La fonction qui calcule le salaire du manager
	 *  en fonction du nombre de personnes;
	 * @return retourne le salaire du manager
	 */
	@Override
	public double calculer_salaire() {
		return super.calculer_salaire() + nb_personnes * lambda;
	}
	/*
	 * Définit le nombre de personnes du manager
	 */
	public void setNb_personnes(final int nb) {
		this.nb_personnes = nb;
	}

}
