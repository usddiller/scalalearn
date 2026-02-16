package com.rockthejvm.part1basics

import scala.annotation.tailrec

object Functions {

  def greeting(name:String,age:Int):String= {
    s"Hello $name $age"
  }

  def factorial(n:Int):Int = {
    if n<= 0 then 0
    else if n ==1 then 1
    else n * factorial(n-1)
  }
  def fib(n:Int):Int={
    @tailrec
    def loop(n1:Int,n2:Int,n:Int):Int ={
      if n>1 then {
        val newn = n-1
        loop(n2,n1+n2,newn)
      }
      else n1
    }
    loop(0,1,n)

  }//Вот здесь в решении автор показал нахождение чисел фибоначи начиная с 1,1,2,3,5...
  // А я построил с 0,1,1,2 ...
  // Так как в определении чисел фибоначи написано, что ряд начинается с 0, 1

  def isPrime(n:Int):Boolean={
    
    def go(t:Int):Boolean ={
      if t<=1 && t>0 then true
      else
        n%t != 0 && n>1 && go(t-1)
    }
    go(n/2)
  }
  //тут он в решении не учел то что отрицательные числа не могут быть простыми, решил добавить

  def main(args: Array[String]): Unit = {
    println(greeting("Spiridon",18))
    println(factorial(5))
    println(fib(4))
    println(isPrime(13))

  }

}
