package frc.robot.gamepad;

import edu.wpi.first.wpilibj.GenericHID;

public abstract class Gamepad {
    

    private GenericHID gamepad;


    public Gamepad(int gamepadId) {
        gamepad = new GenericHID(gamepadId);
        
    }

    public boolean xPressed() {
        return gamepad.getRawButtonPressed(1);
    }

    public double getRightTrigger() {
        return gamepad.getRawAxis(3);
    }

    public double getLeftTrigger() {
        return gamepad.getRawAxis(2);
    }


    public double getLeftStickY() {
        return gamepad.getRawAxis(1);
    }

    public double getLeftStickX() {
        return gamepad.getRawAxis(0);
    }

    public double getRightStickX() {
        return gamepad.getRawAxis(4);
    }
}
