package com.main
// $example on:spark_hive$

////val sparkVersion = "2.2.0"
//working
import java.io.File

import org.apache.spark.sql.{Row, SaveMode, SparkSession}
// $example off:spark_hive$
object SparkHiveExample {
  def main(args: Array[String]) {
    val warehouseLocation = new File("spark-warehouse").getAbsolutePath

    val spark = SparkSession.builder().appName("Spark Hive Example").config("spark.sql.warehouse.dir", warehouseLocation).enableHiveSupport().getOrCreate()

    import spark.implicits._
    import spark.sql

    sql("Create external table external_table23(id int,   name string,   surname string,   email string,   gender string,   ipaddress string )" +
      " row format delimited fields terminated by ',' STORED AS TEXTFILE  location 'extern_23'")
    sql("LOAD DATA  INPATH 'MOCK_DATA_Edited.csv' INTO TABLE external_table23")

    // Queries are expressed in HiveQL
    sql("SELECT * FROM external_table23").show()
    sql("SELECT COUNT(*) FROM external_table23").show()
  }
}
