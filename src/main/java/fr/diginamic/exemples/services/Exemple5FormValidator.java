package fr.diginamic.exemples.services;

import fr.diginamic.composants.ui.Form;
import fr.diginamic.composants.validator.FormValidator;

/** validateur associé au formulaire
 * @author rbonn
 *
 */
public class Exemple5FormValidator extends FormValidator {

	@Override
	public boolean validate(Form form) {
		String nvNom = form.getValue("champ1");
		String nvPrenom = form.getValue("champ2");
		
		if (nvNom.trim().isEmpty()) {
			console.alert("Le nom est obligatoire !");
			return false;
		}
		else if (nvPrenom.trim().isEmpty()) {
			console.alert("Le prénom est obligatoire !");
			return false;
		}
		return true;
	}

}
