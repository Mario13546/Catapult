package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="Driver Controlled", group="Iterative Opmode")
public class DriverControlled extends OpMode {
    /* Class variables */
    //Nothing yet...

    /* Instance Creation */
    HardwareRobot robot       = HardwareRobot.getInstance();
    ElapsedTime   runtime     = new ElapsedTime();   // Starts counting the time
    Controls      controls    = new Controls(this);  // A class for the controling functions
    Launcher      launcher    = new Launcher();      // A class for the launcher related functions
    Drive         drive       = new Drive();         // A class for drive functions

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        /* Initialize the hardware variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Tell the driver that initialization is complete.
        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
        //
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
        runtime.reset();
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        // Wheel control
        wheelControl();

        // Catpult control
        launcherControl();

        //Displays runtime
        telemetry.addData("Status", "Run Time: " + runtime.toString());
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
        //This should never do anything
    }

    /**
     * A method to control the tank treads
     */
    private void wheelControl() {
        // Gamepad 1 inputs
        double leftStickY  = controls.leftDrivePower();
        double rightStickY = controls.rightDrivePower();

        //Tank Drive Method
        drive.tankDrive(leftStickY, rightStickY);
    }

    /**
     * A method to control the grabber and related functions
     */
    private void launcherControl() {
        //Gamepad 2 functions
        boolean fire = controls.launchBall();

    	//Makes the launcher fire!
    	launcher.shoot(fire);
    }

}

// End of the DriverControlled class
