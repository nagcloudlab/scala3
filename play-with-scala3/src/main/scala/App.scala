

package days {
  enum Day:
    case Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

package bar{
  val date=days.Day.Sunday
  def enumImportTest=
    import days.Day.*
    if date == Saturday || date == Sunday then
      println("It’s the weekend!")
}

class ClassA:
  import scala.util.Random
  def printRandom =
    val r = Random()



object App:
  def main(args: Array[String]): Unit =
    println("Hello")
