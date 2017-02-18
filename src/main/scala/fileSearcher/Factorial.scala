package fileSearcher

object Factorial {
  def main(args: Array[String]): Unit = {
    println("3: " + fact(3))
    println("6: " + fact(6))
    println("23: " + fact(23))
    println("45: " + fact(45))
  }

  def fact(n: BigInt): BigInt = factH(n, 1)

  private def factH(n: BigInt, acc: BigInt): BigInt = {
    if (n == 0)
      acc
    else
      factH(n - 1, acc * n)
  }
}
