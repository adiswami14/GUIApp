import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
public class GUITask implements ActionListener
{
    JFrame frame;
    JPanel menuPanel, buttonPanel;
    JMenuBar menuBar;
    JMenu font, font_size, text_color, bg_color, outline_color;
    JMenuItem red, blue, green;
    JMenuItem black, white, grey;
    JMenuItem small, medium, large;
    JMenuItem times, arial, comic;
    JMenuItem cyan, magenta, reds;
    JButton north, south, east, west, reset;
    JTextArea textArea;
    public GUITask()
    {
        frame = new JFrame("GUITask");
        frame.setSize(1500, 800);
        textArea = new JTextArea();
        north = new JButton("North");
        north.addActionListener(this);
        north.setBorder(new LineBorder(Color.RED));
        south = new JButton("South");
        south.addActionListener(this);
        south.setBorder(new LineBorder(Color.RED));

        east = new JButton("East");
        east.addActionListener(this);
        east.setBorder(new LineBorder(Color.RED));

        west = new JButton("West");
        west.addActionListener(this);
        west.setBorder(new LineBorder(Color.RED));

        reset = new JButton("Reset");
        reset.addActionListener(this);
        reset.setBorder(new LineBorder(Color.RED));
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4));
        buttonPanel.add(north);
        buttonPanel.add(south);
        buttonPanel.add(east);
        buttonPanel.add(west);
        textArea = new JTextArea();
        menuBar = new JMenuBar();
        font = new JMenu("Font");
        times = new JMenuItem("Times New Roman");
        times.addActionListener(this);
        times.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        font.add(times);
        arial = new JMenuItem("Arial");
        arial.addActionListener(this);
        arial.setFont(new Font("Arial", Font.PLAIN, 15));
        font.add(arial);
        comic = new JMenuItem("Comic Sans");
        comic.addActionListener(this);
        comic.setFont(new Font("Comic Sans", Font.PLAIN, 15));
        font.add(comic);
        menuBar.add(font);
        font_size = new JMenu("Font Size");
        small = new JMenuItem("Small");
        small.setFont(new Font("Arial", Font.PLAIN, 20));
        small.addActionListener(this);
        font_size.add(small);
        medium = new JMenuItem("Medium");
        medium.setFont(new Font("Arial", Font.PLAIN, 35));
        medium.addActionListener(this);
        font_size.add(medium);
        large = new JMenuItem("Large");
        large.setFont(new Font("Arial", Font.PLAIN, 50));
        large.addActionListener(this);
        font_size.add(large);
        menuBar.add(font_size);
        text_color = new JMenu("Text Color");
        menuBar.add(text_color);
        red = new JMenuItem("RED");
        red.setForeground(Color.RED);
        red.addActionListener(this);
        text_color.add(red);
        blue = new JMenuItem("BLUE");
        blue.setForeground(Color.BLUE);
        blue.addActionListener(this);
        text_color.add(blue);
        green = new JMenuItem("GREEN");
        green.setForeground(Color.GREEN);
        green.addActionListener(this);
        text_color.add(green);
        bg_color = new JMenu("Background Color");
        black = new JMenuItem("Black");
        black.setForeground(Color.BLACK);
        black.addActionListener(this);
        bg_color.add(black);
        white = new JMenuItem("White");
        white.setForeground(Color.WHITE);
        white.addActionListener(this);
        bg_color.add(white);
        grey = new JMenuItem("Grey");
        grey.setForeground(Color.GRAY);
        grey.addActionListener(this);
        bg_color.add(grey);
        menuBar.add(bg_color);
        outline_color = new JMenu("Border Color");
        reds = new JMenuItem("Red");
        reds.setForeground(Color.RED);
        reds.addActionListener(this);
        outline_color.add(reds);
        cyan = new JMenuItem("Cyan");
        cyan.setForeground(Color.CYAN);
        cyan.addActionListener(this);
        outline_color.add(cyan);
        magenta = new JMenuItem("Magenta");
        magenta.setForeground(Color.MAGENTA);
        magenta.addActionListener(this);
        outline_color.add(magenta);
        menuBar.add(outline_color);
        menuBar.add(reset);
        menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.X_AXIS));
        menuPanel= new JPanel();
        menuPanel.setLayout(new GridLayout(1,2));
        menuPanel.add(buttonPanel);
        menuPanel.add(menuBar);
        frame.setLayout(new BorderLayout());
        frame.add(menuPanel, BorderLayout.NORTH);
        frame.add(textArea, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==south)
        {
            buttonPanel.setLayout(new GridLayout(1, 4));
            frame.remove(menuPanel);
            frame.add(menuPanel, BorderLayout.SOUTH);
            menuPanel.setLayout(new GridLayout(1,2));
            menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.X_AXIS));
            frame.revalidate();
        }
        if(e.getSource()==north)
        {
            buttonPanel.setLayout(new GridLayout(1, 4));
            frame.remove(menuPanel);
            frame.add(menuPanel, BorderLayout.NORTH);
            menuPanel.setLayout(new GridLayout(1,2));
            menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.X_AXIS));
            frame.revalidate();
        }
        if(e.getSource()==east)
        {
            buttonPanel.setLayout(new GridLayout(4, 1));
            frame.remove(menuPanel);
            frame.add(menuPanel, BorderLayout.EAST);
            menuPanel.setLayout(new GridLayout(2,1));
            menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.Y_AXIS));
            frame.revalidate();
        }
        if(e.getSource()==west)
        {
            buttonPanel.setLayout(new GridLayout(4, 1));
            frame.remove(menuPanel);
            frame.add(menuPanel, BorderLayout.WEST);
            menuPanel.setLayout(new GridLayout(2,1));
            menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.Y_AXIS));
            frame.revalidate();
        }
        if(e.getSource()== red)
        {
            textArea.setForeground(Color.RED);
        }
        if(e.getSource()== blue)
        {
            textArea.setForeground(Color.BLUE);
        }
        if(e.getSource()== green)
        {
            textArea.setForeground(Color.GREEN);
        }
        if(e.getSource()== black)
        {
            textArea.setBackground(Color.BLACK);
        }
        if(e.getSource()== white)
        {
            textArea.setBackground(Color.WHITE);
        }
        if(e.getSource()== grey)
        {
            textArea.setBackground(Color.GRAY);
        }
        if(e.getSource() == small)
        {
            textArea.setFont(new Font(textArea.getFont().getName(), Font.PLAIN, 20));
        }
        if(e.getSource() == medium)
        {
            textArea.setFont(new Font(textArea.getFont().getName(), Font.PLAIN, 35));
        }
        if(e.getSource() == large)
        {
            textArea.setFont(new Font(textArea.getFont().getName(), Font.PLAIN, 50));
        }
        if(e.getSource() == times)
        {
            textArea.setFont(new Font("Times New Roman", Font.PLAIN, textArea.getFont().getSize()));
        }
        if(e.getSource() == arial)
        {
            textArea.setFont(new Font("Arial", Font.PLAIN, textArea.getFont().getSize()));
        }
        if(e.getSource() == comic)
        {
            textArea.setFont(new Font("Comic Sans", Font.PLAIN, textArea.getFont().getSize()));
        }
        if(e.getSource() == reds)
        {
            north.setBorder(new LineBorder(Color.RED));
            south.setBorder(new LineBorder(Color.RED));
            east.setBorder(new LineBorder(Color.RED));
            west.setBorder(new LineBorder(Color.RED));
            reset.setBorder(new LineBorder(Color.RED));
        }
        if(e.getSource() == cyan)
        {
            north.setBorder(new LineBorder(Color.CYAN));
            south.setBorder(new LineBorder(Color.CYAN));
            east.setBorder(new LineBorder(Color.CYAN));
            west.setBorder(new LineBorder(Color.CYAN));
            reset.setBorder(new LineBorder(Color.CYAN));
        }
        if(e.getSource() == magenta)
        {
            north.setBorder(new LineBorder(Color.MAGENTA));
            south.setBorder(new LineBorder(Color.MAGENTA));
            east.setBorder(new LineBorder(Color.MAGENTA));
            west.setBorder(new LineBorder(Color.MAGENTA));
            reset.setBorder(new LineBorder(Color.MAGENTA));
        }
        if(e.getSource() == reset)
        {
            textArea.setFont(new Font("Comic Sans", Font.PLAIN, 13));
            textArea.setBackground(Color.WHITE);
            textArea.setForeground(Color.BLACK);
            buttonPanel.setLayout(new GridLayout(1, 4));
            frame.remove(menuPanel);
            frame.add(menuPanel, BorderLayout.NORTH);
            menuPanel.setLayout(new GridLayout(1,2));
            menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.X_AXIS));
            north.setBorder(new LineBorder(Color.RED));
            south.setBorder(new LineBorder(Color.RED));
            east.setBorder(new LineBorder(Color.RED));
            west.setBorder(new LineBorder(Color.RED));
            reset.setBorder(new LineBorder(Color.RED));
            frame.revalidate();
        }
    }
    public static void main(String[] args)
    {
        GUITask app = new GUITask();
    }
}