package org.firstinspires.ftc.teamcode.messages;

import com.acmerobotics.roadrunner.ftc.PositionVelocityPair;

public final class ThreeDeadWheelInputsMessage {
    public long timestamp;
    public PositionVelocityPair leftFront;
    public PositionVelocityPair rightBack;
    public PositionVelocityPair leftBack;

    public ThreeDeadWheelInputsMessage(PositionVelocityPair leftFront, PositionVelocityPair rightBack, PositionVelocityPair leftBack) {
        this.timestamp = System.nanoTime();
        this.leftFront = leftFront;
        this.rightBack = rightBack;
        this.leftBack = leftBack;
    }
}