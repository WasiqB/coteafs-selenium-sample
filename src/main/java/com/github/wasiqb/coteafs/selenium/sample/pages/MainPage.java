package com.github.wasiqb.coteafs.selenium.sample.pages;

import static java.text.MessageFormat.format;

import java.util.Optional;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.enums.WaitStrategy;

public class MainPage extends BrowserPage {
	public IMouseActions nav (final String name) {
		final Optional <IMouseActions> menu = nav ().finds (By.cssSelector ("div > a"))
			.stream ()
			.filter (m -> m.text ()
				.equalsIgnoreCase (name))
			.findFirst ();
		if (menu.isPresent ()) return menu.get ();
		Assert.fail (format ("Menu not found: {0}.", name));
		return null;
	}

	IMouseActions page () {
		return onClickable (By.id ("page"), WaitStrategy.VISIBLE);
	}

	private IMouseActions nav () {
		return page ().find (By.tagName ("nav"));
	}
}