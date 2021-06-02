package org.jhotdraw.samples.svg.gui;

import javax.swing.*;
import java.io.Serializable;

public class ProgressIndicatorProduct implements Serializable {
    private BoundedRangeModel progressModel;

    public BoundedRangeModel getProgressModel() {
        return progressModel;
    }

    public void setProgressModel(BoundedRangeModel progressModel) {
        this.progressModel = progressModel;
    }

    /**
     * Returns the minimum value -- the lower end of the progress value.
     *
     * @return an int representing the minimum value
     * @see #setMinimum
     */
    public int getMinimum() {
        return progressModel.getMinimum();
    }

    /**
     * Specifies the minimum value.
     *
     * @param m an int specifying the minimum value
     * @see #getMinimum
     */
    public void setMinimum(int m) {
        progressModel.setMinimum(m);
    }

    /**
     * Indicate the progress of the operation being monitored.
     *
     * @param nv an int specifying the current value, between the
     *           maximum and minimum specified for this component
     */
    public void setProgress(int nv) {
        progressModel.setValue(nv);
    }

    /**
     * Returns the maximum value -- the higher end of the progress value.
     *
     * @return an int representing the maximum value
     * @see #setMaximum
     */
    public int getMaximum() {
        return progressModel.getMaximum();
    }

    /**
     * Specifies the maximum value.
     *
     * @param m an int specifying the maximum value
     * @see #getMaximum
     */
    public void setMaximum(int m) {
        progressModel.setMaximum(m);
    }
}