package fr.diginamic.exemples;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.diginamic.composants.AbstractApplication;
import fr.diginamic.exemples.services.AideService;
import fr.diginamic.exemples.services.Exemple1Service;
import fr.diginamic.exemples.services.Exemple2Service;
import fr.diginamic.exemples.services.Exemple3Service;
import fr.diginamic.exemples.services.Exemple4Service;
import fr.diginamic.exemples.services.Exemple5Service;
import fr.diginamic.exemples.services.Exemple6Service;
import fr.diginamic.exemples.services.Exemple7Service;

/**
 * Fenêtre principale qui porte les principaux composants graphiques de
 * l'application:<br>
 * - les boutons du menu,<br>
 * - le panneau d'affichage des résultats<br>
 * 
 * @author RichardBONNAMY
 *
 */
public class ApplicationExemple extends AbstractApplication {

	/** serialVersionUID */
	private static final long serialVersionUID = 6755835482616236832L;
	
	/** emf */
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2-mem");
	
	/** Constructeur
	 * @param title titre
	 */
	public ApplicationExemple(String title) {
		super(title);
	}

	/**
	 * Code principal
	 * 
	 */
	public void main() {
		addMenu(1, "File");
		addMenu(2, "Gestion clients");
		addMenu(3, "Exemples");
		
		addMenuOption(1, "Aide", new AideService());
		
		//addMenuOption(2, "Liste des clients", new AideService());
		
		addMenuOption(3, "Exemple 1 - Titres", new Exemple1Service());
		addMenuOption(3, "Exemple 2 - Textes de couleur", new Exemple2Service());
		addMenuOption(3, "Exemple 3 - Table", new Exemple3Service());
		addMenuOption(3, "Exemple 4 - Table avec liens vers méthodes", new Exemple4Service());
		addMenuOption(3, "Exemple 5 - Table dynamique", new Exemple5Service());
		addMenuOption(3, "Exemple 6 - Formulaire", new Exemple6Service());
		addMenuOption(3, "Exemple 7 - Champ non modifiable", new Exemple7Service());
	}
}