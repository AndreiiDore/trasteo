package com.mycompany.trasteo;

import static com.mycompany.trasteo.App.users;
import java.awt.Button;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private TextField nombreUser;
    @FXML
    private PasswordField passUser;
    @FXML
    private Button entrar;
    @FXML
    private Label resultado;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
   
    private void loggin(String nombre,String pass){
        for(Usuario u: users){
            if (u.getNombre().equals(nombre)) {
                if(u.getContaseña().equals(pass))
                    resultado.setText("Correcto");
            }
                resultado.setText("Contraseña incorrecta");
        }
        resultado.setText("Usuario no encontrado");
    }
}
