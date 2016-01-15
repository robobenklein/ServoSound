
package org.usfirst.frc.team3966.robot.subsystems;

import org.usfirst.frc.team3966.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Servos extends Subsystem {
  
  private static RobotMap robotMap = new RobotMap();
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // PWM Devices
  private Servo savoxServo = new Servo(robotMap.servoPin);
  
  public void set(double pitch) {
    savoxServo.set(pitch);
  }
  
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new MySpecialCommand());
  }
}

