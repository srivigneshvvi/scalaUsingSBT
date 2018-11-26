//package com.main
//
////import org.apache.spark.SparkContext
//import org.apache.spark._
//import org.apache.spark.sql.hive
//import org.apache.spark.sql.hive.HiveContext
//
//object LoadHive {
//  def main(args: Array[String]) {
//    if (args.length < 2) {
//      println("Usage: [sparkmaster] [tablename]")
//      //exit(1)
//    }
//    val master = args(0)
//    val tableName = args(1)
//    val sc = new SparkContext(master, "LoadHive", System.getenv("SPARK_HOME"))
//    val hiveCtx = new HiveContext(sc)
//    val input = hiveCtx.sql("SELECT * FROM `employeealice`.`employee_old` LIMIT 100;")
//    val data = input.map(_.getInt(0))
//    println(data.collect().toList)
//  }
//}
