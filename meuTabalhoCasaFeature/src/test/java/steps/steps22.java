package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.elementos22;
import metodo.metodos22;

public class steps22 {
	
	metodos22 m = new metodos22 ();
	elementos22 e = new elementos22();

@Dado("^que eu esteja no site\"([^\"]*)\"$")
public void que_eu_esteja_no_site(String url) throws Throwable {
  m.abrirNavegador(url);
}
@Quando("^eu clicar em alterar versao$")
public void eu_clicar_em_alterar_versao() throws Throwable {
   m.clicar (e.getbtnAddrecord());
   m.pausar(3000);
   m.preenchertexto(e.getBtndegitarnome(), "silvano");
   m.pausar(1000);
   m.preenchertexto(e.getBtndegitarsobrenome()," silva");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarcustername()," Silvano Silva");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarphone(),"75988885502");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarAddressLine1(),"rua 6");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarAddressLine2(), "loteamento planalto");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarcity(), "cruz das almas");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarstate(), "Bahia");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarpostalcode(), "44380-000");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarcountry(), "Brasil");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarReperNuber(), "44");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarCreditLimit(), "R$ 10,000,00");
   m.pausar(1000);
   m.preenchertexto(e.getBtndigitarDeleted(), "sim");
   m.pausar(1000);
   m.clicar (e.getBtndigitarSave());
   m.pausar(3000);
   m.clicar(e.getBtnclicarBodydiv());
   
   
   
   
}


@Quando("^clicar no botao add record")
public void clicar_no_botao_add_record() throws Throwable {
	
	
}



@Quando("^preencher campos de cadastro$")
public void preencher_campos_de_cadastro() throws Throwable {
	
}



@Entao("^o cadastro sera validado com sucesso$")
public void o_cadastro_sera_validado_com_sucesso() throws Throwable {
 
}



}
