package MovingButtonStage;

// Java imports
import java.awt.Toolkit;
import java.awt.Dimension;

// JavaFX
import javafx.stage.Stage;

public class MovingButtonStage {

    Stage stage;
    double SCALE_FACTOR;

    public MovingButtonStage() {
        SCALE_FACTOR = 0.6;
        stage = new Stage();
        this.configureStage(stage);
    }

    public Stage getStage() {
        return this.stage;
    }

    // Wrapper
    public double getSizeX() {
        return this.stage.getWidth();
    }

    // Wrapper
    public double getSizeY() {
        return this.stage.getHeight();
    }

    

    /**
     * Configures stage object.
     * @param stage <code>Stage</code> object which will be configured.
     * @return Configured <code>Stage</code> object.
     */
    private Stage configureStage(Stage stage) {
        this.configureStageSize(stage);
        return stage;
    }

    /**
     * Configures the size of a given stage using universal <code>SCALE_FACTOR</code> variable.
     * @param stage <code>Stage</code> object which size will be changed.
     * @return Configured <code>Stage</code> object.
     */
    private Stage configureStageSize(Stage stage) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        stage.setWidth((int) Math.round(dim.getSize().width*this.SCALE_FACTOR));
        stage.setHeight((int) Math.round(dim.getSize().height*this.SCALE_FACTOR));
        return stage;
    }
}
