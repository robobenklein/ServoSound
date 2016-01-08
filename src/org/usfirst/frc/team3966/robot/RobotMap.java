package org.usfirst.frc.team3966.robot;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;

  // Joysticks
	public final int rstick = 0;
	public final int lstick = 1;
	public final int fstick = 2;
	
	public final int cstick = 0;
	
	// PWM
	public final int leftmotorpin = 0;
	public final int rightmotorpin = 1;
	
	public final int vacuumpin = 2;
	
	// Control Mapping
	// Buttons start from 1 apparently
	public final int vacuumOnButton = 7; // Idk, ask game strategy.
	public static final boolean vacuumUseAxis = true;
	public static final int vacuumOnAxis = 3; // Does not matter if above is false
	
}
