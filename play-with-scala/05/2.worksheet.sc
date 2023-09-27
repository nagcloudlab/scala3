//  Controlling Method Scope (Access Modifiers)

//private scope

// class Cat:
//     private def isFriendlyCat = true
//     def sampleMethod(other: Cat) =
//         if other.isFriendlyCat then
//             println("Can access other.isFriendlyCat")
//         // ...
//         end if
//     end sampleMethod
// end Cat

// class Animal:
//     private def heartBeat() = println("Animal heart is beating")
// class Dog extends Animal:
// heartBeat()

// protected scope

// class Cat:
//     protected def isFriendlyCat = true
//     def catFoo(otherCat: Cat) =
//         if otherCat.isFriendlyCat then
//         // this compiles
//         println("Can access 'otherCat.isFriendlyCat'")
//         // ...
//         end if

// val c1 = Cat()
// val c2 = Cat()
// c1.catFoo(c2)

// // c1.isFriendlyCat

// class Animal:
//     protected def heartBeat() = println("Animal heart is beating")

// class Dog extends Animal:
//     heartBeat()// this
