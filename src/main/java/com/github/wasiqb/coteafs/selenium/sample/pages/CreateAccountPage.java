package com.github.wasiqb.coteafs.selenium.sample.pages;

import com.github.wasiqb.coteafs.selenium.core.element.IElementActions;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import org.openqa.selenium.By;

import static java.lang.String.format;

public class CreateAccountPage extends MainPage {
	public IElementActions header () {
		return page ().find (By.className ("page-heading"));
	}

	public IMouseActions gender (boolean isMale) {
		return form ().find (By.id (format ("id_gender%d", isMale ? 1 : 2)));
	}

	private IElementActions form () {
		return page ().find (By.id ("account-creation_form"));
	}
}
