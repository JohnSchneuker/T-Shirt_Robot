// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Pitch_Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PitchMotors;

public class ShooterUp extends CommandBase {
  private final PitchMotors m_PitchMotors;

  /** Creates a new ShooterUp. */
  public ShooterUp(PitchMotors PitchMotor) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_PitchMotors = PitchMotor;
    addRequirements(m_PitchMotors);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_PitchMotors.setPitchMotors(0.5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_PitchMotors.setPitchMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
