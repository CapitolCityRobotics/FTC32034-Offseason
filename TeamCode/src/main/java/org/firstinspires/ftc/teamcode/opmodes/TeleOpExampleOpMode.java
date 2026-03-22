package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.MecanumDrive;

@TeleOp

public class TeleOpExampleOpMode extends OpMode {
    MecanumDrive drive = new MecanumDrive();
    @Override
    public void init() {
        drive.init(hardwareMap);

        telemetry.addLine("Robot is Ready");
        telemetry.update();
    }

    @Override
    public void loop() {
        drive.driveRobotCentric(-gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);
    }
}
