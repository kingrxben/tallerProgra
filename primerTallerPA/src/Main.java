import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class Main {
    public static void dibujarLineas(double max, double min, double x0, double y0, double x1, double y1, double velocidadX, double velocidadY, double velocidadX1, double velocidadY1, Color colores[]){

        for (int i = 1; i <=6 ; i++) {

            if (Math.abs(x0 + velocidadX) > max || Math.abs(x0 + velocidadX) < min){
                velocidadX = -velocidadX;
            }
            if (Math.abs(x1 + velocidadX) > max || Math.abs(x1 + velocidadX) < min){
                velocidadX1 = -velocidadX1;
            }
            if (Math.abs(y0 + velocidadY) > max || Math.abs(y0 + velocidadY) < min){
                velocidadY = -velocidadY;
            }
            if (Math.abs(y1 + velocidadY) > max || Math.abs(y1 + velocidadY) < min){
                velocidadY1 = -velocidadY1;
            }

            x0 += velocidadX;
            y0 += velocidadY;
            x1 += velocidadX1;
            y1 += velocidadY1;

            Color colorRandom = colores[colorRandom(colores)];
            StdDraw.setPenColor(colorRandom);
            StdDraw.line(x0, y0, x1, y1);
            StdDraw.pause(10);
        }
    }

    public static int colorRandom(Color []colores){
        return (int) (Math.random() * colores.length);
    }

    public static void main(String[] args) {

        double min = -1.0;
        double max = 1.0;

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        StdDraw.enableDoubleBuffering();

        Color[]colores = {Color.YELLOW,Color.BLACK,Color.MAGENTA,Color.RED,Color.blue,Color.GREEN};

        double x0 = min + (max - min) * Math.random();
        double y0 = min + (max - min) * Math.random();

        double x1 = min + (max - min) * Math.random();
        double y1 = min + (max - min) * Math.random();

        double velocidadX = Math.random() * 0.1;
        double velocidadX1 = Math.random() * 0.1;
        double velocidadY = Math.random() * 0.1;
        double velocidadY1 = Math.random() * 0.1;

        while (true){

            if (Math.abs(x0 + velocidadX) > max || Math.abs(x0 + velocidadX) < min){
                velocidadX = -velocidadX;
            }
            if (Math.abs(x1 + velocidadX) > max || Math.abs(x1 + velocidadX) < min){
                velocidadX1 = -velocidadX1;
            }
            if (Math.abs(y0 + velocidadY) > max || Math.abs(y0 + velocidadY) < min){
                velocidadY = -velocidadY;
            }
            if (Math.abs(y1 + velocidadY) > max || Math.abs(y1 + velocidadY) < min){
                velocidadY1 = -velocidadY1;
            }

            x0 += velocidadX;
            y0 += velocidadY;
            x1 += velocidadX1;
            y1 += velocidadY1;

            dibujarLineas(max,min,x0,y0,x1,y1,velocidadX,velocidadY,velocidadX1,velocidadY1,colores);
            StdDraw.show();
            StdDraw.clear();

        }
    }
}