
package org.usfirst.frc.team3966.robot.subsystems;

//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3966.robot.commands.TankDrive;
import org.usfirst.frc.team3966.robot.Robot;
import org.usfirst.frc.team3966.robot.RobotMap;
import org.usfirst.frc.team3966.robot.subsystems.DriveMotor;

//import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * Drive subsystem, controls left and right motors.
 *
 * Supplies methods for controlling the drive by various functions.
 * The motors objects should not be directly set from any other place.
 */
public class Drive extends Subsystem {

  private static RobotMap robotMap = new RobotMap();

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static SpeedController leftmotor = new DriveMotor(robotMap.leftmotorpin);
  public static SpeedController rightmotor = new DriveMotor(robotMap.rightmotorpin);

  //RobotDrive robotdrive = RobotMap.robotdrive;

  public void doNothing() {
    rightmotor.set(0);
    leftmotor.set(0);
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }

  public void TankDrive(double rightmotorspeed, double leftmotorspeed) {
    rightmotor.set(rightmotorspeed);
    leftmotor.set(-leftmotorspeed);
  }

  
}
