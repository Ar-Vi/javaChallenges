import java.util.ResourceBundle;

public class JChall1 {
    public class FXMLDocumentController implements Initializable {
        @FXML
        private Label label;
        @FXML
        private void handleButtonAction(ActionEvent event){
            System.out.println("You clicked *enthusiasm noises");
            label.setText("Hello");
        
        }

        @Override
        public void initialize(URL url, ResourceBundle rb){
            //what  
        }
    }
    
}
