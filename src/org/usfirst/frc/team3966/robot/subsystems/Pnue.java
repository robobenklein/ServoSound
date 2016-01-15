
package org.usfirst.frc.team3966.robot.subsystems;

import org.usfirst.frc.team3966.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pnue extends Subsystem {
  
  private static RobotMap robotMap = new RobotMap();
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // Z Motor
  private DoubleSolenoid bigpiston = new DoubleSolenoid(robotMap.pn_li, robotMap.pn_lo);
  
  public void bigOut() {
    bigpiston.set(DoubleSolenoid.Value.kForward);
  }
  public void bigIn() {
    bigpiston.set(DoubleSolenoid.Value.kReverse);
  }
  
  private DoubleSolenoid smallpiston = new DoubleSolenoid(robotMap.pn_si, robotMap.pn_so);
  
  public void smallOut() {
    smallpiston.set(DoubleSolenoid.Value.kForward);
  }
  public void smallIn() {
    smallpiston.set(DoubleSolenoid.Value.kReverse);
  }
  
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new MySpecialCommand());
  }
}

