/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academicwork.pip.reader;

import com.academicwork.pip.Point;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 * 
 * 
 * @author zeeshan
 */
public class PipReaderImpl implements IPipReader {

  /**
   * Use this method to read polygon and points from files at given path
   * 
   * @param path as String
   * @return points in List
   */
  public List<Point> read(String path) {
    List<Point> points = new ArrayList<Point>(10);
    File polygonFile = new File(path);

    try {
      String strpoly = FileUtils.readFileToString(polygonFile);
      strpoly = strpoly.trim();
      String[] xypairs = strpoly.split(";");

      for (int i = 0; i < xypairs.length; i++) {
        String coordinates[] = xypairs[i].split(",");
        Point point = new Point(Double.parseDouble(coordinates[0].trim()),
                Double.parseDouble(coordinates[1].trim()));
        points.add(point);
      }

    } catch (IOException ex) {
      Logger.getLogger(PipReaderImpl.class.getName()).log(Level.SEVERE, null, ex);
    }

    return points;
  }
}