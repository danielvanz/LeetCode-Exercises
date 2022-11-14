import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Snake extends JPanel implements KeyListener, ActionListener {

    public int x_cord_snake;
    public int y_cord_snake;
    public int old_x_cord_snake;
    public int old_y_cord_snake;

    final int SNAKE_WIDTH = 20;
    final int SNAKE_HEIGHT = 20;

    Timer t = new Timer(25, this);
    String direction;

    // List of food
    ArrayList<Food> foods;

    // List of Tail
    ArrayList<SnakeTail> tail = new ArrayList<>();

    JFrame frame;
    JLabel label = new JLabel();

    Snake(JFrame frame, ArrayList<Food> foods) {
        this.foods = foods;
        frame.add(foods.get(0));
        this.frame = frame;
        direction = "r";
        setBackground(Color.RED);
        x_cord_snake = 400;
        y_cord_snake = 400;
        setBounds(x_cord_snake, y_cord_snake, SNAKE_WIDTH, SNAKE_HEIGHT);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
        t.start();
    }

    public void left() {

        old_x_cord_snake = x_cord_snake;
        old_y_cord_snake = y_cord_snake;

        if (x_cord_snake == 0) {
            x_cord_snake = 800;
        } else {
            x_cord_snake -= 20;
        }
    }

    public void up() {

        old_x_cord_snake = x_cord_snake;
        old_y_cord_snake = y_cord_snake;

        if (y_cord_snake == 0) {
            y_cord_snake = 800;
        } else {
            y_cord_snake -= 20;
        }
    }

    public void right() {

        old_x_cord_snake = x_cord_snake;
        old_y_cord_snake = y_cord_snake;

        if (x_cord_snake == 800) {
            x_cord_snake = 0;
        } else {
            x_cord_snake += 20;
        }
    }

    public void down() {

        old_x_cord_snake = x_cord_snake;
        old_y_cord_snake = y_cord_snake;

        if (y_cord_snake == 800) {
            y_cord_snake = 0;
        } else {
            y_cord_snake += 20;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_LEFT) {
            direction = "l";
        }
        if (code == KeyEvent.VK_UP) {
            direction = "u";
        }
        if (code == KeyEvent.VK_RIGHT) {
            direction = "r";
        }
        if (code == KeyEvent.VK_DOWN) {
            direction = "d";
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (direction.equals("l")) {
            left();
        }
        if (direction.equals("u")) {
            up();
        }
        if (direction.equals("r")) {
            right();
        }
        if (direction.equals("d")) {
            down();
        }

        moveTail();
        setLocation(x_cord_snake, y_cord_snake);

        foods.get(0).setLocation(foods.get(0).getX(), foods.get(0).getY());

        if (foods.get(0).getY() == y_cord_snake && foods.get(0).getX() == x_cord_snake) {
            eat();
        }
        // else{

        // }
    }

    void moveTail() {
        int x_prev = 10;
        int y_prev = 10;
        int x_prev1 = 10;
        int y_prev1 = 10;

        for (int i = 0; i < tail.size(); i++) {
            if (i == 0) {
                // x_prev = tail.get(i).getX();
                // y_prev = tail.get(i).getY();
                tail.get(i).setBackground(Color.CYAN);

                tail.get(i).setToolTipText("" + tail.size());

                tail.get(i).setLocation(this.getX(), this.getY());
                tail.get(i).setVisible(false);
                tail.get(i).add(label);
                label.setText(tail.size() + "");
                // tail.get(i).setVisible(true);
                tail.get(i).setBackground(Color.PINK);

            }

            x_prev1 = tail.get(i).getX();
            y_prev1 = tail.get(i).getY();

            if (x_prev1 == x_cord_snake && y_prev1 == y_cord_snake) {
                for (SnakeTail t : tail) {
                    t.setInvisible();
                }
                tail.clear();
            } else {
                tail.get(i).setLocation(x_prev, y_prev);
                tail.get(i).setVisible(false);
                tail.get(i).setVisible(true);

                x_prev = x_prev1;
                y_prev = y_prev1;

            }

        }

    }

    void eat() {
        // Add New Food
        frame.add(foods.get(1));
        foods.get(1).setVisible(false);
        foods.get(1).setVisible(true);

        // Remove Old Food
        foods.get(0).setInvisible();
        foods.remove(0);

        GrowTail();
    }

    void GrowTail() {

        tail.add(new SnakeTail(old_x_cord_snake, old_y_cord_snake));

        // for (int i = 0; i < tail.size(); i++) {
        // frame.add(tail.get(i));
        // tail.get(i).setVisible(false);
        // tail.get(i).setVisible(true);
        // }
        frame.add(tail.get(tail.size() - 1));
        // tail.get(tail.size() -1).setVisible(false);
        // tail.get(tail.size() -1).setVisible(true);

    }

}
