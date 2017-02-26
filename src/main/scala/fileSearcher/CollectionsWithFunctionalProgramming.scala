package fileSearcher

object CollectionsWithFunctionalProgramming {

  def main(args: Array[String]): Unit = {
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    lst.foreach(print)

    println

    val doubledLst: List[Int] = lst.map(x => x * 2)
    doubledLst.foreach(print)

    println

    val tripledLst = lst.map(_ * 3)
    tripledLst.foreach(print)

    println

    val onlyEvenFromDoubled = doubledLst.filter(x => x % 2 == 0)
    onlyEvenFromDoubled.foreach(print)

    println

    val onlyTripledFromTripled = tripledLst.filter(x => x % 2 == 1)
    onlyTripledFromTripled.foreach(print)

    println

    val reduced: Int = lst.filter(x => x % 2 == 1).sum
    print(reduced)

    println


  }
}
