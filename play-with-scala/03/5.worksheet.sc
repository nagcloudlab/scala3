//  Using Traits as Mixins


trait HasTail:
    def wagTail() = println("Tail is wagging")
    def stopTail() = println("Tail is stopped")

trait Pet:
    def speak() = println("Yo")
    def comeToMaster(): Unit// abstract    

class Dog(val name: String) extends Pet, HasTail:
    def comeToMaster() = println("Woo-hoo, I'm coming!")

val d = Dog("Zeus")


class Cat(val name: String) extends Pet, HasTail:
    def comeToMaster() = println("That’s not gonna happen.")
    override def speak() = println("meow")

val c = Cat("Morris")








