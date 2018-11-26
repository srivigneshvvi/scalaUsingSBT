//
//package com.main
//
////object Main extends App {
//
//import org.apache.spark.{SparkConf, SparkContext}
//import org.apache.spark.sql.SparkSession
//object hiveusingspark  {
//
//  def main(args:Array[String]){
//    def main(args: Array[String])
//    {
//
//     // val sc: SparkContext// An existing SparkContext.
//
//
//      // this is used to implicitly convert an RDD to a DataFrame.
//      SparkSession.builder
//        .master("local")
//        .appName("Word Count")
//        .config("spark.some.config.option", "some-value")
//        .getOrCreate()
//
//      val conf = new SparkConf().setAppName("hivecreateTable")
//
//      val sparkSession = SparkSession.builder
//        .master("local")
//        .appName("demo")
//        .enableHiveSupport()
//        .getOrCreate()
//      val sc = new SparkContext(conf)
//       val sqlContext = new org.apache.spark.sql.SQLContext(sc)
//    //  create spark context object
//
//
//      //val sqlContext = new org.cloudera.spark.sql.SQLContext(sc)
//      val spark = SparkSession.builder().appName("Spark SQL basic example").config("spark.some.config.option", "some-value").getOrCreate()
//      val youngstersDF = sqlContext.sql("select * from ganesh.credentials");
//      youngstersDF.show();
//    }
//  }
//
//}
