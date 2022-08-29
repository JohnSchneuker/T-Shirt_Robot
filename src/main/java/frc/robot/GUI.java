package frc.robot;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import frc.robot.commands.Pneumatics_Commands.*;
import frc.robot.commands.Pitch_Commands.*;
import frc.robot.subsystems.PitchMotors;
import frc.robot.subsystems.Pneumatics;
import edu.wpi.first.networktables.LogMessage;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
public class GUI extends JPanel
                            implements ActionListener, ItemListener{
    JCheckBox topLeft0;
    JCheckBox topRight0;
    JCheckBox bottomLeft0;
    JCheckBox bottomRight0;
    JCheckBox topLeft1;
    JCheckBox topRight1;
    JCheckBox bottomLeft1;
    JCheckBox bottomRight1;
    JCheckBox topLeft2;
    JCheckBox topRight2;
    JCheckBox bottomLeft2;
    JCheckBox bottomRight2;
    JCheckBox topLeft3;
    JCheckBox topRight3;
    JCheckBox bottomLeft3;
    JCheckBox bottomRight3;
    JTextField aField0 = new JTextField();
    JTextField aField1 = new JTextField();
    JTextField aField2 = new JTextField();
    JTextField aField3 = new JTextField();
    JButton run;
    JButton abort;
    StringBuffer choices;

    //robot variables

    private Pneumatics _Pneumatics = new Pneumatics();
    private PitchMotors _PitchMotors = new PitchMotors();
    
    boolean TRstate0;
    boolean TLstate0;
    boolean BRstate0;
    boolean BLstate0;

    boolean TRstate1;
    boolean TLstate1;
    boolean BRstate1;
    boolean BLstate1;

    boolean TRstate2;
    boolean TLstate2;
    boolean BRstate2;
    boolean BLstate2;

    boolean TRstate3;
    boolean TLstate3;
    boolean BRstate3;
    boolean BLstate3;

    float wait1;
    float wait2;
    float wait3;
    float wait4;

    //Angle0.getText()


    SequentialCommandGroup command;

 
    public GUI() {
        super(new BorderLayout());
        //Create the check boxes.
        topLeft0 = new JCheckBox("Top Left");
        topLeft0.setMnemonic(KeyEvent.VK_A);
        topLeft0.setSelected(false);
 
        topRight0 = new JCheckBox("Top Right");
        topRight0.setMnemonic(KeyEvent.VK_B);
        topRight0.setSelected(false);
 
        bottomLeft0 = new JCheckBox("Bottom Left");
        bottomLeft0.setMnemonic(KeyEvent.VK_C);
        bottomLeft0.setSelected(false);
 
        bottomRight0 = new JCheckBox("Bottom Right");
        bottomRight0.setMnemonic(KeyEvent.VK_D);
        bottomRight0.setSelected(false);

        topLeft1 = new JCheckBox("Top Left");
        topLeft1.setMnemonic(KeyEvent.VK_E);
        topLeft1.setSelected(false);
 
        topRight1 = new JCheckBox("Top Right");
        topRight1.setMnemonic(KeyEvent.VK_F);
        topRight1.setSelected(false);
 
        bottomLeft1 = new JCheckBox("Bottom Left");
        bottomLeft1.setMnemonic(KeyEvent.VK_G);
        bottomLeft1.setSelected(false);
 
        bottomRight1 = new JCheckBox("Bottom Right");
        bottomRight1.setMnemonic(KeyEvent.VK_H);
        bottomRight1.setSelected(false);

        topLeft2 = new JCheckBox("Top Left");
        topLeft2.setMnemonic(KeyEvent.VK_I);
        topLeft2.setSelected(false);
 
        topRight2 = new JCheckBox("Top Right");
        topRight2.setMnemonic(KeyEvent.VK_J);
        topRight2.setSelected(false);
 
        bottomLeft2 = new JCheckBox("Bottom Left");
        bottomLeft2.setMnemonic(KeyEvent.VK_K);
        bottomLeft2.setSelected(false);
 
        bottomRight2 = new JCheckBox("Bottom Right");
        bottomRight2.setMnemonic(KeyEvent.VK_L);
        bottomRight2.setSelected(false);

        topLeft3 = new JCheckBox("Top Left");
        topLeft3.setMnemonic(KeyEvent.VK_M);
        topLeft3.setSelected(false);
 
        topRight3 = new JCheckBox("Top Right");
        topRight3.setMnemonic(KeyEvent.VK_N);
        topRight3.setSelected(false);
 
        bottomLeft3 = new JCheckBox("Bottom Left");
        bottomLeft3.setMnemonic(KeyEvent.VK_O);
        bottomLeft3.setSelected(false);
 
        bottomRight3 = new JCheckBox("Bottom Right");
        bottomRight3.setMnemonic(KeyEvent.VK_P);
        bottomRight3.setSelected(false);

        run = new JButton("Run");
        run.setActionCommand("exc");
        abort = new JButton("Abort");
        abort.setActionCommand("quit");
 
        //Register a listener for the check boxes.
        topLeft0.addItemListener(this);
        topRight0.addItemListener(this);
        bottomLeft0.addItemListener(this);
        bottomRight0.addItemListener(this);
        topLeft1.addItemListener(this);
        topRight1.addItemListener(this);
        bottomLeft1.addItemListener(this);
        bottomRight1.addItemListener(this);
        topLeft2.addItemListener(this);
        topRight2.addItemListener(this);
        bottomLeft2.addItemListener(this);
        bottomRight2.addItemListener(this);
        topLeft3.addItemListener(this);
        topRight3.addItemListener(this);
        bottomLeft3.addItemListener(this);
        bottomRight3.addItemListener(this);
        run.addActionListener(this);
        abort.addActionListener(this);
       
        JPanel wait0 = new JPanel(new GridLayout(1, 3));
        wait0.add(new JLabel("Wait For"));
        wait0.add(new JTextField());
        wait0.add(new JLabel("    Seconds"));
        JPanel angle0 = new JPanel(new GridLayout(1, 2));
        angle0.add(new JLabel("Cannon Angle:"));
        angle0.add(aField0);
        JPanel checkPanel0 = new JPanel(new GridLayout(2, 2));
        checkPanel0.add(topLeft0);
        checkPanel0.add(topRight0);
        checkPanel0.add(bottomLeft0);
        checkPanel0.add(bottomRight0);
        
        JPanel wait1 = new JPanel(new GridLayout(1, 3));
        wait1.add(new JLabel("Wait For"));
        wait1.add(new JTextField());
        wait1.add(new JLabel("    Seconds"));
        JPanel angle1 = new JPanel(new GridLayout(1, 2));
        angle1.add(new JLabel("Cannon Angle:"));
        angle1.add(aField1);
        JPanel checkPanel1 = new JPanel(new GridLayout(2, 2));
        checkPanel1.add(topLeft1);
        checkPanel1.add(topRight1);
        checkPanel1.add(bottomLeft1);
        checkPanel1.add(bottomRight1);

        JPanel wait2 = new JPanel(new GridLayout(1, 3));
        wait2.add(new JLabel("Wait For"));
        wait2.add(new JTextField());
        wait2.add(new JLabel("    Seconds"));
        JPanel angle2 = new JPanel(new GridLayout(1, 2));
        angle2.add(new JLabel("Cannon Angle:"));
        angle2.add(aField2);
        JPanel checkPanel2 = new JPanel(new GridLayout(2, 2));
        checkPanel2.add(topLeft2);
        checkPanel2.add(topRight2);
        checkPanel2.add(bottomLeft2);
        checkPanel2.add(bottomRight2);
        
        JPanel wait3 = new JPanel(new GridLayout(1, 3));
        wait3.add(new JLabel("Wait For"));
        wait3.add(new JTextField());
        wait3.add(new JLabel("    Seconds"));
        JPanel angle3 = new JPanel(new GridLayout(1, 2));
        angle3.add(new JLabel("Cannon Angle:"));
        angle3.add(aField3);
        JPanel checkPanel3 = new JPanel(new GridLayout(2, 2));
        checkPanel3.add(topLeft3);
        checkPanel3.add(topRight3);
        checkPanel3.add(bottomLeft3);
        checkPanel3.add(bottomRight3);
        
        JPanel controlPanel0 = new JPanel(new GridLayout(4, 1));
        controlPanel0.setPreferredSize(new Dimension(230, 230));
        controlPanel0.add(angle0);
        controlPanel0.add(checkPanel0);
        controlPanel0.add(wait0);
        controlPanel0.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(0, 2, 0, 2, Color.BLACK), new EmptyBorder(10, 10, 10, 10)));

        JPanel controlPanel1 = new JPanel(new GridLayout(4, 1));
        controlPanel1.setPreferredSize(new Dimension(230, 230));
        controlPanel1.add(angle1);
        controlPanel1.add(checkPanel1);
        controlPanel1.add(wait1);
        controlPanel1.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(0, 2, 0, 2, Color.BLACK), new EmptyBorder(10, 10, 10, 10)));

        JPanel controlPanel2 = new JPanel(new GridLayout(4, 1));
        controlPanel2.setPreferredSize(new Dimension(230, 230));
        controlPanel2.add(angle2);
        controlPanel2.add(checkPanel2);
        controlPanel2.add(wait2);
        controlPanel2.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(0, 2, 0, 2, Color.BLACK), new EmptyBorder(10, 10, 10, 10)));

        JPanel controlPanel3 = new JPanel(new GridLayout(4, 1));
        controlPanel3.setPreferredSize(new Dimension(230, 230));
        controlPanel3.add(angle3);
        controlPanel3.add(checkPanel3);
        controlPanel3.add(wait3);
        controlPanel3.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(0, 2, 0, 2, Color.BLACK), new EmptyBorder(10, 10, 10, 10)));

        GridLayout bLayout = new GridLayout(2, 1);
        bLayout.setHgap(25);
        bLayout.setVgap(25);

        JPanel buttons = new JPanel(bLayout);
        buttons.add(run);
        buttons.add(abort);
        buttons.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));

        GridLayout layout = new GridLayout(1, 5);
        layout.setHgap(0);
        layout.setVgap(0);

        JPanel controlPanels = new JPanel(layout);
        controlPanels.add(buttons);
        controlPanels.add(controlPanel0);
        controlPanels.add(controlPanel1);
        controlPanels.add(controlPanel2);
        controlPanels.add(controlPanel3);
        
        add(controlPanels);
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    }
 
    /** Listens to the check boxes. */
    public void itemStateChanged(ItemEvent e) {
        //V this needs to be cloned 11 times (i think)
        if (e.getSource() == topLeft0) {
            if (e.getStateChange() == 1) {
                //put checkmark state here?
                TLstate0 = true;
            }
            else {
                //put data here?
                TLstate2 = topLeft0.isSelected();
                
            }
        }
        TRstate0 = topRight0.isSelected();
        TLstate0 = topLeft0.isSelected();
        BRstate0 = bottomRight0.isSelected();
        BLstate0 = bottomLeft0.isSelected();

        TRstate1 = topRight1.isSelected();
        TLstate1 = topLeft1.isSelected();
        BRstate1 = bottomRight1.isSelected();
        BLstate1 = bottomLeft1.isSelected();

        TRstate2 = topRight2.isSelected();
        TLstate2 = topLeft2.isSelected();
        BRstate2 = bottomRight2.isSelected();
        BLstate2 = bottomLeft2.isSelected();

        TRstate3 = topRight3.isSelected();
        TLstate3 = topLeft3.isSelected();
        BRstate3 = bottomRight3.isSelected();
        BLstate3 = bottomLeft3.isSelected();

        //^ this needs to be cloned 11 times (i think)
    }
    public void actionPerformed(ActionEvent e) {
        if ("exc".equals(e.getActionCommand())) {
            command = new SequentialCommandGroup(
                new TurnShooterToAngle(Double.parseDouble(aField0.getText()), _PitchMotors),
                new OutputSolenoids(_Pneumatics, "TR", TRstate0),
                new OutputSolenoids(_Pneumatics, "TL", TLstate0),
                new OutputSolenoids(_Pneumatics, "BR", BRstate0),
                new OutputSolenoids(_Pneumatics, "BL", BLstate0).withTimeout(wait1),
                
                new TurnShooterToAngle(Double.parseDouble(aField1.getText()), _PitchMotors),
                new OutputSolenoids(_Pneumatics, "TR", TRstate1),
                new OutputSolenoids(_Pneumatics, "TL", TLstate1),
                new OutputSolenoids(_Pneumatics, "BR", BRstate1),
                new OutputSolenoids(_Pneumatics, "BL", BLstate1).withTimeout(wait2),
                
                new TurnShooterToAngle(Double.parseDouble(aField2.getText()), _PitchMotors),
                new OutputSolenoids(_Pneumatics, "TR", TRstate2),
                new OutputSolenoids(_Pneumatics, "TL", TLstate2),
                new OutputSolenoids(_Pneumatics, "BR", BRstate2),
                new OutputSolenoids(_Pneumatics, "BL", BLstate2).withTimeout(wait3),
                
                new TurnShooterToAngle(Double.parseDouble(aField3.getText()), _PitchMotors),
                new OutputSolenoids(_Pneumatics, "TR", TRstate3),
                new OutputSolenoids(_Pneumatics, "TL", TLstate3),
                new OutputSolenoids(_Pneumatics, "BR", BRstate3),
                new OutputSolenoids(_Pneumatics, "BL", BLstate3).withTimeout(wait4)
            );

            if (command != null) {
                command.schedule();
                }
            
            CommandScheduler.getInstance().run();
            //put run here?
        }
        if ("quit".equals(e.getActionCommand())){
            //put abort here?
            CommandScheduler.getInstance().cancelAll();
        }
    }
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Control Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new GUI();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}