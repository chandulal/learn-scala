package fpinscala.exercise

object Exercise_3_3 extends App {
  def setHead[A](newHead: A, list: List[A]) = list match {
    case Nil => List.empty
    case (_ :: xs) =>  newHead :: xs
  }
  println(setHead(5, List(2,3,4,7)))
}
