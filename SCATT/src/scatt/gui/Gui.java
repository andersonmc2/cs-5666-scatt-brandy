package scatt.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 * @author Matt Stone
 * @author
 * @author
 * @author
 * @version 1.0
 * 
 */
public class Gui
{

    private JFrame frame;
    private JFileChooser jFileChooser;

    /**
     * Create the GUI application.
     */
    public Gui()
    {
        jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        initialize();

    }

    /**
     * Launch the GUI application.
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    Gui window = new Gui();
                    window.frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Test method that opens up a file chooser.
     */
    protected void openFileMenu()
    {
        // open file chooser and then check if they approved a file
        if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            jFileChooser.getCurrentDirectory();
        }
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnJfilechoser = new JButton("jfilechoser");

        // The function called when the button is pressed.
        btnJfilechoser.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                openFileMenu();
            }
        });
        btnJfilechoser.setBounds(154, 108, 97, 25);
        frame.getContentPane().add(btnJfilechoser);
    }

}
