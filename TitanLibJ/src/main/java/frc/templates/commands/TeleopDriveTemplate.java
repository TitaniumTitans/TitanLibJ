// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


//TODO Assigned to Raffy

/* Again here it's just the core basics of a command, this shouldn't to anything fancy, simply get input 
from an xbox controller and drive the differential drive */

package frc.templates.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.templates.subsystems.DifferentialDriveTemplate;

/** An example command that uses an example subsystem. */
public class TeleopDriveTemplate extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DifferentialDriveTemplate m_subsystem;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public TeleopDriveTemplate(DifferentialDriveTemplate subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
