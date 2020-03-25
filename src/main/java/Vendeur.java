
public class Vendeur extends Employe {
	/*
	 * La charge d'un vendeur
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
		super(nom, annee);
		this.charge = 0;
	}
	
	
	/*
	 * Méthode qui définit la charge du vendeur;
	 */
	public void setCharge(final double charge) {
		this.charge = charge;
	}
	
	/*
	 * La fonction qui calcule le salaire du vendeur avec la charge
	 */
	@Override
	public double calculer_salaire() {
		return super.calculer_salaire() + charge;
	}

}
