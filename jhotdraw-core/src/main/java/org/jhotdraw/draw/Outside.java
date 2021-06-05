package org.jhotdraw.draw;

/**
 * @see AttributeKeys.StrokePlacement#OUTSIDE **/
public class Outside extends Placement {
    public double getPerpendicularFillGrowth(double grow, double strokeWidth) {
        grow = strokeWidth;
        return grow;
    }
}