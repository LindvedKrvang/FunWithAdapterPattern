/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithadapterpattern.bll;

import funwithadapterpattern.be.OldLegacyRobot;
import funwithadapterpattern.be.Robot;

/**
 *
 * @author Rasmus
 */
public class RobotAdapter implements Robot {

    private final OldLegacyRobot mOldRobot;

    public RobotAdapter(OldLegacyRobot oldRobot, int speed) {
        mOldRobot = oldRobot;
        mOldRobot.speed = speed;
    }

    @Override
    public void move(int x0, int y0, int x1, int y1) {
        int direction = 0;
        if (y0 == y1) {
            mOldRobot.direction = x0 < x1 ? 3 : 1;
        } else {
            mOldRobot.direction = y0 < y1 ? 2 : 4;
        }
        mOldRobot.move(mOldRobot.speed);
    }

    @Override
    public void talk(String thingsToSay, int voiceType) {
        String voice;
        if (voiceType == 1) {
            voice = "As Adam: ";
        } else {
            voice = "As Rasmus: ";
        }
        mOldRobot.speakBuffer = (voice + thingsToSay).toCharArray();
    }

}
