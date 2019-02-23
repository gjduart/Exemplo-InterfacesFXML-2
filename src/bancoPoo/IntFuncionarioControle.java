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

public class IntFuncionarioControle implements Initializable{

    @FXML    private AnchorPane IntFunc;
    //===============================
    @FXML    private Pane Navegacao;
    @FXML    private Button btPerfil;
    @FXML    private Button btDeposito;
    @FXML    private Button btTrans;
    @FXML    private Button btSaque;
    @FXML    private Button btClientes;
   //================================
    @FXML    private Pane Perfil;
    @FXML    private Label Rg;
    @FXML    private Label cpf;
    @FXML    private Label nome;
    @FXML    private Label profissao;
    @FXML    private Label Endereco;
    @FXML    private Label NCard;
    @FXML    private Label Ncont;
    //================================
    @FXML    private Pane Saque;
    @FXML    private TextField txSacar;
    @FXML    private Button btSacar;
    @FXML    private Label saqueSaldo;
    @FXML    private Label ErroSaque;
    //===================================
    @FXML    private Pane Transferencia;
    @FXML    private TextField txNumeroConta;
    @FXML    private TextField txValorT;
    @FXML    private Button btTransferir;
    @FXML    private Label ErroTransferir;
    //============================================
    @FXML    private Pane Deposito;
    @FXML    private Button btDepositar;
    @FXML    private TextField txValor;
    @FXML    private Label DepositoSaldo;
    //======================================
    @FXML    private Pane Clientes;
    @FXML    private Pane painelDeCadastro;
    @FXML    private TextField txCadastroNome;
    @FXML    private TextField txCadastroRg;
    @FXML    private TextField txCadastroCpf;
    @FXML    private TextField txSaldoinicial;
    @FXML    private TextField txCadastroConta;
    @FXML    private TextField txNCartao;
    @FXML    private PasswordField txCadastroSenha;
    @FXML    private Button btEditar;
    
    private static Cliente c = Banco.getClientes().get(intAtendentesController.getPosicao());
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       btPerfil.setOnMouseClicked((MouseEvent e) ->{
         Perfil.setVisible(true);
         Saque.setVisible(false);
         Transferencia.setVisible(false);
         Deposito.setVisible(false);
         Clientes.setVisible(false);
       
       //INFORMACOES
           nome.setText(c.getNome());
           Rg.setText(Integer.toString(c.getRg()));
           cpf.setText(Integer.toString(c.getCpf()));
           profissao.setText(c.getProfissao());
           Endereco.setText(c.getEndereco());
           NCard.setText(Integer.toString(c.getCartao()));
           Ncont.setText(Integer.toString(c.getNconta()));
       
       });
       //====================Deposito e Funcoes ============================
      btDeposito.setOnMouseClicked((MouseEvent e) ->{
         Perfil.setVisible(false);
         Saque.setVisible(false);
         Transferencia.setVisible(false);
         Deposito.setVisible(true);
         Clientes.setVisible(false);
       
       
       });
       	  btDepositar.setOnMouseClicked((MouseEvent e) ->{
       		  depositar();
       	  });
      //====================Transferencia ======================================
       btTrans.setOnMouseClicked((MouseEvent e) ->{
         Perfil.setVisible(false);
         Saque.setVisible(false);
         Transferencia.setVisible(true);
         Deposito.setVisible(false);
         Clientes.setVisible(false);
       
       
       });
       //===================Para Sacar Tela de Saque e Funcoes======================
       btSaque.setOnMouseClicked((MouseEvent e) ->{
         Perfil.setVisible(false);
         Saque.setVisible(true);
         Transferencia.setVisible(false);
         Deposito.setVisible(false);
         Clientes.setVisible(false);
       
       
       });
       		
       		btSacar.setOnMouseClicked((MouseEvent e) ->{
       			sacar();
       			
       		});
       
       
       //==========================================================================
       btClientes.setOnMouseClicked((MouseEvent e) ->{
         Perfil.setVisible(false);
         Saque.setVisible(false);
         Transferencia.setVisible(false);
         Deposito.setVisible(false);
         Clientes.setVisible(true);
           //Informacoes a serem editadas
            
       });
         btEditar.setOnMouseClicked((MouseEvent e) ->{
            editar();	
     });
      
      
      
       
}
public void editar() {
   	c.setNome(txCadastroNome.getText()); 
   	c.setRg(Integer.parseInt(txCadastroRg.getText()));
    c.setCpf(Integer.parseInt(txCadastroCpf.getText()));
    c.setSaldo(Double.parseDouble(txSaldoinicial.getText()));
    c.setNconta(Integer.parseInt(txCadastroConta.getText()));
    c.setCartao(Integer.parseInt(txNCartao.getText()));
    c.setSenha(Integer.parseInt(txCadastroSenha.getText()));
}
    
public void sacar() {
 	ErroSaque.setVisible(false);
	Double D = Double.parseDouble(txSacar.getText());
		if (D  <0 || D > c.getSaldo()   ){
			ErroSaque.setVisible(true);
		}else {
			if(0 < c.getSaldo()){
				c.setSaldo(c.getSaldo()- D);
				saqueSaldo.setText(Double.toString(c.getSaldo()));
			}
		}
		saqueSaldo.setText(Double.toString(c.getSaldo()) + " R$");

	
}
public void depositar() {
	 Double D =Double.parseDouble(txValor.getText());
	 c.setSaldo(c.getSaldo()+ D);
	 DepositoSaldo.setText(c.getSaldo() + "R$");
}
public void transferencia() {
	
	
	int C = Integer.parseInt(txNumeroConta.getText());
	Double D = Double.parseDouble(txValorT.getText());
		if (D  <0 || D > c.getSaldo()   ){
			ErroTransferir.setText("Erro ao Transferir voce nao possui este saldo");
		}else {
			for(int i = 0;i<Banco.getClientes().size();i++) {
				if (Banco.getClientes().get(i).getNconta()==C) {
					Banco.getClientes().get(i).setSaldo(Banco.getClientes().get(i).getSaldo()+D);
					c.setSaldo(c.getSaldo()-D);
				}
			}
		}
		
}
    
    
    
    
    
    
    
    
    
    
}