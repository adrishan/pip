/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academicwork.pip;

import com.academicwork.pip.common.PipConfiguration;
import com.academicwork.pip.reader.IPipReader;
import com.academicwork.pip.reader.PipReaderImpl;
import java.util.List;

/**
 *
 * @author zeeshan
 */
public class PipExec {

  /**
   * Main entry point of PIP application
   * 
   * @param args 
   */
  public static void main(String[] args) {
    IPipReader reader = new PipReaderImpl();
    List<Point> points = reader.read(PipConfiguration.POINTS_FILE_PATH);
    List<Point> polygonPoints = reader.read(PipConfiguration.POLYGON_FILE_PATH);

    Boundary boundary = new Boundary(polygonPoints);
    
    for (Point point : points) {
      boolean isInside = boundary.contains(point);
      if (isInside) {
        System.out.println("x=" + point.getX() + " and y= " + point.getY()
                + "  are inside the Polygon");

      } else {
        System.out.println("x=" + point.getX() + " and y= " + point.getY()
                + "  are not inside the Polygon");
      }
    }

  }
}
