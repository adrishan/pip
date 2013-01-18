/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academicwork.pip;

import java.awt.Polygon;
import java.util.List;

/**
 * Use this class to create Polygon from given points and 
 * to check certain points within Polygon region.
 * 
 * @author zeeshan
 */
public class Boundary {
  private Polygon polygon;
  
  /**
   * Polygon will be get created upon calling of this constructor
   * 
   * @param polygonPoints 
   */
  public Boundary(List<Point> polygonPoints) {
    createPolygon(polygonPoints);
  }
  
  /**
   * Use this method to check certain point within Polygon.
   * 
   * @param point
   * @return 
   */
  public boolean isPointInPolygon(Point point) {
    return polygon.contains(point.getX(), point.getY());
  }
  
  /**
   * Creating polygon from given points
   * 
   * @param polygonPoints 
   */
  private void createPolygon(List<Point> polygonPoints) {
    int len = polygonPoints.size();
    int[] x = new int[len];
    int[] y = new int[len];
    
    int index = 0;
    for (Point point : polygonPoints) {
      x[index] = point.getXInt();
      y[index] = point.getYInt();
      index++;
    }
    
    polygon = new Polygon(x, y, len);
  }
}
