package msa.lang.draw.domain;

import msa.lang.draw.domain.math.Vector2D;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class Paper {
    private final BufferedImage image;
    private final Graphics2D graphics;

    public Paper(int w, int h) {
        image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
    }

    public void drawLine(Pen pen, Vector2D to) {
        graphics.setColor(new Color(pen.getColor()));

        graphics.setStroke(new BasicStroke(pen.getWidth()));

        Vector2D currentPos = pen.getPosition();
        graphics.drawLine((int) currentPos.x, (int) currentPos.y, (int) to.x, (int) to.y);
    }

    public void print(File outputFile) throws IOException {
        ImageIO.write(image, "png", outputFile);
    }

    public void print(OutputStream outputStream) throws IOException{
        ImageIO.write(image, "png", outputStream);
    }
}
