package fileSearcher

object CrashCourse {

  def main(args: Array[String]): Unit = {
    println(square(13))
    println(test(2))
  }

  def square(x: Int): Int = {
    x * x
  }

  val test: (Int) => Int = (x: Int) => x + 2

}
