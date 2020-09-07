package fpinscala.exercise

object Exercise_2_1 {

  def fibonacci(n: Int): Int = {

    @scala.annotation.tailrec
    def loop(n: Int, prev: Int, curr: Int): Int = {
      if (n <= 2) curr
      else loop(n - 1, curr, prev + curr)
    }

    if (n == 1) 0
    else if (n == 2) 1
    else loop(n, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    print(fibonacci(4))
  }
}
