/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academicwork.pip;

import com.academicwork.pip.common.PipConfiguration;
import com.academicwork.pip.reader.IPipReader;
import com.academicwork.pip.reader.PipReaderImpl;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author zeeshan
 */
public class BoundaryTest extends TestCase {
  
  public BoundaryTest(String testName) {
    super(testName);
  }
  
  @Override
  protected void setUp() throws Exception {
    super.setUp();
  }
  
  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  /**
   * Test of isPointInPolygon method, of class Boundary.
   */
  public void testIsPointInPolygon() {
    System.out.println("isPointInPolygon");
    String path = PipConfiguration.POLYGON_FILE_PATH;
    IPipReader reader = new PipReaderImpl();
    List<Point> polygonPoints = reader.read(path);
    
    Point point = new Point(2, 7);
    
    Boundary instance = new Boundary(polygonPoints);
    boolean pip = instance.contains(point);
    assertTrue(pip);
    
    point.setX(3);
    point.setY(6);
    pip = instance.contains(point);
    
    assertFalse(pip);
  }
}
