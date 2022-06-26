import java.applet.Applet;
import java.awt.Graphics;

public class test extends Applet {
    int r, area;

    public void init() {
        r = Integer.parseInt(getParameter("radius"));
        area = 22 * r * r / 7;
    }

    public void paint(Graphics g) {
        g.drawString("Area of Circle = " + area, 20, 30);
        g.drawString("Welcome", 150, 150);
    }
}