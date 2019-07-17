package com.github.wasiqb.coteafs.selenium.sample.pages;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IElementActions;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Optional;

import static java.text.MessageFormat.format;

public class MainPage extends BrowserPage {
	IElementActions page () {
		return onElement (By.id ("page"), WaitStrategy.VISIBLE);
	}

	private IElementActions nav () {
		return page ().find (By.tagName ("nav"));
	}

	public IMouseActions nav (String name) {
		Optional <IElementActions> menu = nav ().finds (By.cssSelector ("div > a"))
			.stream ()
			.filter (m -> m.text ()
				.equalsIgnoreCase (name))
			.findFirst ();
		if (menu.isPresent ()) return (IMouseActions) menu.get ();
		Assert.fail (format ("Menu not found: {0}.", name));
		return null;
	}
}