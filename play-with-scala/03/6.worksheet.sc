trait HasLegs:
    def run = println("running")
trait HasTail
trait MansBestFriend

// class Pet(val name: String) extends HasLegs, HasTail, MansBestFriend
class Pet(val name: String)

val zeus = new Pet("Zeus") with MansBestFriend with HasTail with HasLegs
val cat = new Pet("Morris") with HasTail with HasLegs

cat.run
