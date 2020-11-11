package com.TestGroupB;

import com.sun.org.glassfish.gmbal.Description;

import org.testng.annotations.Test;

public class TestPackageB {
  @Test
  @Description("testCaseB inside ClassBTest inside packageB")
  public void testCaseB() {
    System.out.println("testCaseB inside ClassBTest inside packageB");

  }
}
