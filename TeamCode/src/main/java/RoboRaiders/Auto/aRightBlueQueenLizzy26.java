/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package RoboRaiders.Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import RoboRaiders.Robot.QueenLizzy26;


/**
 * This file contains an minimal example of a Linear "OpMode". An OpMode is a 'program' that runs in either
 * the autonomous or the teleop period of an FTC match. The names of OpModes appear on the menu
 * of the FTC Driver Station. When an selection is made from the menu, the corresponding OpMode
 * class is instantiated on the Robot Controller and executed.
 *
 * This particular OpMode just executes a basic Tank Drive Teleop for a two wheeled robot
 * It includes all the skeletal structure that all linear OpModes contain.
 *
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

// START OF PSEUDOCODE
//**********************************************************************************************

//do the duck first, then position arm, then move to shipping hub, then drop preload box, park in team storage unit

//**********************************************************************************************
// END OF PSEUDOCODE

@Autonomous(name="RightBlue")

//@Disabled
public class aRightBlueQueenLizzy26 extends LinearOpMode {
    public QueenLizzy26 stevesRobot;
    double numofticks;

    @Override
    public void runOpMode() {

        stevesRobot = new QueenLizzy26();

        stevesRobot.initialize(hardwareMap);
        telemetry.addData("Robot Initialized waiting your command", true);
        telemetry.update();

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();


        //**********************************************************************************************

        //Strafe out right to align with carousel

        stevesRobot.resetEncoders();
        stevesRobot.runWithEncoders();
        numofticks = stevesRobot.driveTrainCalculateCounts(5);
        stevesRobot.setDriveMotorPower(-.10, .10, .10, -.10);

        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
            sleep(1);
        }
        // move backward

        stevesRobot.resetEncoders();
        stevesRobot.runWithEncoders();
        numofticks = stevesRobot.driveTrainCalculateCounts(8);
        stevesRobot.setDriveMotorPower(.1, -.1, .1, -.1);


        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
            sleep(1);
        }

        stevesRobot.setDriveMotorPower(0, 0, 0, 0);

        //**********************************************************************************************
        //Second option to spin carousel:

        //Spin 90 right to align spinner with carousel
//
//
//
//        stevesRobot.resetEncoders();
//        stevesRobot.runWithEncoders();
//        numofticks = stevesRobot.driveTrainCalculateCounts(13);
//        stevesRobot.setDriveMotorPower(.10, .10, .10, .10);
//
//        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
//            sleep(1);
//        }
//        //drive backward to spin
//        stevesRobot.resetEncoders();
//        stevesRobot.runWithEncoders();
//        numofticks = stevesRobot.driveTrainCalculateCounts(9);
//        stevesRobot.setDriveMotorPower(.1, -.1, .1, -.1);
//
//        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
//            sleep(1);
//        }

        //Spin 90 right
//
//
//
//        stevesRobot.resetEncoders();
//        stevesRobot.runWithEncoders();
//        numofticks = stevesRobot.driveTrainCalculateCounts(13);
//        stevesRobot.setDriveMotorPower(.10, .10, .10, .10);
//
//        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
//            sleep(1);
//        }

        //Go Forward
//        stevesRobot.resetEncoders();
//        stevesRobot.runWithEncoders();
//        numofticks = stevesRobot.driveTrainCalculateCounts(10);
//        stevesRobot.setDriveMotorPower(-.1, .1, -.1, .1);

//        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
//            sleep(1);
//        }

        //turn right to align with shipping hub
//          stevesRobot.resetEncoders();
//        stevesRobot.runWithEncoders();
//        numofticks = stevesRobot.driveTrainCalculateCounts(13);
//        stevesRobot.setDriveMotorPower(.10, .10, .10, .10);
//
//        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
//            sleep(1);
//        }

        // move deposit to top level
//
//        stevesRobot.depositBrace.setPosition(0.71);
//        stevesRobot.depositMove.setPosition(0.73);
//
//        sleep(700)

        //**********************************************************************************************


        //**********************************************************************************************

        // spin carousel

        stevesRobot.csRunWithoutEncoders();
        stevesRobot.setCarouselMotorPower(.55);

        sleep(4000);


        stevesRobot.setCarouselMotorPower(0);

        //**********************************************************************************************

        //Strafe away from carousel right
        stevesRobot.resetEncoders();
        stevesRobot.runWithEncoders();
        numofticks = stevesRobot.driveTrainCalculateCounts(40);
        stevesRobot.setDriveMotorPower(-.10, .10, .10, -.10);

        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
            sleep(1);
        }
        //**********************************************************************************************

        //Spin 180 degrees

        stevesRobot.resetEncoders();
        stevesRobot.runWithEncoders();
        numofticks = stevesRobot.driveTrainCalculateCounts(20.3);
        stevesRobot.setDriveMotorPower(-.10, -.10, -.10, -.10);

        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
            sleep(1);
        }
        sleep(300);
        // move deposit to top level

        stevesRobot.depositBrace.setPosition(0.71);
        stevesRobot.depositMove.setPosition(0.73);

        sleep(700);

        //**********************************************************************************************

        // move backward to shipping hub

        stevesRobot.resetEncoders();
        stevesRobot.runWithEncoders();
        numofticks = stevesRobot.driveTrainCalculateCounts(30);
        stevesRobot.setDriveMotorPower(.10, -.10, .10, -.10);

        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
            sleep(1);
        }

        stevesRobot.setDriveMotorPower(0, 0, 0, 0);

        //**********************************************************************************************

        // open deposit - close deposit - return deposit to home position

        stevesRobot.depositDoor.setPosition(1.0);

        sleep(2000);

        stevesRobot.depositDoor.setPosition(0);

        stevesRobot.depositBrace.setPosition(1.0);
        stevesRobot.depositMove.setPosition(0.0);

        sleep(1000);

        //**********************************************************************************************

        // drive forward away from shipping unit

        stevesRobot.resetEncoders();
        stevesRobot.runWithEncoders();
        numofticks = stevesRobot.driveTrainCalculateCounts(36);
        stevesRobot.setDriveMotorPower(-.30, .30, -.30, .30);

        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
            sleep(1);
        }

        stevesRobot.setDriveMotorPower(0, 0, 0, 0);

        //**********************************************************************************************

        // strafe right into storage unit

        stevesRobot.resetEncoders();
        stevesRobot.runWithEncoders();
        numofticks = stevesRobot.driveTrainCalculateCounts(15);
        stevesRobot.setDriveMotorPower(-.30, .30, .30, -.30);


        while (opModeIsActive() && stevesRobot.getSortedEncoderCount() <= numofticks){
            sleep(1);
        }

        stevesRobot.setDriveMotorPower(0, 0, 0, 0);

        //**********************************************************************************************

    }
}