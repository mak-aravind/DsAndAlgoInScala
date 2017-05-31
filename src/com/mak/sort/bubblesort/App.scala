package com.mak.sort.bubblesort

object App {
  def main(args: Array[String]): Unit = {
    val arr = Array.fill(10)(math.random)
    println("Before Sorting:");
    arr.foreach { x => println(x) }
    BubbleSort.sort(arr)
    println("After Sorting:");
    arr.foreach { x => println(x) }
  }
}