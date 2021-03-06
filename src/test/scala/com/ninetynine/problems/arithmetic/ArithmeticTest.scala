package com.ninetynine.problems.arithmetic

import org.scalatest.{FunSuite, Matchers}

class ArithmeticTest extends FunSuite with Matchers {

  test("isPrime()") {
    1.isPrime shouldBe false
    2.isPrime shouldBe true
    3.isPrime shouldBe true
    4.isPrime shouldBe false
    7.isPrime shouldBe true
    9.isPrime shouldBe false
  }

  test("gcd()") {
    P32.gcd(36, 63) shouldBe 9
    P32.gcd(7, 9) shouldBe 1
  }

  test("isCoprimeTo()") {
    7.isCoprimeTo(9) shouldBe true
    12.isCoprimeTo(2) shouldBe false
  }

  test("totient()") {
    10.totient shouldBe 4
  }
}
