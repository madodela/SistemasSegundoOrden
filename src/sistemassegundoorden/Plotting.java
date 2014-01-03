package sistemassegundoorden;

import javax.swing.JFrame;
import org.math.plot.*;

/**
 * @author Loli Delgado
 */
public class Plotting {

    public void graficar(double []x, double[]y) {
        // create your PlotPanel (you can use it as a JPanel)
        Plot2DPanel plot = new Plot2DPanel();

        // add a line plot to the PlotPanel
        plot.addLinePlot("my plot", x, y);

        // put the PlotPanel in a JFrame, as a JPanel
        JFrame frame = new JFrame("a plot panel");
        frame.setContentPane(plot);
        frame.setVisible(true);
    }

}
