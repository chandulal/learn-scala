package fpinscala.exercise

object Exercise_2_3 {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {

    val bToC = (a: A) => f(a,_)

    a: A => bToC(a)
  }
}
