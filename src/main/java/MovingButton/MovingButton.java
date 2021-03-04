package MovingButton;

// JavaFX
import javafx.scene.control.Button;

// Project imports
import GetRandomLayout.GetRandomLayout;

public class MovingButton extends Button {

    GetRandomLayout getRandomLayout;
    int numberOfClicks;

    // Constructor
    public MovingButton(double stageWidth, double stageHeight) {
        this.setMovingButton();
        getRandomLayout = new GetRandomLayout(
            stageWidth,
            stageHeight, 
            this.getWidth(),
            this.getHeight()
            );
    }

    public MovingButton getButton() {
        return this;
    }

    private MovingButton setMovingButton() {
        this.setLayoutX(500);
        this.setLayoutY(500);
        this.setText("Click me!");
        this.numberOfClicks = 0;
        this.addActionListener();
        return this;
    }

    private MovingButton addActionListener() {
        this.setOnAction(e->((MovingButton)e.getSource()).onClick());
        return this;
    }

    public MovingButton setLayout(double x, double y) {
        this.setLayoutX(x);
        this.setLayoutY(y);
        return this;
    }

    public void onClick() {
        this.setLayout(
            this.getRandomLayout.getNewLayoutX(),
            this.getRandomLayout.getNewLayoutY()
        );
        this.setText(String.valueOf(this.numberOfClicks++));
    }
}
