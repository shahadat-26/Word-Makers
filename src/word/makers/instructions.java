/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Asus
 */
public class instructions {
    public instructions(String name, JFrame frm)
    {
        JPanel pn = new JPanel();
        pn.setBackground(new Color(0, 0, 51));
        pn.setLayout(null);
        
        JLabel lb= new JLabel();
        JLabel lb1= new JLabel();
        JLabel lb2= new JLabel();
        lb.setText("The letters of a word are shuffled and given ");
      lb1.setText("         to you. You have to make a word        ");
        lb2.setText("constitute of the letters within given time. ");
        lb.setFont(new Font(Font.SERIF, Font.PLAIN, 80)); 
         lb1.setFont(new Font(Font.SERIF, Font.PLAIN, 80)); 
         lb2.setFont(new Font(Font.SERIF, Font.PLAIN, 80)); 
         lb.setForeground(new Color(255, 255, 204));
         lb1.setForeground(new Color(255, 255, 204));
         lb2.setForeground(new Color(255, 255, 204));
        lb.setBounds(200,100,1500,200);
        lb1.setBounds(200,300,1500,200);
        lb2.setBounds(200,500,1500,200);
        
        JButton btn1 = new JButton("Back");
      
        btn1.setFont(new Font("Courier New Bold", Font.ITALIC, 50));
       
        btn1.setBounds(1400, 750, 300, 80);
    
        btn1.setBorder(new LineBorder(Color.black, 8, true));
        
        btn1.addActionListener((e) -> {
             frm.remove(pn);
             new gameOptions(name, frm);

        });
        
        
        pn.add(lb);
        pn.add(lb1);
        pn.add(lb2);
        pn.add(btn1);
        frm.add(pn);
        frm.setVisible(true);
        
    }
    
}
