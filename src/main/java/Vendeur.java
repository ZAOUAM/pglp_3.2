/*
 * La classe vendeur représente un personnel salarié. 
 * Chaque vendeur a une commision de vente propre à lui.
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
public class Vendeur extends Personnel_salarie {
	/*
	 * La charge d'un vendeur ou commission
	 */
	private double charge;
	/*
	 * Le constructeur du vendeur avec une 
	 * charge initiale de 0
	 * @param nom Le nom du vendeur
	 * @param annee l'annee d'arrivee du vendeur 
	 * dans l'entreprise
	 */
	public Vendeur(final String nom, final int annee) {
		super(1500);
		this.nom_emp=nom;
		this.annee_arrivee=annee;
		this.charge = 0;
	}
	/*
	 * Méthode pour modifier la charge du vendeur.
	 */
	public void setCharge(final double charge) {
		this.charge = charge;
	}	
	/*
	 * La fonction qui calcule le salaire du vendeur avec la charge.
	 * @return le salaire
	 */
	@Override
	public double calculer_salaire() {
		return salaire_de_base + charge;
	}
}
