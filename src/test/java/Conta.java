import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	
	/**
	 * 
	 * @param Este é o primeiro parametro, parametro do tipo integer.
	 * Nessa parte o codigo recebe o saldo atual do cliente especial
	 * 
	 */
@Given("Um cliente especial com saldo atual de {int} reais")
public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

/**
 * 
 * @param  Este é o segundo parametro, parametro do tipo integer.
 * Nessa parte o codigo recebe a solicitação de saque de um cliente especial
 * 
 */
@When("for solicitado um saque no valor de {int} reais")
public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

/**
 * 
 * @param  Este é o terceiro parametro, parametro do tipo integer.
 *  Nessa part o  codigo deve efetuar o saque e atualizar o saldo do cliente especial
 * 
 */
@Then("deve efutuar o saque e atualizar o saldo da conta para {int} reais")
public void deve_efutuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


/**
 * 
 * @param Este é o quarto parametro, parametro do tipo integer.
 * Nessa parte o codigo recebe o saldo atual do cliente comum
 * 
 */

@Given("Um cliente comum com saldo atual de {int} reais")
public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

/**
 * 
 * @param  Este é o quinto parametro, parametro do tipo integer.
 * Nessa parte o codigo recebe a solicitação de saque do cliente comum 
 * 
 */

@When("solicitar um saque no valor de {int} reais")
public void solicitar_um_saque_no_valor_de_reais(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


/**
 * 
 * @param  Este é o sexto parametro.
 *  Nessa parte om codigo retorna a mensagem de saldo insuficiente.
 *  Pois o cliente comum está com saldo negativo
 * 
 */
@Then("n?o deve efutuar o saque e deve retornar a mensagem Saldo Insuficiente")
public void n_o_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
