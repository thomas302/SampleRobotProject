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

import com.ctre.phoenix.motorcontrol.ControlMode;
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
    //Creates a joystick at ID 0, joystick IDS are set within driver station
    gamePad = new Joystick(0);

    //Creates a TalonSRX With a device ID of 0
    //Device IDs can be set within the phoenix tuner, and Each talon must have a unique device ID
    //To determine which ID a given talon should be set to you can use the flash command within the tuner to identify where a given talon is
    driveTrainLeft1 = new TalonSRX(0);
    driveTrainLeft2 = new TalonSRX(1);
    driveTrainRight1 = new TalonSRX(2);
    driveTrainRight2 = new TalonSRX(3);

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
    //Axis 0 on a gamepad is the leftstcks Y axis output, 5 is the rightsticks Y axis output
    driveTrainLeft1.set(ControlMode.PercentOutput, gamePad.getRawAxis(0));
    driveTrainLeft2.set(ControlMode.PercentOutput, gamePad.getRawAxis(0));
    //The negative inthe input is to account for the flip in directionality that one side of the drivetrain is to the other
    driveTrainRight1.set(ControlMode.PercentOutput, -1*(gamePad.getRawAxis(5)));
    driveTrainRight2.set(ControlMode.PercentOutput, -1*(gamePad.getRawAxis(5)));
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
