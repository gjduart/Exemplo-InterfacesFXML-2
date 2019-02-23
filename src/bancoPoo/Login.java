package bancoPoo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Login extends Application {
    
    
    
    private static Stage stage ; 

    
    
    
    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Login.stage = stage;
    }

 
    
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root);//instancia uma nova cena da classe cena
        stage.setScene(scene);//coloca a cena em uma janela
        stage.initStyle(StageStyle.UNDECORATED);//retira o estilo padrao do so
        stage.show();
        stage.setTitle("Banco Imobiliario");
        setStage(stage);
        
        
    }


    public static void main(String[] args) {
		Banco B = new Banco(3,2424, 10000, 2); 
		Gerente G = new Gerente("ze","rua torta","bancario",12958745,458565253,1000,001,109893,9829,1000,1,0);
		
		B.getCartaos().add(G.getCartao());
		B.getNacessos().add(G.getNacesso());
		B.getSenhas().add(G.getSenha());
		B.getClientes().add(G);
		B.getAtendentes().add(G);
		B.mostra();
		
		//Atendente a = new Atendente("Zezinho", "Jerusalem", "Atendente", 11111, 22222, 0, 002, 2989, 2989, 200, 1); 
       
       // B.getCartaos().add(a.getCartao());
		//B.getNacessos().add(a.getNacesso());
		//B.getSenhas().add(a.getSenha());
		/*B.getClientes().add(a);
		B.getAtendentes().add(a);
		B.getClientes().get(0).setNome("oi");
		B.mostra();
		Cliente c =new Cliente("Zezão","pacajus","professor",1111,22222,0,003,3989,3989);
		B.getCartaos().add(c.getCartao());
		B.getSenhas().add(c.getSenha());
		B.getClientes().add(c);
		B.mostra();*/
		
        launch(args);
    }
    
}
