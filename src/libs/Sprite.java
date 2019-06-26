package libs;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Sprite extends ImageView {

    int xpos;
    int ypos;

    public String imgPath;
    Configs config = new Configs();

    public void resize(double factor) {
        double newdim = this.getImage().getHeight() * factor;
        this.setImage(new Image(this.imgPath, newdim, newdim, true, false));
    }

    public void resize(int width, int height) {
        // check first which one is larger between height and width
        Image tmp = new Image(this.imgPath);
        this.setImage(new Image(this.imgPath, width, height, true, true);
    }

    public void render(GraphicsContext gc, int x, int y) {
        gc.drawImage(this.getImage(), x, y);
        this.ypos = y;
        this.xpos = x;
    }

    public boolean collide(Sprite sprite) {
        boolean isCollide = false;

        if (this.intersects(sprite.getBoundsInParent()))
            return true;

        int yBottom = this.ypos + (int) Math.round(this.getImage().getHeight());
        int xRight = this.xpos + (int) Math.round(this.getImage().getWidth());

        int spriteBottom = sprite.ypos + (int) Math.round(sprite.getImage().getHeight());
        int spriteRight = sprite.xpos + (int) Math.round(sprite.getImage().getWidth());

        if (yBottom > sprite.ypos && ypos < sprite.ypos) {
            if (xRight > sprite.xpos && xpos < sprite.xpos)
                isCollide = true;
        }

        if (spriteBottom > this.ypos && sprite.ypos < this.ypos) {
            if (spriteRight > this.xpos && sprite.xpos < this.xpos)
                isCollide = true;
        }

        return isCollide;
    }

}
