package fr.diginamic.exemples.services;

import fr.diginamic.composants.ui.Form;
import fr.diginamic.composants.validator.FormValidator;

/** validateur associé au formulaire
 * @author rbonn
 *
 */
public class Exemple6FormValidator extends FormValidator {

	@Override
	public boolean validate(Form form) {
		return true;
	}

}
