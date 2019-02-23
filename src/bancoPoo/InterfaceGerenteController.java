package bancoPoo;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class InterfaceGerenteController implements Initializable {
	//painel de cadastro cliente ======================
	 @FXML	    private Pane Cadastro;
     @FXML	    private TextField txCadastroNome;
     @FXML	    private TextField txCadastroEndereco;
     @FXML	    private TextField txCadastroProfissao;
     @FXML	    private TextField txCadastroRg;
     @FXML	    private TextField txCadastroCPF;
     @FXML	    private PasswordField txCadastroSenha;
     @FXML	    private Button btSalvar;
     //Painel de Acesso Cliente ============================
     @FXML	    private Pane Acesso;
	 @FXML	    private TextField txUsuario;
     @FXML	    private Button btEntrar;
     @FXML	    private PasswordField txPassword;
     //Painel Pagamento ---------------------------------- 
     @FXML	    private Pane Pagamento;
	 @FXML	    private TextField txIdFuncionario;
	 @FXML	    private TextField txIdValor;
     @FXML	    private Button btPagar;
     @FXML 		private Label txErroAcessoCliente;
     //Painel Acesso de Funcionario ========================
     @FXML	    private Pane AcessoFuncionarios;
     @FXML	    private TextField txEntradaFunc;
	 @FXML	    private PasswordField txSenhaFunc;
	 @FXML      private Button botaoEntrar;
	 //Painel de Cadastro de Funcionario====================
     @FXML	    private Pane CadastroFunc;
     @FXML      private TextField txNiveldeAcesso;
     @FXML	    private TextField txFuncNome;
     @FXML	    private TextField txFuncEndereco;
     @FXML	    private TextField txFuncProfissao;
     @FXML	    private TextField txFuncRg;
     @FXML	    private TextField txFuncCPF;
     @FXML      private TextField txSalario;
     @FXML	    private PasswordField txFuncSenha;
     @FXML	    private Button btSalvar1;
     @FXML      private Button Cadastrar;
	 @FXML	    private Button Acessar;
	 @FXML	    private Button btPagamento;
     @FXML	    private Button btFuncionarios;
     @FXML	    private Button btCriarFuncionario;
	
     private static int posicao;
     
     public void acessarFuncionario() {
    	
  	   	 int senha  = Integer.parseInt(txPassword.getText());
  	   	 int Nusuario = Integer.parseInt(txSenhaFunc.getText());
  	     for (int i = 0;i<Banco.getCartaos().size();i++) {
			if(Banco.getCartaos().get(i)==Nusuario && Banco.getSenhas().get(i)==senha) {
				System.out.println("Login efetuado com sucesso");
				fechar();
				TeladeGerencia T =new TeladeGerencia();
			try {
					setPosicao(i);
			
					T.start(new Stage());
			} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
  	   }
     }
     
     public void acessarCliente() {
    	 String usuario = txUsuario.getText(); 
  	   	 int senha  = Integer.parseInt(txPassword.getText());
  	   	 int Nusuario = Integer.parseInt(txUsuario.getText());
  	     for (int i = 0;i<Banco.getCartaos().size();i++) {
			if(Banco.getCartaos().get(i)==Nusuario && Banco.getSenhas().get(i)==senha) {
				System.out.println("Login efetuado com sucesso");
				fechar();
				TeladeGerencia T =new TeladeGerencia();
			try {
					setPosicao(i);
			
					T.start(new Stage());
			} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
  	   }
    	 
    	 
    	 
    	 
     }
     private void fechar() {
    	 interfaceGerente.getStage().close();
		
	}
	public void cadastrar() {
   	   String nome = txCadastroNome.getText();
  	   String Endereco = txCadastroEndereco.getText();
  	   String Profissao = txCadastroProfissao.getText();
  	   int Rg = Integer.parseInt(txCadastroRg.getText());
  	   int CPF = Integer.parseInt(txCadastroCPF.getText());
  	   int senha = Integer.parseInt(txCadastroSenha.getText());
  	   Banco.getSenhas().add(senha);
  	   int cartao =  Banco.gerarcartao();
  	   int nConta = Banco.getNcontas()+1;
  	   Banco.getCartaos().add(cartao);
  	   Banco.setNcontas(Banco.getNcontas()+1);
  	   double saldo = 0.0;
  	   Banco.getClientes().add(new Cliente(nome,Endereco,Profissao,Rg,CPF,saldo,nConta,cartao,senha));
  	   
  	   
      }
     public void CadastrarFunc() {
	   String nome = txFuncNome.getText();
	   String Endereco = txFuncEndereco.getText();
	   String Profissao = txFuncProfissao.getText();
	   int Rg = Integer.parseInt(txFuncRg.getText());
	   int CPF = Integer.parseInt(txFuncCPF.getText());
	   
	   int senha = Integer.parseInt(txFuncSenha.getText());
	   Banco.getSenhas().add(senha);
	   
	   int cartao =  Banco.gerarcartao();
	   Banco.getCartaos().add(cartao);
	  
	   int nConta = Banco.getNcontas()+1;
	   Banco.setNcontas(Banco.getNcontas()+1);
	   
	   double saldo = 0.0;
	   
	   int nAcesso= Integer.parseInt(txNiveldeAcesso.getText());
	   Banco.getNacessos().add(nAcesso);
	   
	   int Salario=Integer.parseInt(txSalario.getText());
	   
	   Atendente a = new Atendente(nome,Endereco,Profissao,Rg,CPF,saldo,nConta,cartao,senha,Salario,nAcesso);
	   Banco.getClientes().add(a);
	   Banco.getAtendentes().add(a);
     }
	
	public void initialize(URL location, ResourceBundle resources) {
		//=============tela de cadastro ==========================
		Cadastrar.setOnMouseClicked((MouseEvent e) -> {
			Cadastro.setVisible(true);
		     Pagamento.setVisible(false);
		     Acesso.setVisible(false);
		   
		     CadastroFunc.setVisible(false);
		     
			
			
		});
		btSalvar.setOnMouseClicked((MouseEvent e) ->{
			
			cadastrar();
		});
		
		//==================acesso cliente=====================
		
		Acessar.setOnMouseClicked((MouseEvent e) -> {
			 Acesso.setVisible(true);
		     Cadastro.setVisible(false);
		     Pagamento.setVisible(false);
		    
	
		     CadastroFunc.setVisible(false);
		     
			
			
		});
		  btEntrar.setOnMouseClicked((MouseEvent e) ->{
			  
			  
		  });
		
		//============  pagamento  ==========================
		btPagamento.setOnMouseClicked((MouseEvent e) -> {
			  Pagamento.setVisible(true);
		     Cadastro.setVisible(false);
		   	 Acesso.setVisible(false);
		   	  CadastroFunc.setVisible(false);
		   
			
		});
		
		//====================== criar funcionario ================
		btCriarFuncionario.setOnMouseClicked((MouseEvent e) -> {
			 CadastroFunc.setVisible(true);
			 Cadastro.setVisible(false);
		     Pagamento.setVisible(false);
		     Acesso.setVisible(false);
		     AcessoFuncionarios.setVisible(false);
		     
			
			
			
		});
		btSalvar.setOnMouseClicked((MouseEvent e)->{
			CadastrarFunc();
		});
		
		
		
		
		//====================
		/*btFuncionarios.setOnMouseClicked((MouseEvent e) -> {
		     AcessoFuncionarios.setVisible(true);
			 Cadastro.setVisible(false);
		     Pagamento.setVisible(false);
		     Acesso.setVisible(false);
		     
		     CadastroFunc.setVisible(false);
			
			
		});*/
		
		
	}
	public static int getPosicao() {
		return posicao;
	}
	public static void setPosicao(int posicao) {
		InterfaceGerenteController.posicao = posicao;
	}

}
