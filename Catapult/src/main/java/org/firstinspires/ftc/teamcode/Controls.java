package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class Controls {
    /* Class Variables */
    double driveSpeedMultiplier  = 1.00;
    
    //Object Creation
    private OpMode logitech;

    /**
     * Constructor
     */
    //Incomplete. Add the OpMode parameter
    public Controls(OpMode opMode) {
        //Passes an OpMode into the class (allows for the use of controllers)
        logitech = opMode;
    }

    /**
     * Gamepad 1
     */
    public double leftDrivePower() {
        double power = logitech.gamepad1.left_stick_y;
        double drivePower = power * driveSpeedMultiplier;

        return drivePower;
    }

    public double rightDrivePower() {
        double power = logitech.gamepad1.right_stick_y;
        double turnPower = power * driveSpeedMultiplier;

        return turnPower;
    }

    /**
     * Gamepad 2
     */
    public boolean launchBall() {
        return logitech.gamepad1.a;
    }
    
}

//End of the Controls class
