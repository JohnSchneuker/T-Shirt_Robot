// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Pitch_Commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.PitchMotors;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class TurnShooterToAngle extends PIDCommand {
  /** Creates a new TurnShooterToAngle. */
  public TurnShooterToAngle(Double targetAngleDegrees, PitchMotors motors) {
    super(
        // The controller that the command will use
        new PIDController(0.02, 0.02, 0),
        // This should return the measurement
        motors::getLeftAngle,
        // This should return the setpoint (can also be a constant)
        targetAngleDegrees,
        // This uses the output
        output -> {
          // Use the output here
          motors.setPitchMotors(output);
        },
        //require the drive
        motors);
    // Use addRequirements() here to declare subsystem dependencies.
    // Configure additional PID options by calling `getController` here.

    // Set the controller to be continuous (because it is an angle controller)
    getController().enableContinuousInput(0, 90);

    // Set the controller tolerance - the delta tolerance ensures the robot is stationary at the
    // setpoint before it is considered as having reached the reference
    getController().setTolerance(5, 10);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
