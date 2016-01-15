
package org.usfirst.frc.team3966.robot;

import org.usfirst.frc.team3966.robot.commands.MotorControl;
import org.usfirst.frc.team3966.robot.commands.PnueControl;
import org.usfirst.frc.team3966.robot.commands.ServoControl;
import org.usfirst.frc.team3966.robot.subsystems.CANTalons;
import org.usfirst.frc.team3966.robot.subsystems.Pnue;
import org.usfirst.frc.team3966.robot.subsystems.Servos;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final CANTalons motors = new CANTalons();
	public static final Pnue pnue = new Pnue();
	public static final Servos speaker = new Servos();
	public static OI oi;

    Command teleopCommand;
    Command pnueCommand;
    Command speakCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
        teleopCommand = new MotorControl();
        pnueCommand = new PnueControl();
        speakCommand = new ServoControl();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        //if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        //if (autonomousCommand != null) autonomousCommand.cancel();
      if (teleopCommand != null) teleopCommand.start();
      if (pnueCommand != null) pnueCommand.start();
      if (speakCommand != null) speakCommand.start();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
