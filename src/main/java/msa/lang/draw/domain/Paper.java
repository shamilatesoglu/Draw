package msa.lang.draw.domain;

import msa.lang.draw.domain.math.Vector2D;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Paper {
    private JFrame frame;
    private Canvas canvas;

    public Paper(int w, int h) {
        frame = new JFrame("Draw");
        frame.setSize(w, h);

        canvas = new Canvas();
        canvas.setSize(w, h);
        canvas.setBackground(Color.WHITE);

        frame.add(canvas);

        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public void drawLine(Pen pen, Vector2D to) {
        Graphics2D graphics = (Graphics2D) canvas.getGraphics();
        graphics.setColor(new Color(pen.getColor()));

        graphics.setStroke(new BasicStroke(pen.getWidth()));

        Vector2D currentPos = pen.getPosition();
        graphics.drawLine((int) currentPos.x, (int) currentPos.y, (int) to.x, (int) to.y);
        frame.revalidate();
        frame.repaint();
    }

    public void print(File outputFile) throws IOException {
        BufferedImage img = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = img.createGraphics();
        canvas.printAll(g2d);
        ImageIO.write(img, "png", outputFile);
    }
}
