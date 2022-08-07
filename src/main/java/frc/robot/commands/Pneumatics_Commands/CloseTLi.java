// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Pneumatics_Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Pneumatics;

public class CloseTLi extends CommandBase {
  private final Pneumatics m_Pneumatics;

  /** Creates a new CloseTLi. */
  public CloseTLi(Pneumatics pneumatics) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_Pneumatics = pneumatics;
    addRequirements(m_Pneumatics);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  m_Pneumatics.turnOffTLi();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  m_Pneumatics.turnOffTLi();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
