//package com.main
//import org.apache.spark.{SparkConf, SparkContext}
//import org.apache.spark.sql.hive._
//object HiveTable {
//  def main(args: Array[String]) {
//    //val master = args(0)
//    val conf = new SparkConf().setAppName("LoadHive")
//   // val conf = new SparkContext("local[*]", "LoadHive", System.getenv("SPARK_HOME"))
//    // Create a Scala Spark Context.
//   // val sc = new SparkContext(conf)
//    val sqlContext = new org.apache.spark.sql.hive.HiveContext(conf)
//
//    sqlContext.sql("Create external table external_table23(   id int,   name string,   surname string,   email string,   gender string,   ipaddress string )row format delimited fields terminated by ',' STORED AS TEXTFILE  location '/extern_23'")
//    sqlContext.sql("LOAD DATA  INPATH '/user/cloudera/mock_data_edited.csv'\nOVERWRITE INTO TABLE external_table23;")
//
//    // Queries are expressed in HiveQL
//    sqlContext.sql("FROM src external_table23 ").collect().foreach(println)
//  }
//}
