package com.fizz.buzz;

public class FizzBuzz {

	public String play(int i) {
    if(i % 15 == 0) {
      return "FizzBuzz";
    } else if (i % 3 == 0) {
      return "Fizz";
    } else if( i % 5 == 0) {
      return "Buzz";
    } else{
      return String.valueOf(i);
    }

	
  }
  

 public static void main(String[] args) {
   FizzBuzz fizzbuzz = new FizzBuzz();
   for (int i = 1; i <=150; i++) {
     System.out.println(fizzbuzz.play(i));
   }
    
  }

}

// var fizzBuzz = new FizzBuzz();
// for (var i = 1; i <= 100; i++) {
//   console.log(fizzBuzz.play(i));
// }

// for (int i = 0; i < 5; i++) {
//   System.out.println(i);
// }

