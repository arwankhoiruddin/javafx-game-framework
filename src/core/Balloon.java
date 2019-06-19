package core;

import javafx.scene.canvas.GraphicsContext;
import libs.Configs;
import libs.Sprite;
import javafx.scene.image.Image;

import java.util.Random;


public class Balloon extends Sprite {

    public Balloon()  {
        super.imgPath = "/core/balloon.png";
        super.setImage(new Image(imgPath));
    }

}
