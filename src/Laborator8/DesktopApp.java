package Laborator8;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DesktopApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws  Exception{

        Rectangle rectangle = new Rectangle(0, 0, 200, 40);
        rectangle.setFill(Color.color(0.2, 0.2, 0.3, 0.3));
        AnchorPane.setTopAnchor(rectangle, 80.0);
        AnchorPane.setLeftAnchor(rectangle, 100.0);

        Rectangle rectangle1 = new Rectangle(0, 0, 200, 40);
        rectangle1.setFill(Color.color(0.2, 0.2, 0.3, 0.3));
        AnchorPane.setTopAnchor(rectangle1, 125.0);
        AnchorPane.setLeftAnchor(rectangle1, 100.0);

        Button button = new Button("submit");
        AnchorPane.setTopAnchor(button, 350.0);
        AnchorPane.setLeftAnchor(button, 100.0);
        AnchorPane.setRightAnchor(button, 110.0);

        TextField firstNumber = new TextField("first");
        AnchorPane.setTopAnchor(firstNumber, 265.0);
        AnchorPane.setLeftAnchor(firstNumber, 100.0);
        AnchorPane.setRightAnchor(firstNumber, 110.0);

        TextField secondNumber = new TextField("second");
        AnchorPane.setTopAnchor(secondNumber, 300.0);
        AnchorPane.setLeftAnchor(secondNumber, 100.0);
        AnchorPane.setRightAnchor(secondNumber, 110.0);

        Text errors = new Text("");
        AnchorPane.setTopAnchor(errors, 80.0);
        AnchorPane.setLeftAnchor(errors, 125.0);

        Text output = new Text("");
        AnchorPane.setTopAnchor(output, 130.0);
        AnchorPane.setLeftAnchor(output, 125.0);

        AnchorPane root = new AnchorPane(rectangle, rectangle1, button, firstNumber,secondNumber, output, errors);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               Analyzer.divisionOf2num(firstNumber, secondNumber, errors, output);
            }
        });

        Scene scene = new Scene(root, 400, 450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }
}
