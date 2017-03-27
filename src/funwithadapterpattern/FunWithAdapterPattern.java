/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithadapterpattern;

import funwithadapterpattern.be.OldLegacyRobot;
import funwithadapterpattern.be.Robot;
import funwithadapterpattern.bll.RobotAdapter;

/**
 *
 * @author Rasmus
 */
public class FunWithAdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Robot oldRobot = new RobotAdapter(new OldLegacyRobot(), 4);

        oldRobot.move(1, 1, 3, 3);
        oldRobot.talk("Good news everybody", 1);

    }

}
