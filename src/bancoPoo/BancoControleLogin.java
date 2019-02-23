
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
import javafx.stage.Stage;


public class BancoControleLogin implements Initializable {
    private static int posicao;
  //Declaracoes dos Componentes @FXML Indica que e um FXML
 @FXML   private Button btCadastro;
 @FXML   private Button btSair; 
 @FXML   private Button btLogin;
 @FXML 	 private Label label;
 @FXML   private Label label1;
 @FXML   private Label label3;
 @FXML   private TextField txLogin;
 @FXML   private PasswordField Senha;
 
 //Metodo para login
 
 @FXML public void botaoLogin() {
		
	int str = Integer.parseInt(txLogin.getText());
	int password = Integer.parseInt(Senha.getText());
	String Zenha = Integer.toString(0);
	
	System.out.println(password);
	int x=2;
	/*if(str ==Gerente.getNacesso()) {
		
	}*/
	
	//else {
		
	
		//System.out.printf("%d",password);
		if(Senha.getText().equals(Zenha)) {//se um atendente for tentar acessar ele so fornecera o Nacesso e a senha sera 0
		    System.out.println("ola");
			for ( int i1 = 0;i1<Banco.getNacessos().size();i1++) {
				if(Banco.getNacessos().get(i1)==str) {
				    fechar();
			    	intAtendente a = new intAtendente();
					try {
					
						a.start(new Stage());
				
					} catch (Exception ex) {
						Logger.getLogger(BancoControleLogin.class.getName()).log(Level.SEVERE, null, ex);
					}
						
					x=x-1;
					break;
				}
			}
		}	
		
		else {
			for (int i = 0;i<Banco.getCartaos().size();i++) {
				if(Banco.getCartaos().get(i)==str && Banco.getSenhas().get(i)==password) {
					System.out.println("Login efetuado com sucesso");
					setPosicao(i);
					IntCl c = new IntCl();
					fechar();
			        System.out.printf("%d",getPosicao());
			        for (int j = 0;j<Banco.getClientes().size();j++) {
			        	 System.out.printf("%s",Banco.getClientes().get(j).getNome());
			        }
					try {
			                 c.start(new Stage());
			              } catch (Exception ex) {
			            	  Logger.getLogger(BancoControleLogin.class.getName()).log(Level.SEVERE, null, ex);
			              }
			          x=x-1;
			          break;
			    
			}
		}
		if (x==2) {
			  label3.setVisible(true);
		}
	}
 //}
 }
 
 @FXML public void btCadastro(){
    
 }
 
 
 @FXML public void fechar() {
	 Login.getStage().close();
       
    }


 @Override
    public void initialize(URL url, ResourceBundle rb) {
        // eventos 
           
        btLogin.setOnMouseClicked(((MouseEvent e) -> {
                botaoLogin();
         }));
           
        
        btSair.setOnMouseClicked(((MouseEvent e) -> {
               fechar();
         }));
 }


public static int getPosicao() {
	return posicao;
}


public static void setPosicao(int posicao) {
	BancoControleLogin.posicao = posicao;
}
 
        
    }    
    
    


