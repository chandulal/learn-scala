package fpinscala.exercise

object Exercise_3_5 extends App {
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Nil => List.empty
    case _ => l.iterator.filterNot(elm => f(elm)).toList
  }

  println(dropWhile(List(1, 2, 3, 4), (x: Int) => x % 2 == 0))
}
