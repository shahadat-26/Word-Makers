/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

/**
 *
 * @author Asus
 */
public class exit {
    String level;
    exit(String name ,int points , JFrame frm)
    {
        JPanel pn = new JPanel();
        pn.setBackground(new Color(0, 0, 51));
        pn.setLayout(null);
        
        if(points<200)
        {
            level="Freasher";
        }
        else if(points>=200 && points <500)
        {
            level="Struggler";
        }
        else if(points >=500 && points <800)
        {
            level="Expert";
        }
        else 
        {
            level="Master";
        }

        JButton btn1 = new JButton("Close");
      
        btn1.setFont(new Font("Courier New Bold", Font.ITALIC, 50));
       
        btn1.setBounds(1400, 700, 300, 80);
    
        btn1.setBorder(new LineBorder(Color.black, 8, true));
       

        JLabel lb = new JLabel();
        JLabel lb1 = new JLabel();
        lb.setText("Bye");
        lb.setForeground(new Color(192,192,192));
        lb.setFont(new Font(Font.SERIF, Font.PLAIN, 100));
        lb.setBounds(400, 400, 200, 300);

        lb1.setText(level+"  "+name);
        lb1.setFont(new Font(Font.SERIF, Font.PLAIN, 100));
        lb1.setBounds(600, 400, 1000, 300);
//        lb1.setForeground(new Color(255, 255, 204));

        JLabel pointShow = new JLabel(""+points);
        pointShow.setFont(new Font(Font.SERIF, Font.PLAIN,200));
        pointShow.setBounds(700, 200, 600, 200);
        pointShow.setForeground(new Color(255, 255, 204));
        pn.add(pointShow);
        
         if(points<200)
        {
            pointShow.setForeground(new Color(255, 255, 204));
            lb1.setForeground(new Color(255, 255, 204));
        }
        else if(points>=200 && points <500)
        {
             pointShow.setForeground(new Color(255, 102, 255));
             lb1.setForeground(new Color(255, 102, 255));
        }
        else if(points >=500 && points <800)
        {
              pointShow.setForeground(new Color(255, 255, 0));
              lb1.setForeground(new Color(255, 255, 0));
        }
        else 
        {
             pointShow.setForeground(new Color(255, 128, 0));
            lb1.setForeground(new Color(255, 128, 0));
        }


       
        pn.add(btn1);
      
        pn.add(lb);
        pn.add(lb1);
        frm.add(pn);
        frm.setVisible(true);
         btn1.addActionListener((e) -> {
             frm.remove(pn);
             frm.dispose();

        });

        
    }
    
}
