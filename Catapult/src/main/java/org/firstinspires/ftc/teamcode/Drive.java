package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.Range;

public class Drive {
    //Object Creation
    HardwareRobot robot;

    /* Class Variables */
    //Nothing yet...

    /**
     * Constructor
     */
    public Drive() {
        //Instance Creation
        robot = HardwareRobot.getInstance();
    }
    
    /**
     * Tank Drive movement code
     */
    public void tankDrive(double leftDrive, double rightDrive) {
        //Calculate the powers
        double leftPower  = leftDrive;
        double rightPower = rightDrive;

        //Clamps the powers
        leftPower  = Range.clip(leftPower, -1.0, 1.0);
        rightPower = Range.clip(rightPower, -1.0, 1.0);

        //Sets motor power
        robot.leftDrive.setPower (leftPower );
        robot.rightDrive.setPower(rightPower);
    }

}

//End of the Drive class
