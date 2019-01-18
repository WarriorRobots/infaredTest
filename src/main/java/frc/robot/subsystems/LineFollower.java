/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class LineFollower extends Subsystem {
  DigitalInput infrared_sensor_right = new DigitalInput(0);
  DigitalInput infrared_sensor_middle = new DigitalInput(1);
  DigitalInput infrared_sensor_left = new DigitalInput(2);

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  /** This function gets the value for any given Infrared Sensor
   * @param position Which sensor it is: 0 = left, 1 = middle, 2 = right
   * @return Returns {@code true} if white is sensed.
   */
  public void get(int position){
    switch(position){
      case "middle": 
        
        break;
      case "left":
        break;
      case "right":
        break;
      default: break;

    }
  }
}
