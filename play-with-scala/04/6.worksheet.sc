//  Reifying Traits as Objects

// trait Animal
// // in a world where all dogs and cats have names
// case class Dog(name: String) extends Animal
// case class Cat(name: String) extends Animal


// // assumes that all animal have legs
// trait AnimalServices:
//     def walk(a: Animal) = println(s"$a is walking")
//     def run(a: Animal) = println(s"$a is running")
//     def stop(a: Animal) = println(s"$a is stopped")

// object AnimalServices extends AnimalServices    

// val zeus = Dog("Zeus")
// AnimalServices.walk(zeus)
// AnimalServices.run(zeus)
// AnimalServices.stop(zeus)


trait Animal
trait AnimalWithLegs
trait AnimalWithTail
case class Dog(name: String) extends Animal, AnimalWithLegs,AnimalWithTail

trait TailServices:
    def wagTail(a: AnimalWithTail) = println(s"$a is wagging tail")
    def stopTail(a: AnimalWithTail) = println(s"$a tail is stopped")

trait AnimalWithLegsServices:
    def walk(a: AnimalWithLegs) = println(s"$a is walking")
    def run(a: AnimalWithLegs) = println(s"$a is running")
    def stop(a: AnimalWithLegs) = println(s"$a is stopped")    

trait DogServices:
    def bark(d: Dog) = println(s"$d says ‘woof’")    

object DogServices extends DogServices,AnimalWithLegsServices,TailServices

import DogServices.*
val rocky = Dog("Rocky")
walk(rocky)
wagTail(rocky)
bark(rocky)