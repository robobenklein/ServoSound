
package org.usfirst.frc.team3966.robot.subsystems;

import org.usfirst.frc.team3966.robot.RobotMap;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Servos extends Subsystem {
  
  private static RobotMap robotMap = new RobotMap();
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // Speaker
  private PWM speaker = new PWM(robotMap.speakerpin);
  private Servo speaker2 = new Servo(robotMap.servoPin);
  
  public void speak(double pitch) {
    speaker.setPosition(pitch);
    speaker2.set(pitch);
  }
  
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new MySpecialCommand());
  }
}

