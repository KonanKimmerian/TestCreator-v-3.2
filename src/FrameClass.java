import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class Costil extends JComponent{
    Image i;

    public Costil(Image i) {
        this.i = i;
    }

    @Override
    public void paintComponent(Graphics g){
        g.drawImage(i,0,0,null);
    }
}

public class FrameClass {
    JFrame frame;
    String imagePath="image.jpg";
    BufferedImage img;
    {
        try {
            img = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void drawicon(){
        Graphics g=frame.getGraphics();
        g.drawImage(img,0,0,frame.getWidth(),frame.getHeight(),null);
    }

    public FrameClass(String name) {
        this.frame = createDefault(name);
//        frame.add(new DrawingArea(frame));
        drawicon();
    }

    public JFrame createDefault(String name){
        JFrame frame1 = new JFrame(name);
        frame1.setUndecorated(false);
        frame1.pack();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.setLayout(null);
        frame1.setVisible(true);
        img.getScaledInstance(frame1.getWidth(),frame1.getHeight(),Image.SCALE_DEFAULT);
        frame1.setContentPane(new Costil(img));
        return frame1;
    }

    public JButton createButton(String name, Rectangle bounds, ActionListener listener){
        JButton button=new JButton(name);
        button.setBounds(bounds);
        frame.add(button);
        frame.repaint();
        button.addActionListener(listener);
        button.setVisible(true);
        return button;

    }

    public JLabel createLabel(String text,Rectangle bounds,Color color){
        JLabel label=new JLabel();
        label.setText(text);
        label.setBounds(bounds);
        label.setForeground(Color.RED);
        frame.add(label);
        frame.repaint();
        label.setVisible(true);
        return label;
    }

    public JTextField createField(Rectangle bounds){
        JTextField field=new JTextField();
        field.setBounds(bounds);
        frame.add(field);
        frame.repaint();
        field.setVisible(true);
        return field;
    }

    public java.awt.List createAwtList(Rectangle bounds, String text){
        java.awt.List list=new java.awt.List(5);
        list.setBounds(bounds);
        list.add(text);
        list.setForeground(Color.RED);
        frame.add(list);
        frame.repaint();
        return list;
    }




}
