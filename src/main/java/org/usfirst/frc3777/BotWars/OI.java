// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3777.BotWars;

import org.usfirst.frc3777.BotWars.Commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick joystickLeft;
    public Joystick joystickRight;
    public JoystickButton button1;
    public JoystickButton button3;
    public JoystickButton button2;
    public JoystickButton button4;
    public JoystickButton button5;
    public JoystickButton button6;
    public JoystickButton button7;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystickRight = new Joystick(1);
        joystickLeft = new Joystick(0);
        
        button1 = new JoystickButton(joystickRight, 1);
        button1.whenPressed(new cmdHold());
        button1.whenReleased(new cmdReceive());
        button1 = new JoystickButton(joystickLeft, 1);
        button1.whenPressed(new cmdHold());
        button1.whenReleased(new cmdReceive());

        button3 = new JoystickButton(joystickRight, 3);
        button3.whileHeld(new cmdUp());
        button3.whenReleased(new cmdPistonHold());
        button3 = new JoystickButton(joystickLeft, 3);
        button3.whileHeld(new cmdUp());
        button3.whenReleased(new cmdPistonHold());

        button2 = new JoystickButton(joystickRight, 2);
        button2.whileHeld(new cmdDown());
        button2.whenReleased(new cmdPistonHold());
        button2 = new JoystickButton(joystickLeft, 2);
        button2.whileHeld(new cmdDown());
        button2.whenReleased(new cmdPistonHold());

        button4 = new JoystickButton(joystickRight, 4);
        button4.whileHeld(new cmdSpinCCW());
        button4.whenReleased(new cmdSpinStop());
        button4 = new JoystickButton(joystickLeft, 4);
        button4.whileHeld(new cmdSpinCCW());
        button4.whenReleased(new cmdSpinStop());

        button5 = new JoystickButton(joystickRight, 5);
        button5.whileHeld(new cmdSpinCW());
        button5.whenReleased(new cmdSpinStop());
        button5 = new JoystickButton(joystickLeft, 5);
        button5.whileHeld(new cmdSpinCW());
        button5.whenReleased(new cmdSpinStop());

        // SmartDashboard Buttons
        SmartDashboard.putData("cmdDriveTank", new cmdDriveTank());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    //-------------------------------------------------------------------------
    //The following is code for the new 'DriveDifferential' class.
    //	After RobotBuilder export, 
    //  then created these to send 'double' instead of 'Joystick', to the drive.
    public double getjoyLeftdblY() {
    	return -joystickLeft.getY();
    }
    
    public double getjoyRightdblY() {
    	return -joystickRight.getY(); 
    }

    //-------------------------------------------------------------------------
    //RobotBuilder still exports these methods for the old 'RobotDrive' class.
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    //public Joystick getJoystickLeft() {
        //return joystickLeft;
    //}

   // public Joystick getJoystickRight() {
       // return joystickRight;
    //}


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

