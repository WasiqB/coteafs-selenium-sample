package com.github.wasiqb.coteafs.selenium.sample.pages;

import static java.lang.String.format;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

public class CreateAccountPage extends MainPage {
	public IMouseActions gender (final boolean isMale) {
		return form ().find (By.id (format ("id_gender%d", isMale ? 1 : 2)));
	}

	public IMouseActions header () {
		return page ().find (By.className ("page-heading"));
	}

	private IMouseActions form () {
		return page ().find (By.id ("account-creation_form"));
	}
}
