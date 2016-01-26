package com.cherlanda.app;

import java.awt.*;

/**
 * A demonstration of the use of Rserver and graphics devices to create graphics in R, pull them into Java and display them. It is a really simple demo.
 */
public class PlotDemo extends Canvas {
  Image img;

  public PlotDemo(Image img) {
    this.img = img;
    MediaTracker mediaTracker = new MediaTracker(this);
    mediaTracker.addImage(img, 0);
    try {
      mediaTracker.waitForID(0);
    } catch (InterruptedException ie) {
      System.err.println(ie);
      System.exit(1);
    }
    setSize(img.getWidth(null), img.getHeight(null));
  }

  public void paint(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }
}
