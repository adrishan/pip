/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academicwork.pip.reader;

import com.academicwork.pip.Point;
import java.util.List;

/**
 *
 * @author zeeshan
 */
public interface IPipReader {
  public List<Point> read(String path);
}
