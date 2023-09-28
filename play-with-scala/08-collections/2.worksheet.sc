// Collections: Common Sequence Classes

// Vector as your go-to immutable indexed sequence
// List as your go-to immutable linear sequence
// ArrayBuffer as your go-to mutable indexed sequence
// ListBuffer as your go-to mutable linear sequence

// val a = Vector(1, 2, 3, 4, 5)
// val b = a.filter(_ > 2)
// val c = a.map(_ * 10)

// val a = List(1, 2, 3, 4, 5)
// val b = a.filter(_ > 2)
// val c = a.map(_ * 10)

// val x = Vector(1, 2, 3)
// val y = x.map(_ * 2)

// import collection.mutable.ArrayBuffer
// val ab = ArrayBuffer(1, 2, 3)
// ab.mapInPlace(_ * 2)

// val v = Vector("a", "b", "c")
// v.apply(0)
// v(0)
// v.apply(1)
// v(1)

// val x = (1 to 10_000_000).toVector
// x(9_999_999)

// val a = Vector[String]()
// val b = a ++ List("a", "b")

// val v = Seq(1, 2, 3)

// val a = Vector(1, 2, 3)
// val b = a ++ List(4, 5)
// val c = b ++ Seq(6)

// The +: method, which is an alias for prepended
// ++: is an alias for prependedAll
// :+ is an alias for appended
// :++ is an alias for appendedAll

// prepending
// var a = Vector(6)
// a = 5 +: a
// a = a.prepended(4)
// a

// val a = Vector(1, 2, 3)
// val b = a.updated(index = 0, elem = 10)
// val c = b.updated(1, 20)

// val a = Vector(1, 2, 3, 4, 5, 6)
// val b = a.patch(0, List(10, 20), 2)
// val b = a.patch(0, List(10, 20), 3)
// val b = a.patch(0, List(10, 20), 4)
// val b = a.patch(2, List(30, 40), 2)
// val b = a.patch(2, List(30, 40), 3)
// val b = a.patch(2, List(30, 40), 4)

// Creating and Populating a List

// (1) basic, general use cases
// val xs1 = List(1, 2, 3)
// val xs2 = 1 :: 2 :: 3 :: Nil
// val xs3 = 1 :: List(2, 3)

// val xs = List.range(1, 10)
// // val xs = List.range(0, 10, 2)
// (1 to 5).toList
// (1 until 5).toList
// (1 to 10 by 2).toList
// (1 to 10 by 3).toList
// ('a' to 'e').toList
// ('a' to 'e' by 2).toList

// val xs = List.fill(3)("foo")
// val xs = List.tabulate(5)(n => n * n)
// val xs = "hello".toList

// 4 Deleting Elements from a List (or ListBuffer)

// val a = List(5, 1, 4, 3, 2)
// val b = a.filter(_ > 2)
// val b = a.take(2)
// val b = a.drop(2)
// val b = a diff List(1)

import scala.collection.mutable.ListBuffer
val x = ListBuffer(1, 2, 3, 4, 1, 2, 3, 4)
x -= 3
