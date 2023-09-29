case class Person(surname: String, name: String, age: Int)

//given personOrdering:Ordering[Person]=new Ordering[Person]:
//  override def compare(x: Person, y: Person): Int =
//    x.surname compareTo y.surname

object StandardValues {
  given personOrdering: Ordering[Person] with {
    override def compare(x: Person, y: Person): Int =
      x.surname.compareTo(y.surname)

    Predef
  }
}

def listPeople(people: Seq[Person])(using ordering: Ordering[Person]) = ???
def someOtherMethodRequiredOrdering(alice: Person, bob: Person)(using
    ordering: Ordering[Person]
) = ???
def yetAnotherMethodRequiringOrdering(people: List[Person])(using
    ordering: Ordering[Person]
) = ???

object App3:
  def main(args: Array[String]): Unit =
//    listPeople(Seq(Person("N","Nag",40),Person("A","Alice",50)))(personOrdering)
//    someOtherMethodRequiredOrdering(Person("N","Nag",40),Person("A","Alice",50))(personOrdering)
//    yetAnotherMethodRequiringOrdering(List(Person("N","Nag",40),Person("A","Alice",50)))(personOrdering)

    // import StandardValues.personOrdering
    import StandardValues.{given Ordering[Person]}
    listPeople(Seq(Person("N", "Nag", 40), Person("A", "Alice", 50)))
    someOtherMethodRequiredOrdering(
      Person("N", "Nag", 40),
      Person("A", "Alice", 50)
    )
    yetAnotherMethodRequiringOrdering(
      List(Person("N", "Nag", 40), Person("A", "Alice", 50))
    )

// wWhere Given are useful
//type classes
//dependency injection
//contextual abstractions, i.e. ability to use code for some types but not for others
//automatic type creation
