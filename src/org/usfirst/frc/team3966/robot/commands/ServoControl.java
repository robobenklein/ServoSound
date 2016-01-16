
package org.usfirst.frc.team3966.robot.commands;

import org.usfirst.frc.team3966.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ServoControl extends Command {

    public ServoControl() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.servos);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
      Robot.servos.setOdd(Math.abs(Robot.oi.controller.getRawAxis(3) + 1.0) / 2.0);
      Robot.servos.setEven(Math.abs(Robot.oi.controller.getRawAxis(4) + 1.0) / 2.0);
      //Robot.servos.setAll(0);
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
