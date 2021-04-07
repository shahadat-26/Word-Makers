/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.makers;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import oracle.jrockit.jfr.JFR;

/**
 *
 * @author Asus
 */
public class stringSelect {

    String r[] = new String[51];
    String g[] = new String[51];
    int rand;
    String name;
    int points;
    int i, j;

    stringSelect(String name, int points, JFrame frm) throws InterruptedException {
        i = 0;
        j = 0;
        this.name = name;
        this.points = points;

        boolean given[];
        given = new boolean[51];
        int rand;
        while (true) {
            Random random = new Random();
            rand = 0 + random.nextInt(50 - 0 + 1);
            if (check.given[rand] == true) {
                continue;
            } else {
                check.given[rand] = true;
                break;
            }
        }
        
        r[i++] = "point";
        g[j++] = "iotnp";
        r[i++] = "game";
        g[j++] = "mgea";
        r[i++] = "life";
        g[j++] = "elif";
        r[i++] = "number";
        g[j++] = "mbnure";
        r[i++] = "infinity";
        g[j++] = "fniytnii";
        r[i++] = "pain";
        g[j++] = "ipna";
        r[i++] = "nation";
        g[j++] = "itnona";
        r[i++] = "string";
        g[j++] = "grtsni";
        r[i++] = "information";
        g[j++] = "fromanitnoi";
        r[i++] = "drop";
        g[j++] = "oprd";
        r[i++] = "great";
        g[j++] = "rgate";
        r[i++]="education";
        g[j++]="niotacdue";
        r[i++]="relax";
        g[j++]="exalr";
         r[i++]="rest";
        g[j++]="tsre";
        r[i++]="tired";
        g[j++]="rdeit";
        r[i++]="patience";
        g[j++]="teniapce";
        r[i++]="freedom";
        g[j++]="efermdo";
        r[i++]="song";
        g[j++]="gnso";
        r[i++]="music";
        g[j++]="suicm";
        r[i++]="crazy";
        g[j++]="rzacy";
         r[i++]="fool";
        g[j++]="lofo";
        r[i++]="understand";
        g[j++]="stnuedradn";
        r[i++]="realise";
        g[j++]="lsierea";
         r[i++]="exclusive";
        g[j++]="xculevise";
        r[i++]="inclusive";
        g[j++]="nculivise";
        r[i++]="exclude";
        g[j++]="xculede";
        r[i++]="include";
        g[j++]="nculide";
         r[i++]="rough";
        g[j++]="orugh";
        r[i++]="tough";
        g[j++]="outgh";
        r[i++]="hard";
        g[j++]="adrh";
        r[i++]="difficult";
        g[j++]="fdiflcut";
        r[i++]="project";
        g[j++]="cjterop";
        r[i++]="signature";
        g[j++]="gisnaurte";
        r[i++]="debate";
        g[j++]="abtede";
        r[i++]="discussion";
        g[j++]="sdiucsisno";
        r[i++]="hit";
        g[j++]="ith";
        r[i++]="heat";
        g[j++]="eath";
        r[i++]="temperature";
        g[j++]="emtpreauret";
         r[i++]="interest";
        g[j++]="ntreiste";
        r[i++]="tolerance";
        g[j++]="eracneolt";
        r[i++]="intolerance";
        g[j++]="ieracneoltn";
        r[i++]="habit";
        g[j++]="bihat";
        r[i++]="person";
        g[j++]="eprsno";
         r[i++]="human";
        g[j++]="unamh";
        r[i++]="welfare";
        g[j++]="reafwel";
         r[i++]="courtesy";
        g[j++]="oucrseyot";
         r[i++]="man";
        g[j++]="nam";
         r[i++]="pen";
        g[j++]="npe";
        r[i++]="work";
        g[j++]="rokw";
         r[i++]="task";
        g[j++]="satk";
         r[i++]="desperate";
        g[j++]="esdeparet";
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
//                r[i++]=
//        g[j++]=
        new gameFrame(name, points, r[rand], g[rand], frm);

    }
}
