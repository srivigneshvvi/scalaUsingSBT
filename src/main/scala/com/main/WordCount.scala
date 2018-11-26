package com.main
import org.apache.spark._
import org.apache.spark.SparkContext._
//REFER from
///https://github.com/databricks/learning-spark/blob/master/mini-complete-example/src/main/scala/com/oreilly/learningsparkexamples/mini/scala/WordCount.scala
object WordCount {
  def main(args: Array[String]) {
    val inputFile = args(0)
    val outputFile = args(1)
    val conf = new SparkConf().setAppName("wordCount")
    // Create a Scala Spark Context.
    val sc = new SparkContext(conf)
    // Load our input data.
    println("INPUT DATA; " + inputFile)
    val input =  sc.textFile(inputFile)
    println("INPUT FILE INSIDE SCALA; " + input)
    // Split up into words.
    val words = input.flatMap(line => line.split(" "))
    println("INPUT flatmap FILE; " + words)
    // Transform into word and count.
    val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
    println("INPUT flatmap COUNT; " + counts)
    // Save the word count back out to a text file, causing evaluation.
    counts.saveAsTextFile(outputFile)
  }
}
