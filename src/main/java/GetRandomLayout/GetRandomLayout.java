package GetRandomLayout;

// Java imports
import java.util.Random;

public class GetRandomLayout {

    double maxLayoutX;
    double maxLayoutY;
    Random random;

    public GetRandomLayout(
        double stageWidth,
        double stageHeight,
        double buttonWidth,
        double buttonHeight
    ) {
        maxLayoutX = stageWidth - buttonWidth;
        maxLayoutY = stageHeight - buttonHeight;
        random = new Random();
    }

    public double getNewLayoutX() {
        return random.nextDouble() * this.getNewLayout(this.maxLayoutX);
    }

    public double getNewLayoutY() {
        return random.nextDouble() * this.getNewLayout(this.maxLayoutY);
    }

    private double getNewLayout(double maxValue) {
        return random.nextDouble() * maxValue;
    }
}
