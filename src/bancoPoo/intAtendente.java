package bancoPoo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class intAtendente extends Application {
    
    
    
    private static Stage stage ; 

    
    
    
    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        intAtendente.stage = stage;
    }

 
    
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Atendentes.fxml"));
        
        Scene scene = new Scene(root);//instancia uma nova cena da classe cena
        stage.setScene(scene);//coloca a cena em uma janela
        stage.resizableProperty();                                             //retira o estilo padrao do so
        stage.show();
        stage.setTitle("Banco Imobiliario");
        setStage(stage);
        
        
    }


    public static void main(String[] args) {
		
               launch(args);
    }
    
}
