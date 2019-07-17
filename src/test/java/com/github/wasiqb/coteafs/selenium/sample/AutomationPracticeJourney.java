package com.github.wasiqb.coteafs.selenium.sample;

import com.github.wasiqb.coteafs.selenium.core.BrowserTest;
import com.github.wasiqb.coteafs.selenium.sample.actions.CreateAccountAction;
import org.testng.annotations.Test;

public class AutomationPracticeJourney extends BrowserTest {
	@Test
	public void testSignUp () {
		CreateAccountAction account = new CreateAccountAction ();
		account.perform ();
	}
}