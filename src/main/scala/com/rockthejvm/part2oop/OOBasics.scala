package com.rockthejvm.part2oop

object OOBasics {
  class Writer(firstname:String,surname:String,val year:Int) {

    def fullName = s"$firstname $surname"
  }
  class Novel(name:String,yearOfRelease:Int,author:Writer) {

    def authorAge = yearOfRelease - author.year

    def isWrittenBy(au: Writer) = author == au
    def copy(newYear:Int) = new Novel(name,newYear,author)
  }

  class Counter(count:Int) {
    def decrement() = {
      if count >0 then
        new Counter(count - 1)
      else this
    }
    def increment() = new Counter(count +1)

    def increment(n: Int): Counter =
      if  n <= 0 then this
      else increment().increment(n - 1)

    def decrement(n: Int): Counter =
      if n <= 0 then this
      else decrement().decrement(n - 1)

//    def increment(n: Int) = if n > 0 then new Counter(count + n) else this
//    def decrement(n: Int) = if count > n && n > 0 then new Counter(count - n) else new Counter(0)
    def print() = count
  }

  def main(args: Array[String]): Unit = {
    val charlesDickens = new Writer("Charles","Dickens", 1812)
    val notCharlesDickens = new Writer("Charles", "Dickens", 1811)
    val novel = new Novel("Great Expectations", 1861, charlesDickens)
    println(charlesDickens.fullName)
    println(novel.authorAge)
    println(novel.isWrittenBy(notCharlesDickens))
  }
}
