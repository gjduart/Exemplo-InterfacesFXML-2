package bancoPoo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TeladeGerenciaController implements Initializable {

    @FXML    private AnchorPane IntCl;
    //=========Painel de Navegacao ======
    @FXML    private Pane Navegacao;
    @FXML    private Button btPerfil;
    @FXML    private Button btDeposito;
    @FXML    private Button btTrans;
    @FXML    private Button btSaque;
    @FXML    private Button btClientes;
    @FXML    private Button btFuncionario;
    //========Painel de Perfil ===========
    @FXML    private Pane Perfil;
    @FXML    private Label Rg;
    @FXML    private Label cpf;
    @FXML    private Label nome;
    @FXML    private Label profissao;
    @FXML    private Label Endereco;
    //========Painel de Saque ===========
    @FXML    private Pane Saque;
    @FXML    private TextField txSacar;
    @FXML    private Button btSacar;
    @FXML    private Label saqueSaldo;
    //=======Painel de Transferencia======
    @FXML    private Pane Transferencia;
    @FXML    private TextField txNumeroConta;
    @FXML    private TextField txValorT;
    @FXML    private Button btTransferir;
    @FXML    private Label LabelErroTransferir;
    //=======Painel de Deposito=========
    @FXML    private Pane Deposito;
    @FXML    private Button btDepositar;
    @FXML    private TextField txValor;
    @FXML    private Label DepositoSaldo;
    //=======Painel de Clientes==========
    @FXML    private Pane Clientes;
    @FXML    private Pane painelDeEdicao;
    @FXML    private TextField txCadastroNome;
    @FXML    private TextField txCadastroRg;
    @FXML    private TextField txCadastroCpf;
    @FXML    private TextField txSaldoinicial;
    @FXML    private TextField txCadastroConta;
    @FXML    private TextField txNCartao;
    @FXML    private PasswordField txCadastroSenha;
    //=======Painel de Funcionarios========
    @FXML    private Pane PainelFuncionario;
    @FXML    private TextField txFuncNome;
    @FXML    private TextField txFuncRg;
    @FXML    private TextField txFuncCpf;
    @FXML    private TextField txFuncProf;
    @FXML    private TextField txFuncNConta;
    @FXML    private TextField txFuncCartao;
    @FXML    private TextField txFuncSalario;
    @FXML    private TextField txFuncNacesso;
    @FXML    private PasswordField pxFuncSenha;
    
    
    
    
    
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	       btPerfil.setOnMouseClicked((MouseEvent e) ->{
	           Perfil.setVisible(true);
	           Saque.setVisible(false);
	           Transferencia.setVisible(false);
	           Deposito.setVisible(false);
	           Clientes.setVisible(false);
	           PainelFuncionario.setVisible(false);
	         
	         
	         });
	        btDeposito.setOnMouseClicked((MouseEvent e) ->{
	           Perfil.setVisible(false);
	           Saque.setVisible(false);
	           Transferencia.setVisible(false);
	           Deposito.setVisible(true);
	           Clientes.setVisible(false);
	           PainelFuncionario.setVisible(false);
	         
	         
	         });
	        
	         btTrans.setOnMouseClicked((MouseEvent e) ->{
	           Perfil.setVisible(false);
	           Saque.setVisible(false);
	           Transferencia.setVisible(true);
	           Deposito.setVisible(false);
	           Clientes.setVisible(false);
	           PainelFuncionario.setVisible(false);
	         
	         
	         });
	         btSaque.setOnMouseClicked((MouseEvent e) ->{
	           Perfil.setVisible(false);
	           Saque.setVisible(true);
	           Transferencia.setVisible(false);
	           Deposito.setVisible(false);
	           Clientes.setVisible(false);
	           PainelFuncionario.setVisible(false);
	         
	         
	         });
	         btClientes.setOnMouseClicked((MouseEvent e) ->{
	           Perfil.setVisible(false);
	           Saque.setVisible(false);
	           Transferencia.setVisible(false);
	           Deposito.setVisible(false);
	           Clientes.setVisible(true);
	           PainelFuncionario.setVisible(false);
	         
		
	         });
            
	         btFuncionario.setOnMouseClicked((MouseEvent e) ->{
	        	   PainelFuncionario.setVisible(true);
	        	   Perfil.setVisible(false);
		           Saque.setVisible(false);
		           Transferencia.setVisible(false);
		           Deposito.setVisible(false);
		           Clientes.setVisible(false);
	        	 
	        	 
	         });
	         
	         
	         
      }
}

