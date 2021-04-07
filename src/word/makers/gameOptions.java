/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

import com.sun.java.swing.plaf.windows.WindowsBorders;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author Asus
 */
public class gameOptions {
    gameOptions(String name, JFrame frm)
    {
        
        for(int i=0;i<=10;i++)
        {
            check.given[i]=false;
        }

      
        frm.setTitle("Word Makers");
       
  
        JPanel pn=new JPanel();
         pn.setBackground(new Color(0, 0,51));
                                                                                                                          
        JButton btn1 = new JButton("Get Started");
        JButton btn2 = new JButton("Instructions");
      
        pn.setLayout(null);
        btn1.setFont(new Font("Courier New Bold", Font.ITALIC, 50));
        btn2.setFont(new Font("Courier New Bold", Font.ITALIC, 50));
     
        btn1.setBounds(1200,400,600,80);
        btn2.setBounds(1200, 500, 600, 80);
     
        btn1.setBorder(new LineBorder(Color.black, 8, true));
        btn2.setBorder(new LineBorder(Color.black, 8, true));
       
        pn.add(btn1);
        pn.add(btn2);
      
       
        frm.add(pn);
        frm.setVisible(true);
          btn1.addActionListener((e) -> {
       
                  
     
                   
                 
                
              frm.remove(pn);
            try {
                new stringSelect(name, 0, frm);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
               
       });      
          btn2.addActionListener((e) -> {
                frm.remove(pn);
                new instructions(name,frm);
               
       });      
    
}
}