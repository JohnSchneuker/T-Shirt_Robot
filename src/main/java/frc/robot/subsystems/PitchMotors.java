// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants.PitchMotorConstants;

public class PitchMotors extends SubsystemBase {

  private final TalonSRX LEFT_PMOTOR = new TalonSRX(PitchMotorConstants.LEFT_PMOTOR_PORT);
  private final TalonSRX RIGHT_PMOTOR = new TalonSRX(PitchMotorConstants.RIGHT_PMOTOR_PORT);

  /* encoders */
  private final Encoder RIGHT_PENCODER = new Encoder(PitchMotorConstants.LEFT_PENCODER_PORT_A,PitchMotorConstants.LEFT_PENCODER_PORT_B,PitchMotorConstants.LEFT_PENCODER_REVERSE);
  private final Encoder LEFT_PENCODER  = new Encoder(PitchMotorConstants.RIGHT_PENCODER_PORT_A,PitchMotorConstants.RIGHT_PENCODER_PORT_B,PitchMotorConstants.RIGHT_PENCODER_REVERSE);

  /* Motor Angles */
  double langle;
  double rangle;
  
  /** Creates a new PitchMotors. */
  public PitchMotors() {}

  public void setPitchMotors(double speed){
    LEFT_PMOTOR.set(ControlMode.PercentOutput, speed);
    RIGHT_PMOTOR.set(ControlMode.PercentOutput, -speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
