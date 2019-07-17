package com.github.wasiqb.coteafs.selenium.sample.actions;

import com.github.javafaker.Faker;
import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.github.wasiqb.coteafs.selenium.sample.pages.CreateAccountPage;
import com.github.wasiqb.coteafs.selenium.sample.pages.SignInPage;

import static com.github.wasiqb.coteafs.selenium.config.ConfigUtil.appSetting;

public class CreateAccountAction extends AbstractPageAction <CreateAccountAction> {
	private static final String	EMAIL	= "email";

	private Faker				fake;
	private String				email;

	@Override
	public void perform () {
		fake = new Faker ();
		email = fake.internet ()
			.emailAddress ();
		signUp ();
		createAccount ();
	}

	public String getEmail () {
		return email;
	}

	private void createAccount () {
		CreateAccountPage account = new CreateAccountPage ();
		account.gender (true);
	}

	private void signUp () {
		SignInPage signIn = new SignInPage ();
		signIn.onDriver ()
			.navigateTo (appSetting ().getUrl ());
		signIn.nav ("Sign In")
			.click ();
		signIn.createEmail ()
			.enterText (email);
		signIn.create ()
			.click ();
	}
}