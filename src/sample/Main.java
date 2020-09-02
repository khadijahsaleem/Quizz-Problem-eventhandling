package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler <ActionEvent> {
    private Button btn1 , btn2;
    private TextField textField1 , textField2;
    private HBox hBox1 , hBox2;
    private VBox vBox;
    private Label lbl;
    @Override
    public void start(Stage primaryStage) throws Exception{

        btn1 = new Button("Add");
        btn1.setOnAction(this);
        btn2 = new Button("Subtract");
        btn2.setOnAction(this);

        lbl = new Label();
        lbl.setStyle("-fx-font:30px Arial ;-fx-text-fill: red");
        lbl.setPadding(new Insets(20));

        textField1 = new TextField();
        textField1.setPromptText("Enter first number  ");
        textField1.setMaxHeight(25);

        textField2 = new TextField();
        textField2.setPromptText("Enter second number  ");
        textField2.setMaxHeight(25);
        hBox1 = new HBox(20 , textField1 , textField2);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.setPadding(new Insets(20));
        hBox2 = new HBox(20 , btn1 , btn2);
        hBox2.setAlignment(Pos.CENTER);
        hBox2.setPadding(new Insets(20));
        vBox = new VBox(hBox1 , hBox2 , lbl);

        Scene scene = new Scene(vBox , 300 ,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("181380017");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {

        if (event.getSource()==btn1)
        {
            String a = textField1.getText().toString();
            String a1 =  textField2.getText().toString();
            double f = Double.parseDouble(a);
            double s = Double.parseDouble(a1);
            double output = f + s;
            lbl.setText(String.valueOf(output));


        }
        else
        {
            if (event.getSource()==btn2)
            {
                String a3 = textField1.getText().toString();
                String a4 =  textField2.getText().toString();
                double f = Double.parseDouble(a3);
                double s = Double.parseDouble(a4);
                double output = f - s;
                lbl.setText(String.valueOf(output));
            }
        }


    }
}
