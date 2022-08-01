// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Drive_Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.Joystick;


public class TeleopDrive extends CommandBase {

  private DriveTrain m_DriveTrain;
  private RobotContainer m_RobotContainer;
  private Joystick m_stick;

  /** Creates a new TeleopDrive. */
  public TeleopDrive(DriveTrain subsytem, RobotContainer robotContainer) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_RobotContainer = robotContainer;
    m_DriveTrain = subsytem;
    addRequirements(subsytem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_stick = new Joystick(0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double forward = -1 * m_stick.getY();
    double turn = m_stick.getX();
    m_DriveTrain.arcadeDrive(forward, turn);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
