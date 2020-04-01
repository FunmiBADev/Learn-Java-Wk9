package com.fizz.buzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
  @Test
  public void isDivisibleByThree() {
      FizzBuzz fizzbuzz = new FizzBuzz();
      assertEquals(fizzbuzz.play(3), "Fizz");
  }

  @Test
  public void isDivisibleByFive() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals(fizzbuzz.play(5), "Buzz");
  }

  @Test
  public void isDivisibleByFifteen() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals(fizzbuzz.play(15), "FizzBuzz");

  }
  @Test
  public void otherNumbers() {
    FizzBuzz fizzbuzz = new FizzBuzz();
    assertEquals(fizzbuzz.play(11), "11");
  }



}