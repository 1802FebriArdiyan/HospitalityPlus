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

public class LoginController {

    @FXML
    private Button btnDaftar;

    @FXML
    private Button btnMasuk;

    @FXML
    private TextField fieldName;

    @FXML
    private PasswordField fieldPassword;

    @FXML
    void btnLogin(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Beranda.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnMasuk.getScene().getWindow();
        stage.setScene (new Scene(root));    
    }
    
    @FXML
    void btnSignUp(ActionEvent event)  throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
        Parent root = loader.load();
        
        Stage stage = (Stage) btnDaftar.getScene().getWindow();
        stage.setScene (new Scene(root));    
        
    }

}
