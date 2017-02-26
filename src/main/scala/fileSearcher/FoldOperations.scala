package fileSearcher

import scala.util.Random.nextInt

object FoldOperations {

  def main(args: Array[String]): Unit = {
//    println(sum(List(nextInt(10), nextInt(10))))
//    println(sumFamilyAge(List(Person("Fabio", 38), Person("Karen", 37), Person("Isabella", 10))))
//    println(sumFamilyAge(List(Person("Sergio", 62), Person("Celia", 61))))
    println(multiply(List(6, 7)))
  }

  private def sum(list: List[Int]): Int = {
    //    list.fold(0){(x, y) => x + y}
    //    list.foldLeft(0){(counter, value) => counter + value}
    //    list.foldRight(0){(value, counter) => counter + value}

    //    list.foldRight(0) {_ + _}
    //    list.foldRight(0){(_ + _)}
    list.sum
  }

  private def sumFamilyAge(list: List[Person]): Int = {
    list.foldLeft(0){(counter, person) => counter + person.age}
  }

  private def multiply(list: List[Int]) = list.foldLeft(1){(_*_)}
}

case class Person(name: String, age: Int)
