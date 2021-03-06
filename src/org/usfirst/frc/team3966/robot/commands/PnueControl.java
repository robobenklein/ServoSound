
package org.usfirst.frc.team3966.robot.commands;

import org.usfirst.frc.team3966.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PnueControl extends Command {

    public PnueControl() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.pnue);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
      if ( Robot.oi.controller.getRawButton(1)) {
        Robot.pnue.bigIn();
      } else if ( Robot.oi.controller.getRawButton(2)) {
        Robot.pnue.bigOut();
      }
      
      if ( Robot.oi.controller.getRawButton(3)) {
        Robot.pnue.smallIn();
      } else if ( Robot.oi.controller.getRawButton(4)) {
        Robot.pnue.smallOut();
      }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
