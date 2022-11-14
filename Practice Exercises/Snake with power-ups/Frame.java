import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Frame {
    

    Snake snake;
    ArrayList<Food> foods;

    Frame(){
        JFrame f = new JFrame("Panel Example");
        foods = new ArrayList<>();
        fillArrayList();
        snake = new Snake(f, foods);
        f.add(snake);
        f.setSize(860,860);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }


    private void fillArrayList() {
        for (int i = 0; i < 100; i++) {
            foods.add(new Food());
        }
    }


    public static void main(String[] args) {
        new Frame();
    }


}
