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
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class accepted {
    int k;
    accepted(String name , int points, JFrame frm)
    {
     
     JPanel pn = new JPanel();
        pn.setBackground(new Color(0, 0, 51));
        pn.setLayout(null);

        JButton btn1 = new JButton("Next");
        JButton btn2 = new JButton("Exit");
        btn1.setFont(new Font("Courier New Bold", Font.ITALIC, 50));
        btn2.setFont(new Font("Courier New Bold", Font.ITALIC, 50));
        btn1.setBounds(1400, 400, 300, 80);
        btn2.setBounds(1400, 500, 300, 80);
        btn1.setBorder(new LineBorder(Color.black, 8, true));
        btn2.setBorder(new LineBorder(Color.black, 8, true));

        JLabel lb = new JLabel();
      
        lb.setText("Congrates ! You've Solved It");
        lb.setForeground(Color.GREEN);
        lb.setFont(new Font(Font.SERIF, Font.PLAIN, 100));
        lb.setBounds(300, 10, 1200, 300);

    

        JLabel pointShow = new JLabel("" + name + "  " + points);
        pointShow.setFont(new Font("Courier New Bold", Font.ITALIC, 50));
        pointShow.setBounds(1300, 700, 600, 80);
        pn.add(pointShow);

        k = 30;
        Timer timer;
        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                k--;
                if (k > 0 && k % 2 == 0) {

                    lb.setText("");

                } else if (k > 0 && k % 2 == 1) {

                    lb.setText("Congrates ! You've Solved It");

                } else {
                    lb.setText("Congrates ! You've Solved It");
                    ((Timer) (e.getSource())).stop();

                }
            }
        });
        timer.setInitialDelay(0);
        timer.start();
         if(points<200)
        {
            pointShow.setForeground(new Color(255, 255, 204));
        }
        else if(points>=200 && points <500)
        {
             pointShow.setForeground(new Color(255, 102, 255));
        }
        else if(points >=500 && points <800)
        {
              pointShow.setForeground(new Color(255, 255, 0));
        }
        else 
        {
             pointShow.setForeground(new Color(255, 128, 0));
        }


        pn.add(btn1);
        pn.add(btn2);
        pn.add(lb);
     
        frm.add(pn);
        frm.setVisible(true);

        btn1.addActionListener((e) -> {

          frm.remove(pn);
            try {
                new stringSelect(name, points,frm);
            } catch (InterruptedException ex) {
              ex.printStackTrace();
            }

        });
         btn2.addActionListener((e) -> {
             frm.remove(pn);
           new exit(name,points,frm);

        });
        
       
    }
    
}
