package fpinscala.exercise

import scala.annotation.tailrec

object Exercise_2_2 {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def loop(n: Int, result: Boolean): Boolean = {
      if (n >= as.length - 1) result
      else loop(n + 1, result && ordered(as(n), as(n + 1)))
    }

    loop(0, result = true)
  }

  val descendingOrder = (first: Int, second: Int) => first > second

  def ascendingOrder[T](first: T, second: T)(implicit ev: Numeric[T]): Boolean = {
    ev.lt(first, second)
  }

  def main(args: Array[String]): Unit = {
    println(isSorted(Array(1, 2, 3, 4), ascendingOrder[Int]))
    println(isSorted(Array(4, 3, 2, 1), descendingOrder))
    println(isSorted(Array(4.3, 1.3, 1.5, 5.0), ascendingOrder[Double]))
  }
}
