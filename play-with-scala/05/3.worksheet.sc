// Calling a Method on a Superclass or Trait

// class AnimalWithLegs:
//     def walk() = println("I’m walking")
//     def run() = println("I’m running")
// class Dog extends AnimalWithLegs:
//     def walkThenRun() =
//         walk()
//         run()


class AnimalWithLegs:
// the superclass 'walk' method.
    def walk() = println("Animal is walking")

class Dog extends AnimalWithLegs:
// the subclass 'walk' method.
    override def walk() =
        super.walk()
        // invoke the superclass method.
        println("Dog is walking")
 