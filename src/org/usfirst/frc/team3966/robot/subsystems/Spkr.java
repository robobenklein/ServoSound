
package org.usfirst.frc.team3966.robot.subsystems;

import org.usfirst.frc.team3966.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PWM;

/**
 *
 */
public class Spkr extends Subsystem {
  
  private static RobotMap robotMap = new RobotMap();
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // Z Motor
  private PWM speaker = new PWM(robotMap.speakerpin);
  
  public void speak(double pitch) {
    speaker.setPosition(pitch);
  }
  
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new MySpecialCommand());
  }
}

