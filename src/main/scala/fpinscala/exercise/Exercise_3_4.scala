package fpinscala.exercise

object Exercise_3_4 extends App {
  def drop[A](l: List[A], n: Int): List[A] = {

    def loop(list: List[A], n: Int): List[A] = n match {
      case x if x <= 0 => list
      case _ if list.isEmpty => list
      case _ => loop(list.tail, n - 1)
    }

    if (l.isEmpty) l
    else
      loop(l, n)
  }

  println(drop(List(1, 2, 3, 4), 2))
  println(drop(List(1, 2, 3), 4))
  println(drop(List("Hello", "Hi", "Hey"), 1))
}
