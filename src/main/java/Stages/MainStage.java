package Stages;

// Java imports
import java.awt.Toolkit;
import java.awt.Dimension;

// JavaFX
import javafx.stage.Stage;

// Project imports
import Constants.Constants;

public class MainStage extends Stage {

  Constants constants;

  public MainStage() {
    constants = new Constants();
    this.configureStage();
  }

  /**
   * Configures stage object.
   * @param stage <code>Stage</code> object which will be configured.
   * @return Configured <code>Stage</code> object.
   */
  private Stage configureStage() {
    this.configureStageSize();
    return this;
  }

  /**
   * Configures the size of a given stage using universal <code>SCALE_FACTOR</code> variable.
   * @param stage <code>Stage</code> object which size will be changed.
   * @return Configured <code>Stage</code> object.
   */
  private Stage configureStageSize() {
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setWidth((int) Math.round(dim.getSize().width*this.constants.getSceneScaleFactor()));
    this.setHeight((int) Math.round(dim.getSize().height*this.constants.getSceneScaleFactor()));
    return this;
  }
}
