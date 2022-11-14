import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakeTail extends JPanel{
    

    int x_tail;
    int y_tail;
    int x_head;
    int y_head;

    final int TAIL_WIDTH = 20;
    final int TAIL_HEIGHT = 20;

    SnakeTail(int x_tail, int y_tail){
        this.x_tail = x_tail;
        this.y_tail = y_tail;
        setBackground(Color.BLACK);
        setBounds(x_tail, y_tail, TAIL_WIDTH, TAIL_HEIGHT);
    }

    public void setInvisible() {
        setLocation(1000, 1000);
}



}
