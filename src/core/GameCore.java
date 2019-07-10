package core;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import libs.Configs;
import libs.CoreFunc;
import libs.GameText;

import java.util.ArrayList;

public class GameCore implements CoreFunc {

    // Main Game variables should be here

    @Override
    public void init(GraphicsContext gc) {
        // initialize objects (initial position, initial size, etc)
    }

    @Override
    public void animate(GraphicsContext gc, int time, ArrayList input) {
        // any animations and keyboard controls should be here
    }

    @Override
    public void mouseClick(MouseEvent e) {
        // mouse click event here
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        // mouse move event here
    }
}
