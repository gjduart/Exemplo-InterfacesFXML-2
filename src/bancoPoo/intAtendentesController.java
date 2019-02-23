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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class intAtendentesController implements Initializable{
//painel de cadastro
    @FXML    private Pane Cadastro;
    @FXML    private TextField txCadastroNome;
    @FXML    private TextField txCadastroEndereco;
    @FXML    private TextField txCadastroProfissao;
    @FXML    private TextField txCadastroRg;
    @FXML    private TextField txCadastroCPF;
    @FXML    private PasswordField txCadastroSenha;
    @FXML    private Button btSalvar;
 //painel de acesso
    @FXML    private Pane Acesso;
    @FXML    private TextField txUsuario;
    @FXML    private TextField txPassword;
    @FXML    private Button btEntrar;
    @FXML    private Button Cadastrar;
    @FXML    private Button Acessar;
    
    private static int posicao;
    
    
    @FXML public void fechar() {
   	          intAtendente.getStage().close();
          
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
    public void acesso() {
    	 String usuario = txUsuario.getText(); 
  	   	 int senha  = Integer.parseInt(txPassword.getText());
  	   	int Nusuario = Integer.parseInt(txUsuario.getText());
  	   for (int i = 0;i<Banco.getCartaos().size();i++) {
			if(Banco.getCartaos().get(i)==Nusuario && Banco.getSenhas().get(i)==senha) {
				System.out.println("Login efetuado com sucesso");
				fechar();
				IntFuncionario F =new IntFuncionario();
			try {
					setPosicao(i);
			
					F.start(new Stage());
			} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
  	   }
  	   	 
  	   	 
   }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    //=================primeiro painel ====================================
       Cadastrar.setOnMouseClicked((MouseEvent e) -> {
    	   Acesso.setVisible(false);
           Cadastro.setVisible(true);
      });
       btSalvar.setOnMouseClicked((MouseEvent e) -> {
    	   cadastrar();
           
           
      });
     //==============segundo painel =======================================  
       Acessar.setOnMouseClicked((MouseEvent e) -> {
           Cadastro.setVisible(false);
           Acesso.setVisible(true);
          
      });
       btEntrar.setOnMouseClicked((MouseEvent e) -> {
    	   acesso();
    	   
       });
       
       
       
       
    }

    
    
    
    
    
    
    
    
    public static int getPosicao() {
    	return posicao;
    }


    public static void setPosicao(int posicao) {
    	intAtendentesController.posicao = posicao;
    }
     
    
    
   
    
    
    
    
    
    
    
    
}
