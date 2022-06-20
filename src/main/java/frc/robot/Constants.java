package frc.robot;

public final class Constants {
    
    public static final class DriveConstants{
        /* Motor Ports */
        public static final int LEFT_MOTOR1_PORT = 1;
        public static final int LEFT_MOTOR2_PORT = 2;
        public static final int LEFT_MOTOR3_PORT = 3;
      
        public static final int RIGHT_MOTOR1_PORT = 4;
        public static final int RIGHT_MOTOR2_PORT = 5;
        public static final int RIGHT_MOTOR3_PORT = 6; 

        /* Encoders */
    }

    public static final class PitchMotorConstants{
        /* Pitch Motor Ports */
        public static final int LEFT_PMOTOR_PORT = 7;
        public static final int RIGHT_PMOTOR_PORT = 8;
    }

    public static final class PneumaticConstants{
        /* Solonoid Ports */
        public static final int TL_SOLONOID_PORT = 7;
        public static final int TR_SOLONOID_PORT = 7;
        public static final int BL_SOLONOID_PORT = 7;
        public static final int BR_SOLONOID_PORT = 7;
    }

    public static final class OIConstants{
        /* Joystick Ports */
        public static final int DRIVER    = 0; // driver joystick port (usb) on laptop (changeable w/ oi in driver station)
        public static final int OPERATOR  = 1; // operator controller port (usb) on laptop (changeable w/ oi in driver station)

        /* Controller Buttons */
        public static final int INTAKE_BUTTON = 0;
        public static final int SHOOT_BUTTON = 3;
        public static final int WHEEL_BUTTON = 1;
        public static final int UP_BUTTON = 4;
        public static final int DOWN_BUTTON = 5;
        public static final int JERRY_BUTTON = 6;
        public static final int TOM_BUTTON = 7;
        
    }

}
