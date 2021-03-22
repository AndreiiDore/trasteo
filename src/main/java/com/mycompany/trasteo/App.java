package com.mycompany.trasteo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    public static ArrayList <Usuario> users=new ArrayList();

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
        Usuario andrei= new Usuario("andrei","andreidore");
        users.add(andrei);
        
    }
    public static boolean loggin(String nombre,String pass){
        for(Usuario u: users){
            if (u.getNombre().equals(nombre)) {
                if(u.getContaseña().equals(pass))
                    return true;
            }
        }
        return false;
    }
    

}