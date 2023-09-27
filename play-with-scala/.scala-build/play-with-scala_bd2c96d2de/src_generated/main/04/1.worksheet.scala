
package `04`



final class `1$u002Eworksheet$_` {
def args = `1$u002Eworksheet_sc`.args$
def scriptPath = """04/1.worksheet.sc"""
/*<script>*/
// import scala.collection.mutable.ArrayBuffer


// enum CrustSize:
//     case Small, Medium, Large

// enum CrustType:
//     case Thin, Thick, Regular    

// enum Topping:
//     case Cheese, Pepperoni, Mushrooms, GreenPeppers, Olives    


// import CrustSize.*

// // if currentCrustSize == Small then ...
// case class Pizza(
//     crustSize: CrustSize,
//     crustType: CrustType,
//     toppings: ArrayBuffer[Topping]
//     )

// val currentCrustSize=Medium

// currentCrustSize match
//     case Small => println("SMALL")
//     case Medium => println("MEDIUM")
//     case Large => println("LARGE")
    
// enum HttpResponse(val code: Int):
//     case Ok extends HttpResponse(200)
//     case MovedPermanently extends HttpResponse(301)
//     case InternalServerError extends HttpResponse(500)    


// import HttpResponse.*
// Ok.code
// MovedPermanently.code
// InternalServerError.code



// class CrustSize
// object CrustSize:
//     case object Small extends  CrustSize
//     case object Medium extends  CrustSize
//     case object Large extends  CrustSize

// or

enum CrustSize:
    case Small, Medium, Large



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

