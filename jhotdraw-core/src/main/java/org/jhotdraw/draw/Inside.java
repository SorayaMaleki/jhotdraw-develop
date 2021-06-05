package org.jhotdraw.draw;

/**
 * @see AttributeKeys.StrokePlacement#INSIDE **/
public class Inside extends Placement {
    public double getPerpendicularFillGrowth(double grow, double strokeWidth) {
        grow = 0f;
        return grow;
    }
}