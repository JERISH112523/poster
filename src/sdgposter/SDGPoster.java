/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sdgposter;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class SDGPoster extends Application {

    @Override
    public void start(Stage stage) {

        // Main container
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #E8F5FF;");

        // ===== HEADER =====
        Label title = new Label("SDG 6");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 42));
        title.setTextFill(Color.WHITE);

        Label subtitle = new Label("CLEAN WATER AND SANITATION");
        subtitle.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        subtitle.setTextFill(Color.WHITE);

        VBox header = new VBox(5, title, subtitle);
        header.setAlignment(Pos.CENTER);
        header.setPadding(new javafx.geometry.Insets(20));
        header.setStyle("-fx-background-color: #26BDE2;");

        root.setTop(header);

        // ===== CENTER CONTENT =====

        Label waterIcon = new Label("💧");
        waterIcon.setFont(Font.font(70));

        Label message = new Label(
                "Ensure availability and sustainable management\n"
                + "of water and sanitation for all."
        );
        message.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        message.setTextFill(Color.DARKBLUE);
        message.setAlignment(Pos.CENTER);

        // Progress bar
        Label progressTitle = new Label("Global Water Challenge");
        progressTitle.setFont(Font.font("Arial", FontWeight.BOLD, 18));

        ProgressBar progress = new ProgressBar(0.45);
        progress.setPrefWidth(350);

        Label progressText = new Label("45% - We still have a long way to go!");
        progressText.setFont(Font.font(14));

        VBox progressBox = new VBox(8,
                progressTitle,
                progress,
                progressText
        );
        progressBox.setAlignment(Pos.CENTER);

        // ===== ACTION BUTTONS =====

        Button saveWater = new Button("Save Water");
        Button learnMore = new Button("Learn More");

        saveWater.setStyle(
                "-fx-background-color: #26BDE2;" +
                "-fx-text-fill: white;" +
                "-fx-font-weight: bold;" +
                "-fx-padding: 10 20;"
        );

        learnMore.setStyle(
                "-fx-background-color: #00689D;" +
                "-fx-text-fill: white;" +
                "-fx-font-weight: bold;" +
                "-fx-padding: 10 20;"
        );

        Label actionMessage = new Label();

        saveWater.setOnAction(e ->
                actionMessage.setText(
                        "Every drop counts! Turn off the tap when not needed."
                )
        );

        learnMore.setOnAction(e ->
                actionMessage.setText(
                        "SDG 6 promotes clean water, sanitation and hygiene for everyone."
                )
        );

        HBox buttons = new HBox(15, saveWater, learnMore);
        buttons.setAlignment(Pos.CENTER);

        VBox center = new VBox(
                15,
                waterIcon,
                message,
                progressBox,
                buttons,
                actionMessage
        );

        center.setAlignment(Pos.CENTER);
        center.setPadding(new javafx.geometry.Insets(30));

        root.setCenter(center);

        // ===== FOOTER =====

        Label footer = new Label(
                "Small actions • Big impact • Save Water • Protect Our Future"
        );

        footer.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        footer.setTextFill(Color.WHITE);
        footer.setAlignment(Pos.CENTER);

        HBox footerBox = new HBox(footer);
        footerBox.setAlignment(Pos.CENTER);
        footerBox.setPadding(new javafx.geometry.Insets(15));
        footerBox.setStyle("-fx-background-color: #00689D;");

        root.setBottom(footerBox);

        // ===== SCENE =====

        Scene scene = new Scene(root, 700, 650);

        stage.setTitle("SDG 6 - Clean Water and Sanitation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

