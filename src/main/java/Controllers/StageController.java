package Controllers;

// Java imports
import java.util.HashMap;

// JavaFX
import javafx.stage.Stage;

// Project imports
import Stages.MainStage;

public class StageController {

  HashMap<String, Stage> stages;

  public StageController() {
    this.stages = new HashMap<String, Stage>();
    this.stages.put("mainStage", new MainStage());
  }

  public Stage getStage(String name) {
    return this.stages.get(name);
  }
}
