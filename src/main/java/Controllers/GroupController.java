package Controllers;

// Java imports
import java.util.HashMap;

// JavaFX
import javafx.scene.Group;
import javafx.scene.control.Button;

public class GroupController {

  private HashMap<String, Group> groups;

  public GroupController() {
    this.groups = new HashMap<String, Group>();
    this.groups.put("mainGroup", new Group());
  }

  public boolean addToGroup(String name, Button button) {
    return this.groups.get(name).getChildren().add(button);
  }

  public Group getGroup(String name) {
    return this.groups.get(name);
  }

  public HashMap<String, Group> getGroups() {
    return this.groups;
  }
}
