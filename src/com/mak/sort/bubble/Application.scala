package com.mak.sort.bubble

object Application {
  def main(args: Array[String]): Unit = {
    val arr = Array.fill(10)(math.random)
    println("Before Sorting unordered elements:\n")
    arr.foreach { x => println(x) }
    BubbleSort.sort(arr)
    println("\nAfter Sorting ordered elements:\n")
    arr.foreach { x => println(x) }
  }
}