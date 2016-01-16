package org.usfirst.frc.team3966.robot;

import java.util.HashMap;

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
  
  // Pnuematics Pistons [l]arge and [s]mall, [i]n and [o]ut.
  public final int pn_lo = 3;
  public final int pn_li = 2;
  public final int pn_so = 1;
  public final int pn_si = 0;
  
  // CANTalon Motors
  public final int talonZ = 8;
  public final int talonY = 9;
  
  public final int rstick = 0;
  public final int lstick = 1;
  public final int fstick = 2;
  public final int cstick = 0;
  
  // Servos
  // ALL
  
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
