package projecthospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController {

    @FXML
    private Button btnMasuk;

    @FXML
    private TextField fieldAddress;

    @FXML
    private Button fieldBack;

    @FXML
    private PasswordField fieldConfirmPassword;

    @FXML
    private TextField fieldEmail;

    @FXML
    private Button fieldLogin;

    @FXML
    private TextField fieldName;

    @FXML
    private TextField fieldNumTelp;

    @FXML
    private PasswordField fieldPassword;

    @FXML
    void btnBack(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) fieldBack.getScene().getWindow();
        stage.setScene (new Scene(root));
    }

    @FXML
    void btnDaftar(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Beranda.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnMasuk.getScene().getWindow();
        stage.setScene (new Scene(root)); 
    }

    @FXML
    void btnLogin(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) fieldLogin.getScene().getWindow();
        stage.setScene (new Scene(root));

    }

}
