package org.firstinspires.ftc.teamcode;

public class Grabber {
    /* Class Variables */
    //Nothing yet...

    //Object Creation
    HardwareRobot robot;

    /**
     * Constructor
     */
    public Grabber() {
        //Instance Creation
        robot = HardwareRobot.getInstance();
    }
    
    /**
     * 
     */
    public void shoot(boolean fire) {
        if () {
            //
        }
        if (fire == true) {
            robot.launcher.setEncoder();
        }
    }
}

//End of the Manipulator class
