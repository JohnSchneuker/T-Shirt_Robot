// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.PneumaticsConstants;

public class Pneumatics extends SubsystemBase {
  /*Output Solonoids*/
  Solenoid TL_Solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, PneumaticsConstants.TL_SOLONOID_PORT);
  Solenoid TR_Solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, PneumaticsConstants.TR_SOLONOID_PORT);
  Solenoid BL_Solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, PneumaticsConstants.BL_SOLONOID_PORT);
  Solenoid BR_Solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, PneumaticsConstants.BR_SOLONOID_PORT);
  /*Input Solonoids*/
  Solenoid TLi_Solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, PneumaticsConstants.TLi_SOLONOID_PORT);
  Solenoid TRi_Solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, PneumaticsConstants.TRi_SOLONOID_PORT);
  Solenoid BLi_Solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, PneumaticsConstants.BLi_SOLONOID_PORT);
  Solenoid BRi_Solenoid = new Solenoid(PneumaticsModuleType.CTREPCM, PneumaticsConstants.BRi_SOLONOID_PORT);
  
  /** Creates a new Pneumatics. */
  public Pneumatics() {}

  public void turnOffAllOutSolonoids(){
  TL_Solenoid.set(false);
  TR_Solenoid.set(false);
  BL_Solenoid.set(false);
  BR_Solenoid.set(false);
  }

  public void turnOnAllOutSolonoids(){
  TL_Solenoid.set(true);
  TR_Solenoid.set(true);
  BL_Solenoid.set(true);
  BR_Solenoid.set(true);
  }

  public void turnOffBL(){
  BL_Solenoid.set(false);
  }

  public void turnOffBR(){
  BR_Solenoid.set(false);
  }

  public void turnOffTL(){
  TL_Solenoid.set(false);
  }

  public void turnOffTR(){
  TR_Solenoid.set(false);
  }

  public void turnOnBL(){
  BL_Solenoid.set(true);
  }

  public void turnOnBR(){
  BR_Solenoid.set(true);
  }

  public void turnOnTL(){
  TL_Solenoid.set(true);
  }

  public void turnOnTR(){
  TR_Solenoid.set(true);
  }
  
  public void turnOffAllInSolonoids(){
  TLi_Solenoid.set(false);
  TRi_Solenoid.set(false);
  BLi_Solenoid.set(false);
  BRi_Solenoid.set(false);
  }

  public void turnOnAllInSolonoids(){
  TLi_Solenoid.set(true);
  TRi_Solenoid.set(true);
  BLi_Solenoid.set(true);
  BRi_Solenoid.set(true);
  }

  public void turnOffBLi(){
  BLi_Solenoid.set(false);
  }

  public void turnOffBRi(){
  BRi_Solenoid.set(false);
  }

  public void turnOffTLi(){
  TLi_Solenoid.set(false);
  }

  public void turnOffTRi(){
  TRi_Solenoid.set(false);
  }

  public void turnOnBLi(){
  BLi_Solenoid.set(true);
  }

  public void turnOnBRi(){
  BRi_Solenoid.set(true);
  }

  public void turnOnTLi(){
  TLi_Solenoid.set(true);
  }

  public void turnOnTRi(){
  TRi_Solenoid.set(true);
  }
    

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
