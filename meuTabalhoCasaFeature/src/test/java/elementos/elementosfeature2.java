package elementos;

import org.openqa.selenium.By;

public class elementosfeature2 {
	
	private By prodotospeaker = By.id ("speakerIng");
	private By btnmudarversao = By.id("speakersTxt");
    private By btnAddrecor = By.xpath("");
    private By btndegitarnome = By.xpath("field-customerName");
    private By btndegitarsobrenome = By.id("field-contactLastName");
	public By getProdotospeaker() {
		return prodotospeaker;
	}
	public By getBtnmudarversao() {
		return btnmudarversao;
	}
	public By getBtnAddrecor() {
		return btnAddrecor;
	}
	public By getBtndegitarnome() {
		return btndegitarnome;
	}
	public By getBtndegitarsobrenome() {
		return btndegitarsobrenome;
	}
}


