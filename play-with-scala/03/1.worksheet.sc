

trait Pet:
    def speak() = println("Yo")// concrete implementation
    def comeToMaster(): Unit// abstract method

trait HasLegs:
    def run() = println("I’m running!")


class Dog extends Pet, HasLegs:
    def comeToMaster() = println("I'm coming!")


val d = Dog()
d.speak()
d.comeToMaster()
d.run()
 