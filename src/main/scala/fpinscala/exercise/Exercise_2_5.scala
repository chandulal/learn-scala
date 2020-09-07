package fpinscala.exercise

object Exercise_2_5 {

  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    f compose(g)
  }
}
