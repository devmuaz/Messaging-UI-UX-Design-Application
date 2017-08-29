package development;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;


public class MainFrameController implements Initializable {
    int initialX, initialY;
    
    @FXML private AnchorPane ap_top, ap_main;
    @FXML private Pane pnl1, pnl2, pnl3, pnl4;
    @FXML private AnchorPane users_pnl, messages_pnl, calls_pnl, settings_pnl;
    
    @FXML
    public void OnMousePressed(MouseEvent me){
        if (me.getButton() != MouseButton.MIDDLE) {
            initialX = (int) me.getSceneX();
            initialY = (int) me.getSceneY();
        }
    }
    @FXML
    public void OnMouseDragged(MouseEvent me){
        if (me.getButton() != MouseButton.MIDDLE) {
            ap_top.getScene().getWindow().setX(me.getScreenX() - initialX);
            ap_top.getScene().getWindow().setY(me.getScreenY() - initialY);
        }
    }
    @FXML
    public void ShowUsers(ActionEvent e){
        pnl1.setVisible(true);
        pnl2.setVisible(false);
        pnl3.setVisible(false);
        pnl4.setVisible(false);
        users_pnl.setVisible(true);
        messages_pnl.setVisible(false);
        calls_pnl.setVisible(false);
        settings_pnl.setVisible(false);            
    }
    @FXML
    public void ShowMessages(ActionEvent e){
        pnl1.setVisible(false);
        pnl2.setVisible(true);
        pnl3.setVisible(false);
        pnl4.setVisible(false);
        users_pnl.setVisible(false);
        messages_pnl.setVisible(true);
        calls_pnl.setVisible(false);
        settings_pnl.setVisible(false);
    }
    @FXML
    public void ShowCalls(ActionEvent e){
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnl3.setVisible(true);
        pnl4.setVisible(false);
        users_pnl.setVisible(false);
        messages_pnl.setVisible(false);
        calls_pnl.setVisible(true);
        settings_pnl.setVisible(false);
    }
    @FXML
    public void ShowSettings(ActionEvent e){
        pnl1.setVisible(false);
        pnl2.setVisible(false);
        pnl3.setVisible(false);
        pnl4.setVisible(true);
        users_pnl.setVisible(false);
        messages_pnl.setVisible(false);
        calls_pnl.setVisible(false);
        settings_pnl.setVisible(true);
    }
    @FXML
    public void Exit(ActionEvent e){
        Platform.exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
