
package org.usfirst.frc.team3966.robot.commands;

import org.usfirst.frc.team3966.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MotorControl extends Command {

    public MotorControl() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.motors);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
      Robot.motors.setYmotor(Robot.oi.controller.getRawAxis(5));
      Robot.motors.setZmotor(Robot.oi.controller.getRawAxis(1));
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
