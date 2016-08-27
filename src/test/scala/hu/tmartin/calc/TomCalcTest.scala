package hu.tmartin.calc

import org.scalatest.{FunSpec, FunSuite, Matchers}

/**
  * Created by Tamás on 2016-08-27.
  */
class TomCalcTest extends FunSuite with Matchers {

  test("Testing the add function"){
    val c = new TomCalc
    c.add(3,4) shouldBe(7)
  }

  test("Testing the minus function"){
    val c = new TomCalc
    c.minus(3,4) shouldBe(-1)
  }

}
