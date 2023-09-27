
package `04`



final class `6$u002Eworksheet$_` {
def args = `6$u002Eworksheet_sc`.args$
def scriptPath = """04/6.worksheet.sc"""
/*<script>*/
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
/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `6$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `6$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `6$u002Eworksheet_sc`.script as `6$u002Eworksheet`

