/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import static word.makers.gameFrame.count;

/**
 *
 * @author Asus
 */
public class Home {
    int kint;
    Home() throws InterruptedException
    {
        JFrame frm = new JFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(1900, 1000);
        JPanel pn = new JPanel();
        pn.setLayout(null);
        JLabel W= new JLabel("W");
        
        JLabel o= new JLabel("o");
         JLabel r1= new JLabel("r");
        JLabel r= new JLabel("r");
        JLabel d= new JLabel("d");
        JLabel M= new JLabel("M");
        JLabel a= new JLabel("a");
        JLabel k= new JLabel("k");
        JLabel e= new JLabel("e");
        JLabel s= new JLabel("s");
        
        
        
        W.setForeground(new Color(0, 102, 204));
        o.setForeground(Color.ORANGE);
        r1.setForeground(Color.YELLOW);
        r.setForeground(new Color(224,224,224));
        d.setForeground(Color.MAGENTA);
        M.setForeground(Color.PINK);
        a.setForeground(Color.green);
        k.setForeground(new Color(178, 102, 255));
        e.setForeground(Color.YELLOW);
        s.setForeground(Color.CYAN);
        pn.setBackground(new Color(0,0,51));
        
      
        
        
        W.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        o.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        r1.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        r.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        d.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        M.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        a.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        k.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        e.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        s.setFont(new Font(Font.SERIF, Font.ITALIC, 150));
        
        
        W.setBounds(600,200,150,200);
        o.setBounds(700,200,150,200);
        r1.setBounds(770,200,150,200);
        d.setBounds(820,200,150,200);
        M.setBounds(900,300,150,200);
        a.setBounds(1020,300,150,200);
        k.setBounds(1090,300,150,200);
        e.setBounds(1160,300,150,200);
        r.setBounds(1230,300,150,200);
        s.setBounds(1285,300,150,200);
        
       
        pn.add(W);
        pn.add(o);
        pn.add(r1);
        pn.add(d);
        
        pn.add(M);
        pn.add(a);
        pn.add(k);
        pn.add(e);
        pn.add(r);
        pn.add(s);
        frm.add(pn);
        frm.setVisible(true);
        kint=3;
       Timer timer;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 kint--;
                if (kint== 0) {
                    
                    frm.remove(pn);
                    new playerName(frm);
                  } 
            }
        });
        timer.setInitialDelay(0);
       
        timer.start();
       
    }
}
