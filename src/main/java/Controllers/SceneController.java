package Controllers;

// Java imports
import java.util.HashMap;

// JavaFX
import javafx.scene.Scene;
import javafx.scene.Group;

public class SceneController {

  private HashMap<String, Scene> scenes;

  public SceneController(HashMap<String, Group> groups) {
    this.scenes = new HashMap<String, Scene>();
    this.scenes.put("mainScene", new Scene(groups.get("mainGroup")));
  }

  public Scene getScene(String name) {
    return this.scenes.get(name);
  }

  public HashMap<String, Scene> getScenes() {
    return this.scenes;
  }
}
