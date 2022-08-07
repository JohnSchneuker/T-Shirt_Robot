// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.OIConstants;
import frc.robot.Constants.PneumaticsConstants;
import frc.robot.commands.Pitch_Commands.*;
import frc.robot.commands.Pneumatics_Commands.*;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.PitchMotors;
import frc.robot.subsystems.Pneumatics;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */

public class RobotContainer {
    // The robot's subsystems and commands are defined here...
    /* Subsystems */
    private PitchMotors _Rollers = new PitchMotors();
    private Pneumatics _Pneumatics = new Pneumatics();
    /* commands */

    /* joysticks */
    public Joystick driver = new Joystick(Constants.OIConstants.DRIVER);
    public GenericHID operator = new Joystick(Constants.OIConstants.OPERATOR);

    private DriveTrain m_DriveTrain;

    // A chooser for autonomous commands
    /** The container for the robot. Contains subsystems, OI devices, and commands. */

    public RobotContainer() {
        // Configure the button bindings
        configureButtonBindings();
        }

    private void configureButtonBindings(){

        // Shooter Buttons
        new JoystickButton(operator, OIConstants.TR_BUTTON).whenHeld(new ShootTR(_Pneumatics));

        new JoystickButton(operator, OIConstants.TL_BUTTON).whenHeld(new ShootTL(_Pneumatics));
        
        new JoystickButton(operator, OIConstants.BR_BUTTON).whenHeld(new ShootBR(_Pneumatics));

        new JoystickButton(operator, OIConstants.BL_BUTTON).whenHeld(new ShootBL(_Pneumatics));

        new JoystickButton(operator, OIConstants.TRi_BUTTON).whenHeld(new FillTRi(_Pneumatics));

        new JoystickButton(operator, OIConstants.TLi_BUTTON).whenHeld(new FillTLi(_Pneumatics));

        new JoystickButton(operator, OIConstants.BRi_BUTTON).whenHeld(new FillBRi(_Pneumatics));

        new JoystickButton(operator, OIConstants.BLi_BUTTON).whenHeld(new FillBLi(_Pneumatics));

        // Aim Buttons
        new JoystickButton(operator, OIConstants.UP_BUTTON).whenHeld(new ShooterUp(_Rollers));

        new JoystickButton(operator, OIConstants.DOWN_BUTTON).whenHeld(new ShooterDown(_Rollers));
    }
}
