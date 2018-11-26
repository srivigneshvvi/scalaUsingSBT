package com.main


//package com.aeq

object addfun {

  def main(args: Array[String]): Unit = {
    val i = List(1,2,3,4,5,6)
    println(s"Addition : ${addition(i)}")
    println(s"Multiplication : ${multiplication(i)}")
  }

  def addition(input: List[Int]) : Int = {
    var total : Int = 0
    input.foreach { i =>
      total = total + operation(i, 1)
    }
    total
  }

  def operation(iteration: Int, number: Int) : Int = {
    var total: Int = 0
    for(_ <- 1 to iteration) {
      total = total + number
    }
    total
  }

  def multiplication(input: List[Int]): Int = {
    var initial : Int = 1
    input.foreach { a =>
      initial = operation(initial, a)
    }
    initial
  }

}