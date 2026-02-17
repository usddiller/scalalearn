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
  def main(args: Array[String]): Unit = {
    val charlesDickens = new Writer("Charles","Dickens", 1812)
    val notCharlesDickens = new Writer("Charles", "Dickens", 1811)
    val novel = new Novel("Great Expectations", 1861, charlesDickens)
    println(charlesDickens.fullName)
    println(novel.authorAge)
    println(novel.isWrittenBy(notCharlesDickens))
  }
}
