import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.awt.Cursor;

public class ChangeCursor extends JFrame 
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            ChangeCursor frame1 = new ChangeCursor();
            frame1.setTitle("Change Cursor");
            frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame1.setSize(500, 500);
            frame1.setBounds(0, 0, 300, 300);

            ChangeCursor frame2 = new ChangeCursor();
            frame2.setTitle("Change Cursor");
            frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame2.setSize(500, 500);
            frame2.setBounds(350, 0, 300, 300);

            ChangeCursor frame3 = new ChangeCursor();
            frame3.setTitle("Change Cursor");
            frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame3.setSize(500, 500);
            frame3.setBounds(0, 350, 300, 300);
            ChangeCursor frame4 = new ChangeCursor();
            frame4.setTitle("Change Cursor");
            frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame4.setSize(500, 500);
            frame4.setBounds(350, 350, 300, 300);

            
            Cursor cursor1 = new Cursor(Cursor.WAIT_CURSOR);
            frame1.setCursor(cursor1);
            frame1.setVisible(true);

            Cursor cursor2 = new Cursor(Cursor.CROSSHAIR_CURSOR);
            frame2.setCursor(cursor2);
            frame2.setVisible(true);

             Cursor cursor3 = new Cursor(Cursor.DEFAULT_CURSOR);
            frame3.setCursor(cursor3);
            frame3.setVisible(true);

             Cursor cursor4 = new Cursor(Cursor.HAND_CURSOR);
            frame4.setCursor(cursor4);
            frame4.setVisible(true);
        });
    }
}