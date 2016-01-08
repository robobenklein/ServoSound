package org.usfirst.frc.team3966.robot.commands;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.usfirst.frc.team3966.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.hal.PDPJNI;

public class sendData extends Command{

	
	public sendData()
	{
		
	}

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putString("", "SmartDashboard: Feedback Output");
    	ByteBuffer status = ByteBuffer.allocateDirect(4);
    	status.order(ByteOrder.LITTLE_ENDIAN);
    	SmartDashboard.putNumber("Motor Current", PDPJNI.getPDPTotalCurrent(status.asIntBuffer()));
    	SmartDashboard.putNumber("Left Motor Speed", Drive.leftmotor.get());
    	SmartDashboard.putNumber("Right Motor Speed", Drive.rightmotor.get());
    
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
