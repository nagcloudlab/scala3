// Functional Domain Modeling

// The Data Model

enum Topping:
  case Cheese, Pepperoni, Sausage, Mushrooms, Onions
enum CrustSize:
  case Small, Medium, Large
enum CrustType:
  case Regular, Thin, Thick

case class Pizza(
    crustSize: CrustSize,
    crustType: CrustType,
    toppings: Seq[Topping]
)
case class Customer(
    name: String,
    phone: String,
    address: Address
)
case class Address(
    street1: String,
    street2: Option[String],
    city: String,
    state: String,
    postalCode: String
)
case class Order(
    pizzas: Seq[Pizza],
    customer: Customer
)

// Functions That Operate on That Model

trait PizzaServiceInterface:
  def addTopping(p: Pizza, t: Topping): Pizza
  def removeTopping(p: Pizza, t: Topping): Pizza
  def removeAllToppings(p: Pizza): Pizza
  def updateCrustSize(p: Pizza, cs: CrustSize): Pizza
  def updateCrustType(p: Pizza, ct: CrustType): Pizza

object ListUtils:
  /** Drops the first matching element in a list, as in this example:
    * {{{
    * val xs = List(1,2,3,1)
    * dropFirstMatch(xs, 1) == List(2,3,1)
    * }}}
    */
  def dropFirstMatch[A](xs: Seq[A], value: A): Seq[A] =
    val idx = xs.indexOf(value)
    for
      (x, i) <- xs.zipWithIndex
      if i != idx
    yield x

import ListUtils.dropFirstMatch
trait PizzaService extends PizzaServiceInterface:
  def addTopping(p: Pizza, t: Topping): Pizza =
    val newToppings = p.toppings :+ t
    p.copy(toppings = newToppings)
  def removeTopping(p: Pizza, t: Topping): Pizza =
    val newToppings = dropFirstMatch(p.toppings, t)
    p.copy(toppings = newToppings)
  def removeAllToppings(p: Pizza): Pizza =
    val newToppings = Seq[Topping]()
    p.copy(toppings = newToppings)
  def updateCrustSize(p: Pizza, cs: CrustSize): Pizza =
    p.copy(crustSize = cs)
  def updateCrustType(p: Pizza, ct: CrustType): Pizza =
    p.copy(crustType = ct)
end PizzaService

import Topping.*, CrustSize.*, CrustType.*

@main def pizzaServiceMain =

  // PizzaService is a trait that extend PizzaServiceInterface
  import PizzaService.*
  object PizzaService extends PizzaService

  // an initial pizza
  val p = Pizza(Medium, Regular, Seq(Cheese))

  // demonstrating the PizzaService functions
  val p1 = addTopping(p, Pepperoni)
  val p2 = addTopping(p1, Mushrooms)
  val p3 = updateCrustType(p2, Thick)
  val p4 = updateCrustSize(p3, Large)

  // this is *not* a functional approach to printing output.
  // result:
  // Pizza(LargeCrustSize,ThickCrustType,List(Cheese, Pepperoni,Mushrooms))
  println(p4)
