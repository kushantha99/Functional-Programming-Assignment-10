object TemperatureConverter {
  def calAve(temp: List[Double]): Double = {
    val fahrTemp = temp.map(cel => (cel * 9/5) + 32)
    val totalTemp = fahrTemp.reduce(_ + _)
    val aveTemp = totalTemp / temp.length.toDouble
    aveTemp
  }

  def main(args: Array[String]): Unit = {
    val temp = List(0.0, 10.0, 20.0, 30.0)
    val aveTemp = calAve(temp)
    println(s"Average Fahrenheit temperature: $aveTemp")
  }
}
