package my_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;

public class PainterController {

	Paint a = Color.BLACK;
	
    @FXML
    private Pane drawingAreaPane;
   
    @FXML
    private ToggleGroup Pen;


    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(),
    			event.getY(), 4, a);
    	drawingAreaPane.getChildren().add(newCircle);

    }
    
    @FXML
    void eraserButtonPressed(ActionEvent event) {
    	a = Color.WHITE;
    }

    @FXML
    void penButtonPressed(ActionEvent event) {
    	a = Color.BLACK;
    }

}
