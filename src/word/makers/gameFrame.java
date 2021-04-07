/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

/**
 *
 * @author Asus
 */
public class gameFrame {

    static String response, name, res;
    static int points, count, locked;

    gameFrame(String name, int points, String res, String giv, JFrame frm) throws InterruptedException {
        this.name = name;
        this.points = points;
        this.res = res;

        locked = 0;
        int givenTime;
        if (res.length() == 3) {
            givenTime = 8;
        } else if (res.length() == 4) {
            givenTime = 15;
        } else if (res.length() == 5 || res.length() == 6) {
            givenTime = 30;
        } else if (res.length() == 7 || res.length() == 8) {
            givenTime = 60;
        } else if (res.length() == 9 || res.length() == 10) {
            givenTime = 90;
        } else {
            givenTime = 120;
        }

        frm.setTitle("Word Makers");

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pn = new JPanel();
        pn.setBackground(new Color(0, 0, 51));
        pn.setLayout(null);

        JTextField tf = new JTextField(20);
        tf.setFont(new Font(Font.SERIF, Font.PLAIN, 50));
        tf.setBounds(650, 400, 500, 80);
        tf.setText("  ");

        JLabel lb = new JLabel();
        lb.setText("The Shuffled Letters Are  " + giv.toUpperCase());
        lb.setFont(new Font(Font.SERIF, Font.PLAIN, 50));
        lb.setForeground(new Color(255, 255, 204));
        lb.setBounds(600, 20, 1300, 100);

//        JLabel Enter = new JLabel("So The Word Is : ");
//        Enter.setForeground(new Color(255, 255, 204));
//        Enter.setFont(new Font(Font.SERIF, Font.PLAIN, 50));

        JButton btn = new JButton("Lock");
        btn.setFont(new Font(Font.SERIF, Font.PLAIN, 50));
        btn.setBounds(1220, 400, 200, 80);
        btn.setBackground(Color.lightGray);
        btn.setForeground(Color.BLACK);
       
        
        JLabel pointShow = new JLabel(""+name+"  "+points);
        pointShow.setFont(new Font("Courier New Bold", Font.ITALIC, 50));
        pointShow.setBounds(1300, 700, 600, 80);
        pn.add(pointShow);
        
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

        
        pn.add(lb);
//        pn.add(Enter);
        pn.add(tf);
        pn.add(btn);
        

        count = givenTime;

        JLabel label = new JLabel();
        label.setFont(new Font(Font.SERIF, Font.PLAIN, 200));
        label.setBounds(700, 120, 800, 200);
        label.setForeground(new Color(255, 255, 255));
        pn.add(label);
        Timer timer;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                if (count > 0) {
                    int min = count / 60;
                    int sec = count % 60;
                    int zero = -1;
                    if (sec < 10) {

                        label.setText("0" + min + ":" + "0" + sec);

                    } else {

                        label.setText("0" + min + ":" + sec);

                    }
                } else if (count == 0) {
                    
                    frm.remove(pn);
                    new timeUp(name, points - res.length(), res, frm);
                } else {
                    ((Timer) (e.getSource())).stop();

                }
            }
        });
        timer.setInitialDelay(0);
       
        timer.start();
        
        frm.add(pn);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                response = tf.getText().trim();
             
                tf.setText("Locked");
                count = -1;
                
                frm.remove(pn);
                new correctionTest(frm);

            }
        });
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                response = tf.getText().trim().toLowerCase();
            
                tf.setText("Locked");
                count = -1;
               
                frm.remove(pn);
                new correctionTest(frm);

            }
        });

    }

}
