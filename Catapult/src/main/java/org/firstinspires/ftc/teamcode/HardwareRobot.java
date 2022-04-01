package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class HardwareRobot {
    /**
     * Singleton For HardwareRobot
     */
    private static HardwareRobot instance = null;

    public static synchronized HardwareRobot getInstance() {
        if (instance == null) {
            instance = new HardwareRobot();
        }

        return instance;
    }

    /* Object Creation */
    //DcMotors motors
    //Create public DcMotor objects

    //Other members
    HardwareMap hwMap;

    /* Class Variables */
    //Nothing Yet...
    
    // ERROR CODES
    public static final int FAIL = -1;
    public static final int PASS =  1;
    public static final int DONE =  2;
    public static final int CONT =  3;

    /**
     * Constructor
     */
    private HardwareRobot(){
        //Nothing
    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Initialize the Drive motors

        // Initialize the Luncher motor

        // Set the motor directions

        // Make the drive motors run without encoders

        // Set all motors to zero power
    }
    
    /**
     * Returns the encoder value from the launcher motor
     */
    //Create a method to return the position from the lanucher motor
}

//End of the HardwareRobot class