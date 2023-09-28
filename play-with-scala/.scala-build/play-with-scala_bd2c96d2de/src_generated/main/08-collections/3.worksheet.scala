
package `08$minuscollections`



final class `3$u002Eworksheet$_` {
def args = `3$u002Eworksheet_sc`.args$
def scriptPath = """08-collections/3.worksheet.sc"""
/*<script>*/
// val fruits = Array("cherry", "apple", "banana")
// scala.util.Sorting.quickSort(fruits)
// fruits.foreach(println)

class Person(val firstName: String, val lastName: String):
  override def toString = s"$firstName $lastName"

val peeps = Array(
  Person("Jessica", "Day"),
  Person("Nick", "Miller"),
  Person("Winston", "Bishop"),
  Person("", "Schmidt"),
  Person("Coach", "")
)

// scala-2
// implicit object LastNameOrdering extends Ordering[Person]:
//   def compare(a: Person, b: Person): Int = a.lastName compare b.lastName

// scala-3
given personOrdering: Ordering[Person] with
  def compare(a: Person, b: Person) = a.lastName compare b.lastName

import scala.util.Sorting.quickSort
quickSort(peeps)
peeps.foreach(println)

List(10, 5, 8, 1, 7).sorted
List("dog", "mouse", "cat").sorted
Vector("dog", "mouse", "cat").sortWith(_ > _)
Vector(10, 5, 8, 1, 7).sortWith((a, b) => a < b)

def sortByLength(s1: String, s2: String): Boolean =
  println(s"comparing $s1 & $s2")
  s1.length > s2.length

val a = List("dog", "mouse", "cat").sortWith(sortByLength)

class Employee(var name: String) extends Ordered[Employee]:
  override def toString = name
  def compare(that: Employee): Int =
    // depends on the definition of `==` for String
    if this.name == that.name then 0
    else if this.name > that.name then 1
    else -1

val dudes = List(
  Employee("Bill"),
  Employee("Al"),
  Employee("Adam")
)
dudes.sorted

val x = Vector("apple", "banana", "cherry")
x.mkString
x.mkString("|")

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `3$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `3$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `3$u002Eworksheet_sc`.script as `3$u002Eworksheet`

