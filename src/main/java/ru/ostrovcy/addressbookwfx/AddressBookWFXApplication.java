package ru.ostrovcy.addressbookwfx;

import ca.pragmaticcoding.widgetsfx.layouts.TestStyle;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static ca.pragmaticcoding.widgetsfx.layouts.WidgetsKt.*;
import static ca.pragmaticcoding.widgetsfx.layouts.labels.LabelsKt.*;

public class AddressBookWFXApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Address Book");
        Scene scene = new Scene(createContent());
        addWidgetStyles(scene);
        stage.setScene(scene);
        stage.setMinHeight(700);
        stage.setMinWidth(600);
        stage.show();
    }

    private Region createContent() {
        Label label = h1Of("Starter Application");
        testStyleAs(label, TestStyle.RED);
        Button button = new Button("Hello World!");
        button.setDefaultButton(true);
        VBox vBox = new VBox(label,
                h2Of("Hello World!"),
                h3Of("Hello World!"),
                new HBox(5, promptOf("Hello: "), dataOf("World!")),
                button,
                new TextField("Hello World"));
        padWith(vBox, 40);
        addStyle(vBox, "standard-border");
        VBox outerVBox = new VBox(vBox);
//        outerVBox.getStylesheets().add(Objects.requireNonNull(AddressBookWFX.class.getResource("css/starter.css")).toString());
//        outerVBox.getStylesheets().add(Objects.requireNonNull(AddressBookWFX.class.getResource("css/widgetsfx.css")).toString());
        padWith(outerVBox, 20);
        return outerVBox;
    }
}