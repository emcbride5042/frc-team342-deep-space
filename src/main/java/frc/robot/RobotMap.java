/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //Motors
   public static final int LEFT_MOTOR = 1;
   public static final int RIGHT_MOTOR = 2;

   //Joystick Axis
   public static final int LEFT_Y_AXIS = 1;
   public static final int LEFT_X_AXIS = 0;
   public static final int RIGHT_Y_AXIS = 5;
   public static final int RIGHT_X_AXIS = 4;
   public static final int LEFT_TRIGGER = 2;
   public static final int RIGHT_TRIGGER = 3;
   

  // Talon ID's
  public static final int LEFTMASTER = 3;
  public static final int RIGHTMASTER = 1;
  public static final int LEFTSLAVE1 = 4;
  public static final int LEFTSLAVE2 = 11;
  public static final int LEFTSLAVE3 = 12;
  public static final int RIGHTSLAVE1 = 2;
  public static final int RIGHTSLAVE2 = 13;
  public static final int RIGHTSLAVE3 = 14;
  
  public static final int LIFTMASTER= 8;   
  public static final int LIFTFOLLOW = 9;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
