package my_javafx;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;

public class Painter extends Application {
	@Override
	public void start(Stage stage) throws Exception{
		Parent root = FXMLLoader.load(getClass()
			.getResource("/my_javafx/Painter.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Painter");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
