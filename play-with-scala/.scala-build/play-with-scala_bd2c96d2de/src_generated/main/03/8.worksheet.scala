
package `03`



final class `8$u002Eworksheet$_` {
def args = `8$u002Eworksheet_sc`.args$
def scriptPath = """03/8.worksheet.sc"""
/*<script>*/
//  Marking Traits So They Can Only Be Used by Subclasses of a Certain Type

// trait HasLegs

// trait CanRun:
//     this: HasLegs=>

// class Dog extends HasLegs, CanRun:
//     def whatAmI(): Unit =
//         if this.isInstanceOf[Dog] then println("Dog")
//         if this.isInstanceOf[HasLegs] then println("HasLegs")
//         if this.isInstanceOf[CanRun] then println("CanRun")

// val d = Dog()
// d.whatAmI()


//-----------------------------------------------------------------------

// A trait can call methods on the required type

// trait HasLegs:
//     def numLegs = 0

// trait CanRun:
//     this: HasLegs =>
//     def run() = println(s"I have $numLegs legs and I’m running!")

// class Dog extends HasLegs, CanRun:
//     override val numLegs = 4

// val d = Dog()
// d.run()

//-----------------------------------------------------------------------


//  Limiting Which Classes Can Use a Trait by Inheritance

trait Employee
class CorporateEmployee extends Employee
class StoreEmployee extends Employee

trait DeliversFood extends StoreEmployee

// this is allowed
class DeliveryPerson extends StoreEmployee, DeliversFood

// class Receptionist extends CorporateEmployee, DeliversFood

//-----------------------------------------------------------------------


// Working with Parameterized Traits

// trait Stringify[A]:
//     def string(a: A): String

// trait Stringify:
//     type A
//     def string(a: A): String    


trait Stringify[A]:
    def string(a: A): String = s"value: ${a.toString}"

object StringifyInt extends Stringify[Double]   

StringifyInt.string(100)
StringifyInt.string(12.12)

trait Pair[A, B]:
    def getKey: A
    def getValue: B

trait Dog
class LittleDog extends Dog
class BigDog extends Dog    

trait Barker:
    type D <: Dog
    //type member
    def bark(d: D): Unit

object LittleBarker extends Barker:
    type D = LittleDog
    def bark(d: D) = println("wuf") 

object BigBarker extends Barker:
    type D = BigDog
    def bark(d: D) = println("WOOF!")

val terrier = LittleDog()
val husky = BigDog()    


LittleBarker.bark(terrier)
BigBarker.bark(husky)

// BigBarker.bark(terrier)


/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `8$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `8$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `8$u002Eworksheet_sc`.script as `8$u002Eworksheet`

