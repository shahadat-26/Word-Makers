/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

import com.oracle.webservices.internal.api.EnvelopeStyle;
import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.swing.plaf.basic.DefaultMenuLayout;
import static javax.swing.text.StyleConstants.Bold;

/**
 *
 * @author Asus
 */
public class playerName {

    String name;

    playerName( JFrame frm ) {
        //declare
       
        JPanel pn = new JPanel();
        pn.setLayout(new GridBagLayout());
      
        JLabel nameEnter = new JLabel("Enter Your Name : ");
        JTextField tf = new JTextField(15);
        tf.setText("  ");
        JButton btn = new JButton();
        JLabel lb3 = new JLabel("       ");

        //size
        frm.setSize(1900, 1000);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setText
        frm.setTitle("Word Makers");
        btn.setText("Enter");

        //font

        nameEnter.setFont(new Font(Font.SERIF, Font.PLAIN, 45));
        btn.setFont(new Font(Font.SERIF, Font.PLAIN, 45));
        tf.setFont(new Font(Font.SERIF, Font.PLAIN, 50));
        //color
        btn.setBackground(Color.lightGray);
        btn.setForeground(Color.BLACK);

        nameEnter.setForeground(new Color(255, 255, 204));
        pn.setBackground(new Color(0, 0, 51));

        

        pn.add(nameEnter);

        pn.add(tf);
        pn.add(lb3);
        pn.add(btn);
        frm.add(pn);

        frm.setVisible(true);

        tf.addActionListener((e) -> {

            name = tf.getText().trim();
            frm.remove(pn);
            new gameOptions(name, frm);

        });
        btn.addActionListener((e) -> {

            name = tf.getText().trim();
            frm.remove(pn);
            new gameOptions(name, frm);

        });

    }
}
