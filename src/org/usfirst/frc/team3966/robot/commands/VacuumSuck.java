
package org.usfirst.frc.team3966.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3966.robot.Robot;
import org.usfirst.frc.team3966.robot.RobotMap;
//import org.usfirst.frc.team3966.robot.subsystems.Vacuum;

/**
 *
 */
public class VacuumSuck extends Command {

    public VacuumSuck() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.vacuum);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
      System.out.println("I am a Vacuum. I suck for you.");
      Robot.vacuum.doNothing();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
      //Robot.vacuum.VacuumOn(1.0);
      if (Robot.oi.VacuumButton.get()) {
        if (RobotMap.vacuumUseAxis) {
          Robot.vacuum.VacuumOn(Robot.oi.controller.getRawAxis(RobotMap.vacuumOnAxis) + 1.0);
        } else {
          Robot.vacuum.VacuumOn(1.0);
        }
      } else {
        Robot.vacuum.doNothing();
      }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
      Robot.vacuum.doNothing();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
      Robot.vacuum.doNothing();
    }
}
