/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academicwork.pip;

/**
 *
 * @author zeeshan
 */
public class Point {
  private double x;
  private double y;
  
  /**
   * Empty constructor
   */
  public Point() {
  }
  
  /**
   * Initialize point class with initial values of x,y
   * 
   * @param x as double
   * @param y as double
   */
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * 
   * @return x as double
   */
  public double getX() {
    return x;
  }

  /**
   * 
   * @param x as double
   */
  public void setX(double x) {
    this.x = x;
  }
  
  /**
   * 
   * @return y as double 
   */
  public double getY() {
    return y;
  }

  /**
   * 
   * @param y as double
   */
  public void setY(double y) {
    this.y = y;
  }
    
  /**
   * 
   * @return y as int
   */
  public int getYInt() {
    return (int) y;
  }
  
  /**
   * 
   * @return x as int
   */
  public int getXInt() {
    return (int) x;
  }
}
