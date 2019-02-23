/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoPoo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
/**
 * FXML Controller class
 *
 * @author Casa
 */
public class IntClControle implements Initializable {
//--------NAVEGACAO-------------------
	 @FXML    private AnchorPane IntCl;
	 @FXML    private Pane Navegacao;
	 @FXML    private Button btPerfil;
	 @FXML    private Button btDeposito;
	 @FXML    private Button btTrans;
	 @FXML    private Button btSaque;
	 //---------PERFIL--------------------
	 @FXML    private Pane Perfil;
	 @FXML    private Label Rg;
	 @FXML    private Label cpf;
	 @FXML    private Label nome;
	 @FXML    private Label profissao;
	 @FXML    private Label Endereco;
	 @FXML    private Label NCard;
	 @FXML    private Label NCont;
	 //---------SAQUE----------------------
	 @FXML    private Pane Saque;
	 @FXML    private TextField txSacar;
	 @FXML    private Button btSacar;
	 @FXML    private Label saqueSaldo;
	 @FXML    private Label ErroSaque;
	 //-------TRANSFERENCIA-----------------
	 @FXML    private Pane Transferencia;
	 @FXML    private TextField txNumeroConta;
	 @FXML    private TextField txValorT;
	 @FXML    private Button btTransferir;
	 @FXML    private Label ErroTransferir;
	 
	 //-------DEPOSITO----------------------
	 @FXML    private Pane Deposito;
	 @FXML    private Button btDepositar;
	 @FXML    private TextField txValor;
	 @FXML    private Label DepositoSaldo;
	//--------------------------------------
	 
	 private static Cliente c = Banco.getClientes().get(BancoControleLogin.getPosicao());
	 
	 
	  
	 
	 
	    @Override
	public void initialize(URL location, ResourceBundle resources) {
		     //OQ IRA ACONTECER QUANDO APERTAR O BOTAO PERFIL   
		btPerfil.setOnMouseClicked((MouseEvent e) -> {
		     //VISUALIZACAO DO PAINEL DE PERFIL
		     Perfil.setVisible(true);
		     Saque.setVisible(false);
		     Transferencia.setVisible(false);
		     Deposito.setVisible(false);
		     //INFORMACOES
		         nome.setText(c.getNome());
		         Rg.setText(Integer.toString(c.getRg()));
		         cpf.setText(Integer.toString(c.getCpf()));
		         profissao.setText(c.getProfissao());
		         Endereco.setText(c.getEndereco());
		         NCard.setText(Integer.toString(c.getCartao()));
		         NCont.setText(Integer.toString(c.getNconta()));
		     });
		  //=============================SACAR =================================    
		 btSaque.setOnMouseClicked((MouseEvent e) -> {
		     //VISUALIZACAO DO PAINEL DE SAQUE
		       Perfil.setVisible(false);
		       Saque.setVisible(true);
		       Transferencia.setVisible(false);
		       Deposito.setVisible(false);
		       txSacar.setText("");
		       saqueSaldo.setText(Cliente.getSaldo()+"R$");
		      });
		     
		     btSacar.setOnMouseClicked((MouseEvent e) ->{
		    	 
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
		 
	 });
	 
		     
		     
		     
		   //============================Depositar==========================
		 
		 btDeposito.setOnMouseClicked((MouseEvent e) -> {
		     //VISUALIZACAO DO PAINEL DE DEPOSITO
		       Perfil.setVisible(false);
		       Saque.setVisible(false);
		       Transferencia.setVisible(false);
		       Deposito.setVisible(true);
		       txValor.setText("");
		
		  }); 
		 btDepositar.setOnMouseClicked((MouseEvent e) ->{
			 Double D =Double.parseDouble(txValor.getText());
			 c.setSaldo(c.getSaldo()+ D);
			 DepositoSaldo.setText(c.getSaldo() + "R$");
		 });
		                 
		 //================================================================ 
		 btTrans.setOnMouseClicked((MouseEvent e) -> {
		     //VISUALIZACAO DO PAINEL DE TRANSFERENCIA
		      Perfil.setVisible(false);
		       Saque.setVisible(false);
		       Transferencia.setVisible(true);
		       Deposito.setVisible(false);
		
		  });
	 
	    btTransferir.setOnMouseClicked((MouseEvent e) ->{
	    	 transferencia();
	    	
	    });
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
		public static Cliente getC() {
			return c;
		}
		public static void setC(Cliente c) {
			IntClControle.c = c;
		}

		
		
		public void transferencia() {
			
			
			int C = Integer.parseInt(txNumeroConta.getText());
			Double D = Double.parseDouble(txValorT.getText());
				if (D  <0 || D > c.getSaldo()   ){
					ErroTransferir.setText("Erro ao Transferir voce nao possui este saldo");//subistituir isso
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

  
    

