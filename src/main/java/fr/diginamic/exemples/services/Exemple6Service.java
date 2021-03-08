package fr.diginamic.exemples.services;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import fr.diginamic.composants.MenuService;
import fr.diginamic.composants.ui.ComboBox;
import fr.diginamic.composants.ui.Form;
import fr.diginamic.composants.ui.Selectable;
import fr.diginamic.exemples.entites.Vehicule;

public class Exemple6Service extends MenuService {

	@Override
	public void traitement() {

		console.clear();
		console.println("<h1 class='bg-turquoise'><center>Titre avec fond bleu clair</center></h1>");

		// On commence par créér le formulaire vide
		Form form = new Form();
		
		List<Selectable> vehicules = new ArrayList<>();
		vehicules.add(new Vehicule(1, "AA-552-CD", "Peugeot", "208"));
		vehicules.add(new Vehicule(2, "AW-227-XE", "Peugeot", "3008"));
		vehicules.add(new Vehicule(3, "XX-131-XT", "Peugeot", "3008"));
		
		// Champ de type liste de sélection
		form.addInput(new ComboBox("Liste de véhicules:", "vehicule", vehicules, vehicules.get(2)));

		// Création d'un validator qui stocke les règles de gestion
		Exemple6FormValidator validator = new Exemple6FormValidator();
		
		// La méthode suivante permet d’afficher le formulaire.
		// La méthode retourne false si l’utilisateur a cliqué sur Annuler, sinon 
		// retourne true
		boolean valide = console.input("Demande d'informations", form, validator);

		// Récupéation des informations saisies
		if (valide) {
			console.print(""+form.getValue("vehicule"));
		}
	}

	public void modifier(Long id) {
		console.println("Modification de l'item " + id, Color.GREEN);
	}

	public void supprimer(Long id) {
		console.println("Suppression de l'item " + id, Color.RED);
	}

}
