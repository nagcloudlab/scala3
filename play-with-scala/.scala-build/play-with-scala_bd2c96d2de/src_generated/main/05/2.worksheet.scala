
package `05`



final class `2$u002Eworksheet$_` {
def args = `2$u002Eworksheet_sc`.args$
def scriptPath = """05/2.worksheet.sc"""
/*<script>*/
//  Controlling Method Scope (Access Modifiers)

//private scope

// class Cat:
//     private def isFriendlyCat = true
//     def sampleMethod(other: Cat) =
//         if other.isFriendlyCat then
//             println("Can access other.isFriendlyCat")
//         // ...
//         end if
//     end sampleMethod
// end Cat

// class Animal:
//     private def heartBeat() = println("Animal heart is beating")
// class Dog extends Animal:
// heartBeat()

// protected scope

// class Cat:
//     protected def isFriendlyCat = true
//     def catFoo(otherCat: Cat) =
//         if otherCat.isFriendlyCat then
//         // this compiles
//         println("Can access 'otherCat.isFriendlyCat'")
//         // ...
//         end if

// val c1 = Cat()
// val c2 = Cat()
// c1.catFoo(c2)

// // c1.isFriendlyCat

// class Animal:
//     protected def heartBeat() = println("Animal heart is beating")

// class Dog extends Animal:
//     heartBeat()// this

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `2$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `2$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `2$u002Eworksheet_sc`.script as `2$u002Eworksheet`

