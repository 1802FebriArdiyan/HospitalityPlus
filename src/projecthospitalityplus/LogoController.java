package projecthospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LogoController {

    @FXML
    private Button btnNext;
    
    @FXML
    void nextData(ActionEvent event) throws IOException {
                
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root = loader.load();
           
        Stage stage = (Stage) btnNext.getScene().getWindow();
        stage.setScene (new Scene(root));
    }
       

}
