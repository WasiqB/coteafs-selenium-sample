package com.github.wasiqb.coteafs.selenium.sample.pages;

import com.github.wasiqb.coteafs.selenium.core.element.IElementActions;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.element.ITextboxActions;
import org.openqa.selenium.By;

public class SignInPage extends MainPage {
	private IElementActions createAccountSection () {
		return page ().find (By.id ("create-account_form"));
	}

	private IElementActions loginSection () {
		return page ().find (By.id ("login_form"));
	}

	public ITextboxActions createEmail () {
		return createAccountSection ().find (By.id ("email_create"));
	}

	public IMouseActions create () {
		return createAccountSection ().find (By.id ("SubmitCreate"));
	}

	public ITextboxActions email () {
		return loginSection ().find (By.id ("email"));
	}

	public ITextboxActions password () {
		return loginSection ().find (By.id ("passwd"));
	}

	public IMouseActions login () {
		return loginSection ().find (By.id ("SubmitLogin"));
	}
}