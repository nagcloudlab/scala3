
package `08$minuscollections`



final class `1$u002Eworksheet$_` {
def args = `1$u002Eworksheet_sc`.args$
def scriptPath = """08-collections/1.worksheet.sc"""
/*<script>*/
// val x = Vector(1, 2, 3)
// x.sum
// x.filter(_ > 1)
// x.map(_ * 2)
// x.takeWhile(_ < 3)

// val x = IndexedSeq(1, 2, 3)
// val xss = scala.collection.immutable.LinearSeq(1, 2, 3)

// import scala.collection.mutable.ArrayBuffer
// val xs = ArrayBuffer(1, 2, 3)
// xs.addOne(4)
// xs.addAll(List(5, 6, 7))

// xs += 8
// xs ++= List(9, 10)

// val m = Map(1 -> "a", 2 -> "b")
// val mm = collection.mutable.Map(1 -> "a", 2 -> "b")

// val set = Set(1, 2, 3)
// val mset = collection.mutable.Set(1, 2, 3)

// ------------------------------------------------------

// var v = Vector[Int]()
// for i <- 1 to 50_000 do v = v :+ i
// v(50_000 - 1)

// var l = List[Int]()
// for i <- 1 to 50_000 do l = l :+ i
// l(50_000 - 1)

// ------------------------------------------------------

//  Understanding Mutable Variables with Immutable Collections

var x = Vector(1, 2, 3)
x = x :+ 4
x
x = x ++ List(5, 6)
x

// var x = Vector(1)
// x = Vector(1, 2)
// x = Vector(1, 2, 3, 4)

// ----------------------------------------------------------

//  Creating a Lazy View on a Collection

// val xs = List.range(0, 3_000_000)

// val ys = xs
//   .map(_ + 1)
//   .map(_ * 10)
//   .filter(_ > 1000)
//   .filter(_ < 10000)

// val ys = xs.view
//   .map(_ + 1)
//   .map(_ * 10)
//   .filter(_ > 1000)
//   .filter(_ < 10000)

// ys.take(3).foreach(println)

/*

    val a = List.range(0, 1_000_000_000)
    val b = a.map(_ + 1)
    val c = b.map(_ * 10)
    val d = c.filter(_ > 1_000)

 */

val a = List.range(0, 1_000_000)
val b = a.view.map(_ + 1)
val c = b.take(3)
c.foreach(println)

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `1$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `1$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `1$u002Eworksheet_sc`.script as `1$u002Eworksheet`

