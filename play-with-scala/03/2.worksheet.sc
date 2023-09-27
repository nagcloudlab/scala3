//   Using a Trait as an Interface

trait HasTail:
    def startTail(): Unit
    def stopTail(): Unit

trait HasLegs:
    def startRunning(speed: Double): Unit
    def runForNSeconds(speed: Double, numSeconds: Int): Unit


class Dog extends HasTail, HasLegs:
    def startTail(): Unit = println("Tail is wagging")
    def stopTail(): Unit = println("Tail is stopped")
    def startRunning(speed: Double): Unit =
        println(s"Running at $speed miles/hour")
    def runForNSeconds(speed: Double, numSeconds: Int): Unit =
        println(s"Running at $speed miles/hour for $numSeconds seconds")


trait SentientBeing:
    def imAlive_!(): Unit = println("I’m alive!")
trait Furry        

trait Animal extends SentientBeing, Furry

