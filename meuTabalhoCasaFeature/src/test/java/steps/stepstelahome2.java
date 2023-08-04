package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.elementosdetelahome2;
import metodo.metododetelahome2;

public class stepstelahome2 {

	metododetelahome2 m = new metododetelahome2();
	elementosdetelahome2 e = new elementosdetelahome2();	
	
@Dado("^que esteja no site \"([^\"]*)\"$")
public void que_esteja_no_site(String url) throws Throwable {
  m.abrirNavegador(url);
}

@Quando("^eu clicar nos podutos da tela home$")

public void eu_clicar_nos_podutos_da_tela_home() throws Throwable {
   
}

@Entao("^devera ser direcionada paraa tela do produto clicado$")
public void devera_ser_direcionada_paraa_tela_do_produto_clicado() throws Throwable {
   
	
}



}
