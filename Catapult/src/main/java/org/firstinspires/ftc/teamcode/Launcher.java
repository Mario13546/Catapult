package org.firstinspires.ftc.teamcode;

public class Grabber {
    /* Class Variables */
    private double prevEncoder = 0;
    private double targetEncoder = 0;
    
    /* Constants */
    private final double TOLERANCE = 15;
    private final double ticksPerRot = 0; // This value is currently unknown
    private final double ticksPerQuarterRot = ticksPerRot / 4;

    //Object Creation
    HardwareRobot robot;

    /**
     * Constructor
     */
    public Grabber() {
        // Instance Creation
        robot = HardwareRobot.getInstance();
    }
    
    /**
     * The main method to shoot
     */
    public void shoot(boolean fire) {
        double currEncoder = robot.launcherPosition();
        
        if ((fire == true) && ((currEncoder <= targetEncoder + TOLERANCE) && (currEncoder >= targetEncoder - TOLERANCE))) { // The signs are still unknown
            prevEncoder = robot.launcherPosition();
        }
        
        targetEncoder = prevEncoder + ticksPerQuarterRot; // The sign before ticksPerQuarterRot is still unknown
        
        if (currEncoder < targetEncoder) { // The sign is unknown
            // The motor has not passed the target encoder
            robot.launcher.set(0.15);
        }
        else {
            // The motor has passed the target encoder
            robot.launcher.set(0.0);
        }
    }
}

//End of the Launcher class
