import java.awt.Color;

import javax.swing.JPanel;
import java.util.Random;

public class Food extends JPanel{
    
    Random rand = new Random();

    public int y_rand;
    public int x_rand;
    final int FOOD_WIDTH = 20;
    final int FOOD_HEIGHT = 20;


    Food(){
        setBackground(Color.BLUE);
        fixCoords(y_rand, x_rand);
    }


    private void fixCoords(int y_rand, int x_rand) {
        y_rand = rand.nextInt(800) + 20;
        x_rand = rand.nextInt(800) + 20;

        int i = rand.nextInt(1);
        if (i == 0){
            y_rand = y_rand - (y_rand % 20);
            x_rand = x_rand - (x_rand % 20);
         }
        else{
            y_rand = y_rand + (y_rand % 20);
            x_rand = x_rand + (x_rand % 20);
        }
        setBounds(x_rand, y_rand, FOOD_WIDTH, FOOD_WIDTH);
    }

    public void setInvisible() {
            setLocation(1000, 1000);
    }
}
