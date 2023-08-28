object LetterCounter {
  def letterCount(elements: List[String]): Int =
    elements.map(_.length).reduce(_ + _)

  def main(args: Array[String]): Unit =
    println(s"Total count of letter occurrences: ${letterCount(List("apple", "banana", "cherry", "date"))}")
}