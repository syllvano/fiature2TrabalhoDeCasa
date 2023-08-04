package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.elementosdetelahome2;
import metodo.metododetelahome2;

public class Steps2 {
	
	metododetelahome2 m = new metododetelahome2();
	elementosdetelahome2 e = new elementosdetelahome2();
	
	@Dado("^eu esteja asessando o site\"([^\"]*)\"$")
	public void eu_esteja_asessando_o_site(String url) throws Throwable {
		m.abrirNavegador(url);
	  
	}

	@Quando("^eu clicar em cadastro da tela home$")
	public void eu_clicar_em_cadastro_da_tela_home() throws Throwable {
	   
	}

	@Entao("^devera abrir tela de cadastro$")
	public void devera_abrir_tela_de_cadastro() throws Throwable {
	    
	}

	@Entao("^digitar minhas infirmacoes na tela home$")
	public void digitar_minhas_infirmacoes_na_tela_home() throws Throwable {
	    
	}

	@Entao("^confirmar todas informacoes na tela home$")
	public void confirmar_todas_informacoes_na_tela_home() throws Throwable {
	   
	}

	@Entao("^aparecera uma mensage de cadastro realizado com sucesso$")
	public void aparecera_uma_mensage_de_cadastro_realizado_com_sucesso() throws Throwable {
	  
	}




}
