import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

val list = List (1, 2, 3, 4, 5, 6)
val sc = SparkSession.builder().getOrCreate()

val rdd = sc.sparkContext.makeRDD(list)
println(rdd.take(3))