/*
 * Copyright (c) 2024 Newport Robotics Group. All Rights Reserved.
 *
 * Open Source Software; you can modify and/or share it under the terms of
 * the license file in the root directory of this project.
 */
package frc.robot;

import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.util.Color8Bit;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  /** Defines constant values for robot components. */
  public static class RobotConstants {
    /** The maximum battery voltage. */
    public static final double MAX_BATTERY_VOLTAGE = 12.0;

    public static final double ROBOT_LENGTH = Units.inchesToMeters(39);

    public static final double INDEXER_MASS = 0.5;

    /** Wheel diameter. */
    public static final double WHEEL_DIAMETER_INCHES = 4.0;

    /** PMW Ports. */
    public static class PWMPort {
      public static final int LED = 1;
    }

    /** The total number of LEDs on the addressable LED string. */
    public static final int LED_COUNT = 11;

    /** Defines sub-segments on the addressable LED string. */
    public static class LEDSegment {
      public static final int STATUS_FIRST_LED = 0;
      public static final int STATUS_LED_COUNT = 11;
    }

    /** Field of View of Camera in degrees. */
    public static final double CAMERA_FOV = 70;

    /** Distance robot should be from speaker to score. */
    public static final double SCORING_DISTANCE_FROM_SPEAKER = Units.inchesToMeters(100);

    /** Distance robot should be from amp to score. */
    public static final double SCORING_DISTANCE_FROM_AMP = Units.inchesToMeters(20);

    /** 3d transforms that moves the camera to the center of the robot. */
    public static final double APRILTAG_CAMERA_PITCH = Math.toRadians(-24);

    public static final double APRILTAG_CAMERA_YAW = Math.toRadians(180);
    public static final double APRILTAG_CAMERA_ROLL = Math.toRadians(0);

    public static final Transform3d APRILTAG_ROBOT_TO_CAMERA =
        new Transform3d(
            new Translation3d(
                Units.inchesToMeters(-11.25), Units.inchesToMeters(0), Units.inchesToMeters(13.75)),
            new Rotation3d(APRILTAG_CAMERA_ROLL, APRILTAG_CAMERA_PITCH, APRILTAG_CAMERA_YAW));

    public static final Transform3d APRILTAG_CAMERA_TO_ROBOT = APRILTAG_ROBOT_TO_CAMERA.inverse();

    public static final Transform3d NOTE_ROBOT_TO_CAMERA =
        new Transform3d(); // TODO get real constant

    public static final Transform3d NOTE_CAMERA_TO_ROBOT =
        NOTE_ROBOT_TO_CAMERA.inverse(); // TODO get real constant

    /** Digital I/O port numbers. */
    public static class DigitalIO {
      public static final int ARM_ABSOLUTE_ENCODER = 0;
    }

    /** CAN Ids */
    public static class CAN {
      public static class TalonFX {
        public static final int CLIMBER_LEFT_PORT = 63; // TODO: change id
        public static final int CLIMBER_RIGHT_PORT = 62; // TODO: change id
      }

      public static class SparkMax {
        public static final int INTAKE_PORT = 2;
        public static final int ARM_LEFT_PORT = 1;
        public static final int ARM_RIGHT_PORT = 11;
        public static final int INDEXER_PORT = 3;
      }
    }

    /** Defines operator (i.e. driver and manipulator) constants. */
    public static class OperatorConstants {

      /** Defines the port numbers of the Xbox controllers. */
      public static class XboxControllerPort {
        public static final int DRIVER = 0;
        public static final int MANIPULATOR = 1;
      }
    }
  }

  public static class ColorConstants {
    public static final Color8Bit BLACK = new Color8Bit(0, 0, 0);
    public static final Color8Bit WHITE = new Color8Bit(200, 200, 200);
    public static final Color8Bit RED = new Color8Bit(255, 0, 0);
    public static final Color8Bit ORANGE = new Color8Bit(255, 119, 0);
    public static final Color8Bit YELLOW = new Color8Bit(255, 165, 0);
    public static final Color8Bit GREEN = new Color8Bit(0, 204, 0);
    public static final Color8Bit BLUE = new Color8Bit(0, 0, 204);
    public static final Color8Bit PURPLE = new Color8Bit(238, 80, 255);
    public static final Color8Bit PINK = new Color8Bit(255, 5, 100);
    public static final Color8Bit LIGHTBLUE = new Color8Bit(56, 197, 252);

    public static final Color8Bit COLORS[] = {
      BLACK, WHITE, RED, ORANGE, YELLOW, GREEN, BLUE, LIGHTBLUE, PURPLE, PINK
    };
  }
}
