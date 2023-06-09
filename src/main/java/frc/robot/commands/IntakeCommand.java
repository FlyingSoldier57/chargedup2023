// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class IntakeCommand extends CommandBase {
  Joystick logitechController2;

  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})


  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public IntakeCommand(Joystick logitechJoystick, IntakeSubsystem intakeSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intakeSubsystem);
  }

  // Called when the command is initially scheduled.
  //debug for start of command
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  //Intake motor starts running
  @Override
  public void execute() {
    IntakeSubsystem.penceyiac(1);
  }

  // Called once the command ends or is interrupted.
  //debug for end of command (interrupted)
  @Override
  public void end(boolean interrupted) {
    IntakeSubsystem.penceyikapat(-1);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
     return false;
  }

  public class intakeSubsystem {

    public void getRawAxis(int i) {
    }
  }
}