package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.mechanisms.MecanumDrive;

@Autonomous
public class AutoSquareByTime extends LinearOpMode {

    MecanumDrive drive = new MecanumDrive();  // create an instance of our MecanumDrive class
    ElapsedTime timer = new ElapsedTime();


    @Override
    public void runOpMode() throws InterruptedException {
        drive.init(hardwareMap);

        // Send telemetry message to signify robot is ready.
        telemetry.addLine("Robot is ready. Press PLAY to start.");
        telemetry.update();

        waitForStart();

        // Step 1: move forward
        drive.driveRobotCentric(0.5,0,0);
        timer.reset();
        while (opModeIsActive() && timer.seconds() < 2.0) {

        }

        // Last step: stop robot
        drive.stopRobot();
    }
}
