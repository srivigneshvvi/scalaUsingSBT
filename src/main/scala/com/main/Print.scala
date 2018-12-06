package com.main
import org.apache.spark._
import org.apache.spark.SparkContext._


object Print {
  def main(args:Array[String]){
     //  val logFile ="README.md"
   //val logFile = args(0)
    println("SIVA CHECKING1");
   val inputFile = args(0)
    println("inputFIle is   "+inputFile)
    println("SIVA CHECKING");


  //  val outputFile = args(1)
   //val linecount = Source.fromFile("README.md").getLines.size
  //val fileSrc = scala.io.Source.fromFile(args(0))
   // println("Lines in the arg file"+linecount)
      //  val conf=new SparkConf().setAppName("Simple Application").setMaster("local[*]").setSparkHome("E:\\spark-2.3.1-bin-hadoop2.7")
     //val conf=new SparkConf().setAppName("Simple Application").setMaster("spark://192.168.2.55:7077").setSparkHome("E:\\spark-2.3.1-bin-hadoop2.7")
      // val conf=new SparkConf().setAppName("Simple Application").setMaster("spark://192.168.2.90:7077").setSparkHome("E:\\Softwares\\Hadoop\\spark-2.3.1-bin-hadoop2.7\\spark-2.3.1-bin-hadoop2.7") //surender
    //mani
  // val conf=new SparkConf().setAppName("Simple Application").setMaster("spark://192.168.2.30:7077").setSparkHome("E:\\Softwares\\spark-2.3.1-bin-hadoop2.7")
    val conf=new SparkConf().setAppName("SimpleApplication")
   //val conf=new SparkConf().setAppName("Simple Application").setMaster("spark://192.168.2.25:7077").setSparkHome("/usr/lib/spark")
        val sc=new SparkContext(conf)
        val logData =  sc.textFile(inputFile)
//        val logData=sc.textFile(logFile,2)
        val numAs = logData.filter(line => line.contains("a")).count()
        val numBs = logData.filter(line => line.contains("b")).count()
    //numAs.saveAsTextFile(outputFile)u
        println("Lines with a:%s, Lines with b:%s".format(numAs,numBs))
 //   sc.stop()
      }
}
