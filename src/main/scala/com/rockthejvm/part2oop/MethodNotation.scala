package com.rockthejvm.part2oop

object MethodNotation {
  class Person(val name: String, age: Int, favoriteMovie: String) {
    infix def +(nick: String):Person = new Person(s"$name $nick",age,favoriteMovie)
    def unary_+ :Person = new Person(name,age+1,favoriteMovie)
    def apply(a:Int) = s"$name watched $favoriteMovie $a times"
  }

  val mary = new Person("Mary", 34, "Inception")
  val john = new Person("John", 36, "Fight Club")
  def main(args: Array[String]): Unit = {

  }
}
