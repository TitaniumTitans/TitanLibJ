// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

//TODO assigned to Michael

/* For this class, you will need to create the bare minimum for a flywheel
on a robot. This will include two motor, we use the Falcon 500 motors, the library for them 
has already been added, and an arbitrary feed forward loop to control velocity of the
motors. I will also be adding a few extra utilities to make working with the CTRE library
units, as they are a pain to work with. As always, ask me if you want to know any more */

package frc.templates.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class FlywheelTemplate extends SubsystemBase {
  /** Creates a new FlywheelTemplate. */
  public FlywheelTemplate() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
