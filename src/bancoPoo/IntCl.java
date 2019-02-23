package bancoPoo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class IntCl extends Application {
	/*static Cliente c;
	IntCl (Cliente c){
		this.c=c;
	}*/
    private static Stage stage ; 

    
    
    
    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        IntCl.stage = stage;
    }
  
    public static void main(String[] args) {
    	
    	launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("Cliente.fxml"));
        Scene scene = new Scene(root);//instancia uma nova cena da classe cena
        stage.setScene(scene);//coloca a cena em uma janela
        stage.show();
        stage.setTitle("Banco Imobiliario");
        setStage(stage);
    }
    
 
    
}
