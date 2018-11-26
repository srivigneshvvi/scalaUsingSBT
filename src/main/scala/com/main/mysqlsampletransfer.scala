//
//import java.util.Properties
//import org.apache.spark.SparkConf
//import org.apache.spark.SparkContext
//import scala.xml.dtd.ExtDef
//import org.apache.spark.sql.Dataset
//import org.apache.spark.sql.SparkSession
//import org.apache.spark.sql.hive.execution._
//import org.apache.spark.sql.SaveMode
//object mysqlsampletransfer extends App {
//  var spark = SparkSession.builder().appName("mysqlsample").config("spark.master", "local").getOrCreate()
//  val url = "jdbc:mysql://localhost:3306/global_guardgm6"
//  val table = "customers"
//  val properties = new Properties()
//  properties.put("user", "root")
//  properties.put("password", "root")
//
//  Class.forName("com.mysql.jdbc.Driver")
//
//  val mysqlidf = spark.read.jdbc(url, "solarpanel", properties)
//
//  spark.table("diamonds").withColumnRenamed("table", "table_number").write.jdbc(url, "diamonds", connectionProperties)
//
//
//}
