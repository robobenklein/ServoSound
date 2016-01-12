
package org.usfirst.frc.team3966.robot.subsystems;

import org.usfirst.frc.team3966.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;

/**
 *
 */
public class CANTalons extends Subsystem {
  
  private static RobotMap robotMap = new RobotMap();
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // Z Motor
  private CANTalon Zmotor = new CANTalon(robotMap.talonZ);
  
  public void setZmotor(double speed) {
    Zmotor.set(speed);
  }
  
  private CANTalon Ymotor = new CANTalon(robotMap.talonY);
  
  public void setYmotor(double speed) {
    Ymotor.set(speed);
  }
  
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new MySpecialCommand());
  }
}

