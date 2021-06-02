package org.jhotdraw.samples.svg.gui;

import javax.swing.event.EventListenerList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class MessagePanelProduct implements Serializable {
    private EventListenerList listeners;

    public void addActionListener(ActionListener listener) {
        if (listeners == null) {
            listeners = new EventListenerList();
            listeners.add(ActionListener.class, listener);
        }
    }

    public void removeActionListener(ActionListener listener) {
        if (listeners != null) {
            listeners.remove(ActionListener.class, listener);
            if (listeners.getListenerCount() == 0) {
                listeners = null;
            }
        }
    }

    public void closePerformed(ActionEvent evt) { //GEN-FIRST:event_closePerformed
        for (ActionListener l : listeners.getListeners(ActionListener.class)) {
            l.actionPerformed(evt);
        }
    }//GEN-LAST:event_closePerformed
}