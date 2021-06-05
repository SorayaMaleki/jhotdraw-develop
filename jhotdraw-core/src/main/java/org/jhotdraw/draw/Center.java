package org.jhotdraw.draw;

/**
 * @see AttributeKeys.StrokePlacement#CENTER **/
public class Center extends Placement {
    public double getPerpendicularFillGrowth(double grow, double strokeWidth) {
        grow = strokeWidth / 2d;
        return grow;
    }
}