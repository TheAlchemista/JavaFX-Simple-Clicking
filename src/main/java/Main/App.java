package Main;

// JavaFX
import javafx.application.Application;
import javafx.stage.Stage;

// Project imports
import Buttons.MovingButton;
import Controllers.SceneController;
import Controllers.GroupController;
import Controllers.StageController;

public class App extends Application 
{
  public static void main( String[] args ) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) {
    StageController stageController = new StageController();

    MovingButton movingButton = new MovingButton(
      stageController.getStage("mainStage").getWidth(),
      stageController.getStage("mainStage").getHeight()
    );

    GroupController groupController = new GroupController();
    groupController.addToGroup("mainGroup", movingButton.getButton());
    SceneController sceneController = new SceneController(groupController.getGroups());

    stageController.getStage("mainStage").setScene(sceneController.getScene("mainScene"));
    stageController.getStage("mainStage").setTitle("Catch the button!");
    stageController.getStage("mainStage").show();
  }
}
