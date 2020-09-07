package fpinscala.exercise

object Exercise_3_5 extends App {

  @scala.annotation.tailrec
  def dropWhile[A](as: List[A])(f: A => Boolean): List[A] =
    as match {
      case h :: t if f(h) => dropWhile(t)(f)
      case _ => as
    }

  println(dropWhile(List(1, 2, 3, 4))(x => x < 3))
}
