/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academicwork.pip.reader;

import com.academicwork.pip.Point;
import com.academicwork.pip.common.PipConfiguration;
import java.util.Collections;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author zeeshan
 */
public class PipReaderImplTest extends TestCase {
  
  public PipReaderImplTest(String testName) {
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
   * Test of read method, of class PipReaderImpl.
   */
  public void testReadPointsFile() {
    System.out.println("read points file");
    String path = PipConfiguration.POINTS_FILE_PATH;
    PipReaderImpl instance = new PipReaderImpl();
    List result = instance.read(path);
    assertNotNull(result);
  }
  
  /**
   * Test of read method, of class PipReaderImpl.
   */
  public void testReadPolygonFile() {
    System.out.println("read polygon file");
    String path = PipConfiguration.POLYGON_FILE_PATH;
    PipReaderImpl instance = new PipReaderImpl();
    List result = instance.read(path);
    assertNotNull(result);
  }
  
  /**
   * Test of read method, of class PipReaderImpl.
   */
  public void testReadWrongFile() {
    System.out.println("read polygon file");
    String path = "abc.txt";
    IPipReader instance = new PipReaderImpl();
    List<Point> result = instance.read(path);
    List<Point> expResult = Collections.EMPTY_LIST;
    assertEquals(expResult, result);
  }
  
}
