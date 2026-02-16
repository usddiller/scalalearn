package com.rockthejvm.part1basics

import scala.annotation.tailrec

object Recursion {

  def fib(n: Int): Int = {
    @tailrec
    def loop(n1: Int, n2: Int, n: Int): Int = {
      if n > 1 then {
        val newn = n - 1
        loop(n2, n1 + n2, newn)
      }
      else n1
    }

    loop(0, 1, n)
  }//итак была рекурсиваная
  def concatNTimes(n:Int,str:String):String={
    @tailrec
    def go(n:Int,acc:String):String=
      if n > 0 then
        val newacc = acc+str
        go(n-1,newacc)
      else acc
    go(n,"")
  }
  def main(args: Array[String]): Unit = {
    println(concatNTimes(5,"boba"))
    println(fib(5))

  }
}
