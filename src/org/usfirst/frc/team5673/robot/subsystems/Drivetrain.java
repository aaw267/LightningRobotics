package org.usfirst.frc.team5673.robot.subsystems;

import org.usfirst.frc.team5673.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	RobotDrive drivetrain;
	public Drivetrain(){
		drivetrain = new RobotDrive(RobotMap.leftMotor, RobotMap.rightMotor);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {};
    public void acceptControl(){
    	
    }
}

