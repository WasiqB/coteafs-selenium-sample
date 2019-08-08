package com.github.wasiqb.coteafs.selenium.sample.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.element.ITextboxActions;

public class SignInPage extends MainPage {
	public IMouseActions create () {
		return createAccountSection ().find (By.id ("SubmitCreate"));
	}

	public ITextboxActions createEmail () {
		return createAccountSection ().find (By.id ("email_create"));
	}

	public ITextboxActions email () {
		return loginSection ().find (By.id ("email"));
	}

	public IMouseActions login () {
		return loginSection ().find (By.id ("SubmitLogin"));
	}

	public ITextboxActions password () {
		return loginSection ().find (By.id ("passwd"));
	}

	private IMouseActions createAccountSection () {
		return page ().find (By.id ("create-account_form"));
	}

	private IMouseActions loginSection () {
		return page ().find (By.id ("login_form"));
	}
}