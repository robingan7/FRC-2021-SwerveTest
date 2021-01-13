package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class DefaultDrive extends CommandBase
{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    Joystick stick;
    private DriveSubsystem drivetrain;

    public DefaultDrive(DriveSubsystem drivetrain)
    {
        this.stick = new Joystick(0);
        this.drivetrain = drivetrain;
        addRequirements(this.drivetrain);
        SmartDashboard.putString("Requirements", getRequirements().toString());
        SmartDashboard.updateValues();
        
    }

    @Override
    public void execute()
    {
        //drivetrain.drive(stick.getRawAxis(1), stick.getRawAxis(4), stick.getRawAxis(2), false);
    }

    @Override
    public boolean isFinished()
    {
        return false;
    }
}