
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
  Servo Servo0x = new Servo(0);
  Servo Servo1x = new Servo(1);
  Servo Servo2x = new Servo(2);
  Servo Servo3x = new Servo(3);
  Servo Servo4x = new Servo(4);
  Servo Servo5x = new Servo(5);
  Servo Servo6x = new Servo(6);
  Servo Servo7x = new Servo(7);
  Servo Servo8x = new Servo(8);
  Servo Servo9x = new Servo(9);
  
  public void go(double pitch) {
    Servo0x.set(pitch);
    Servo1x.set(pitch);
    Servo2x.set(pitch);
    Servo3x.set(pitch);
    Servo4x.set(pitch);
    Servo5x.set(pitch);
    Servo6x.set(pitch);
    Servo7x.set(pitch);
    Servo8x.set(pitch);
    Servo9x.set(pitch);
  }
  
  public void setOdd(double pitch) {
    Servo1x.set(pitch);
    Servo3x.set(pitch);
    Servo5x.set(pitch);
    Servo7x.set(pitch);
    Servo9x.set(pitch);
  }
  
  public void setEven(double pitch) {
    Servo0x.set(pitch);
    Servo2x.set(pitch);
    Servo4x.set(pitch);
    Servo6x.set(pitch);
    Servo8x.set(pitch);
  }
  
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new MySpecialCommand());
  }
}
