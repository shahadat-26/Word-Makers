/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class correctionTest {
    correctionTest(JFrame frm)
    {
        String name=gameFrame.name,  response=gameFrame.response ,res =gameFrame.res;
                int points=gameFrame.points;
         if (response.compareTo(res) == 0) {
          
            points = points + res.length() * 5;
            new accepted(name, points, frm);
        } 
         else if (response.compareTo(res) != 0) {
            
            points = points - res.length() * 2;
            new wrongAnswer(name, points, res,frm);
        }
    }
    
}
