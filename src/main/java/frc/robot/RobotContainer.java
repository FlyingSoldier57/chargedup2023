// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.IntakeCommand;
import frc.robot.commands.TankDriveCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;




public class RobotContainer {
  

  private final Joystick logitechJoystick = new Joystick(0);
  
  public final DriveSubsystem driveSubsystem = new DriveSubsystem();
  private final TankDriveCommand tankDriveCommand = new TankDriveCommand(logitechJoystick,driveSubsystem);
  
  public final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
  private final IntakeCommand intakeCommand = new IntakeCommand(logitechJoystick, intakeSubsystem);

  
  public TankDriveCommand getTankDriveCommand(){
    return tankDriveCommand;
  }

  public IntakeCommand getIntakeCommand () {
    return intakeCommand;
  }



  public Joystick getJoystick(){
    return logitechJoystick;
  }



  private void configureButtonBindings() {
    
   new JoystickButton(logitechJoystick, 1).whileTrue(new TankDriveCommand(logitechJoystick, driveSubsystem));
   
  
  
  }

  public void changeDirection() {
    if(logitechJoystick.getRawButtonPressed(6)){
      States.isReversed = !States.isReversed;
    }
  }
 
  



  public RobotContainer() {

     configureButtonBindings();{

     }


  }

 





  public Command getAutonomousCommand() {
  return null;

  }
}