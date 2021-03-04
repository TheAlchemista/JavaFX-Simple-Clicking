package Main;


// JavaFX
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Project imports
import MovingButton.MovingButton;
import MovingButtonStage.MovingButtonStage;


public class App extends Application 
{
    public static void main( String[] args ) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        MovingButtonStage movingButtonStage = new MovingButtonStage();

        MovingButton movingButton = new MovingButton(
            movingButtonStage.getSizeX(),
            movingButtonStage.getSizeY()
        );

        Group root = new Group(movingButton.getButton());
        Scene scene = new Scene(root);
        movingButtonStage.getStage().setScene(scene);
        movingButtonStage.getStage().setTitle("Catch the button!");
        movingButtonStage.getStage().show();
    }
}
