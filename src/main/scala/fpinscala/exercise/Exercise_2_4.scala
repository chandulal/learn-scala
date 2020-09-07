//package fpinscala.exercise
//
//object Exercise_2_4 {
//
//  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
//    val fn = (f1: B => C) => f1(f)
//    (_: A, _: B) => fn(f(fn))
//  }
//}
