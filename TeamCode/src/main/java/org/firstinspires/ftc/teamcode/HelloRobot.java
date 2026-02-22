/*
Our first program
Hello Robot
*/
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class HelloRobot extends OpMode {


    @Override
    public void init() {
        telemetry.addLine("Hello Robot");
        telemetry.update(); //update Driver Hub display
    }

    @Override
    public void loop() {

    }
}
