package org.firstinspires.ftc.teamcode;

//import the OpMode library
//import the TeleOp library
//import the ElapsedTime library

//FIll in the "" with the name you would like
@TeleOp(name="", group="Iterative Opmode")
public class DriverControlled extends OpMode {
    /* Class variables */
    //Nothing yet...

    /* Instance Creation */
    //Create instances of all other classes in the directory (HardwareRobot needs to created differently)
    ElapsedTime   runtime     = new ElapsedTime();   // Starts counting the time

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
        //Get the inputs from controls

        //Tank Drive Method
        //Call the drive function from drive
    }

    /**
     * A method to control the grabber and related functions
     */
    private void launcherControl() {
        //Gamepad 2 functions
        //Get the inputs from controls

    	//Makes the launcher fire!
    	//Call the lanuch function from launcher
    }

}

// End of the DriverControlled class
