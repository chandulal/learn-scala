package fpinscala.exercise

object Exercise_3_2 extends App {

  def tail[A](list: List[A]): List[A] = list match {
    case Nil => List.empty
    case (_ :: xs) => xs
  }

  println(tail(List(1, 2, 3)))
  println(tail(Nil))
  println(tail(List("Hi", "Hello")))
}
