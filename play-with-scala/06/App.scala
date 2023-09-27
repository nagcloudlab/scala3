// import java.lang.*
// import scala.*;
// import scala.Predef.*

// object App:
//   def main(args: Array[String]): Unit =
//     println("Hello, World")

// package com.acme.store {
//   class Foo:
//     override def toString = "I am com.acme.store.Foo"
// }

// package com.acme.store

// class Foo:
//   override def toString = "I am com.acme.store.Foo"

package orderentry {
  class Foo:
    override def toString = "I am orderentry.Foo"
}
package customers {
  class Foo:
    override def toString = "I am customers.Foo"
  package database {
    class Foo:
      override def toString = "I am customers.database.Foo"
  }
}

@main def test =
  println(orderentry.Foo())
  println(customers.Foo())
  println(customers.database.Foo())
