package com.outrightwings.horse_potions.util;
/*
 Code from: https://github.com/d4rkm0nkey/HorseStatsVanilla under MIT License
 */
public class Converter {
    public static double jumpStrengthToJumpHeight(double strength) {
        double height = 0;
        double velocity = strength;
        while(velocity > 0) {
            height += velocity;
            velocity = (velocity - .08) * .98 * .98;
        }
        return height;
    }

    public static double genericSpeedToBlocPerSec(double speed) {
        return 42.157796 * speed;
    }
}