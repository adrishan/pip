/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academicwork.pip;

import java.util.List;

/**
 * Use this class to create Polygon from given points and to check certain points within Polygon
 * region.
 *
 * @author zeeshan
 */
public class Boundary {

  private Point[] points;

  /**
   * Polygon will be get created upon calling of this constructor
   *
   * @param polygonPoints
   */
  public Boundary(List<Point> polygonPoints) {
    points = new Point[polygonPoints.size()];
    this.points = polygonPoints.toArray(points);
  }

  /**
   * Return true if the given point is contained inside the boundary.
   *
   *
   * @param point The point to check
   * @return true if the point is inside the boundary, false otherwise
   *
   */
  public boolean contains(Point point) {
    int i;
    int j;
    boolean result = false;
    for (i = 0, j = points.length - 1; i < points.length; j = i++) {
      if ((points[i].getY() > point.getY()) != (points[j].getY() > point.getY())
              && (point.getX() < (points[j].getX() - points[i].getX()) * 
              (point.getY() - points[i].getY())
              / (points[j].getY() - points[i].getY()) + points[i].getX())) {
        result = !result;
      }
    }
    return result;
  }
}
