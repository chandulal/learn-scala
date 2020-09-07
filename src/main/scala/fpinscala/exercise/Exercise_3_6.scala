package fpinscala.exercise

object Exercise_3_6 extends App {
  def init[A](l: List[A]): List[A] = {

    @scala.annotation.tailrec
    def loop(list: List[A], result: List[A]): List[A] = list match {
      case Nil => result
      case _ :: (t: List[A]) if t.isEmpty => result
      case h :: (t: List[A]) => loop(t, result :+ h)
    }

    loop(l, List.empty)
  }

  println(init(List(1, 2, 3, 4, 5)))
  println(init(List.empty))
}
