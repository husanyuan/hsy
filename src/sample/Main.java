package sample;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public void init(Stage primaryStage) {
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Pane pane = new Pane();
        Label label = new Label("我猜你肯定是猪，你说是不是？");
        label.setLayoutX(100);
        label.setLayoutY(100);
        label.setFont(new Font(15));
        primaryStage.setScene(new Scene(pane));
        Button btn1 = new Button("是");
        btn1.setLayoutX(200);
        btn1.setLayoutY(150);
        Button btn2 = new Button("不是");
        btn2.setLayoutX(250);
        btn2.setLayoutY(150);
        pane.getChildren().addAll(btn1, btn2, label);
        Random random = new Random();
        btn1.setOnAction(event -> {
            Alert info = new Alert(Alert.AlertType.INFORMATION);
            info.setTitle("");
            info.setHeaderText("");
            info.setContentText("哈哈！你终于承认你是猪了。");
            info.showAndWait();
        });
        btn2.setOnMouseEntered(event -> {
            btn2.setLayoutY(random.nextInt(280));
            btn2.setLayoutX(random.nextInt(390));
        });

    }

    @Override
    public void start(Stage primaryStage) {
        init(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
