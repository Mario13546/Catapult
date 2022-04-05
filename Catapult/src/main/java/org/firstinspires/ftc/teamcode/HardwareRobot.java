package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

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
    public DcMotor leftDrive;
    public DcMotor rightDrive;
    public DcMotor launcher;

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
        leftDrive  = hwMap.get(DcMotor.class, "left_drive");
        rightDrive = hwMap.get(DcMotor.class, "right_drive");

        // Initialize the Luncher motor
        launcher   = hwMap.get(DcMotor.class, "launcher");

        // Set the motor directions
        leftDrive.setDirection (DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);
        launcher.setDirection  (DcMotor.Direction.FORWARD);

        // Make the drive motors run without encoders
        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        
        // Make the launcher motor run with encoders
        launcher.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        // Set all motors to zero power
        leftDrive.setPower(0.00);
        rightDrive.setPower(0.00);
        launcher.setPower(0.00);
    }
    
    /**
     * Returns the encoder value from the launcher motor
     */
    public double launcherPosition() {
        return launcher.getCurrentPosition();
    }

//End of the HardwareRobot class
