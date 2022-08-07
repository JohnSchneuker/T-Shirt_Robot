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
        /* Pitch Motor Encoders */
        public static final int RIGHT_PENCODER_PORT_A        = 0;     // port for the A channel of right encoder
        public static final int RIGHT_PENCODER_PORT_B        = 1;     // port for the B channel of right encoder
        public static final boolean RIGHT_PENCODER_REVERSE   = true;  // is the right encoder reversed?

        public static final int LEFT_PENCODER_PORT_A         = 2;     // port for the A channel of left encoder
        public static final int LEFT_PENCODER_PORT_B         = 3;     // port for the B channel of left encoder
        public static final boolean LEFT_PENCODER_REVERSE    = false; // is the left encoder reversed?
    }

    public static final class PneumaticsConstants{
        /*Output Solonoid Ports */
        public static final int TL_SOLONOID_PORT = 7;
        public static final int TR_SOLONOID_PORT = 7;
        public static final int BL_SOLONOID_PORT = 7;
        public static final int BR_SOLONOID_PORT = 7;

        /*Input Solonoid Ports */
        public static final int TLi_SOLONOID_PORT = 7;
        public static final int TRi_SOLONOID_PORT = 7;
        public static final int BLi_SOLONOID_PORT = 7;
        public static final int BRi_SOLONOID_PORT = 7;
    }

    public static final class OIConstants{
        /* Joystick Ports */
        public static final int DRIVER    = 0; // driver joystick port (usb) on laptop (changeable w/ oi in driver station)
        public static final int OPERATOR  = 1; // operator controller port (usb) on laptop (changeable w/ oi in driver station)

        /* Controller Buttons */
        public static final int UP_BUTTON = 4;
        public static final int DOWN_BUTTON = 5;

        public static final int TR_BUTTON = 4;
        public static final int TL_BUTTON = 4;
        public static final int BR_BUTTON = 4;
        public static final int BL_BUTTON = 4;
        
        public static final int TRi_BUTTON = 4;
        public static final int TLi_BUTTON = 4;
        public static final int BRi_BUTTON = 4;
        public static final int BLi_BUTTON = 4;
    }

}
