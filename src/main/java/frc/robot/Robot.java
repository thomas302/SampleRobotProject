/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
//Its best practice to specify what your importing and not to dump the library
//You probably already knew that but pointless comments never hurt anyone
import edu.wpi.first.wpilibj.Joystick;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code
   */
  //Instantiate motor controllers, sensors, joysticks, etc. here
  Joystick gamePad;

  TalonSRX driveTrainRight1;
  TalonSRX driveTrainRight2;
  TalonSRX driveTrainLeft1;
  TalonSRX driveTrainLeft2;
  //Normally this would be things like motor controllers, sensors, and joysticks
  @Override
  public void robotInit() {
    gamePad = new Joystick(0);


  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
