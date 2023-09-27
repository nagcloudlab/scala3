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


