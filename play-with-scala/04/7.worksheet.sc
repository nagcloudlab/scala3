
//Writing an unapply method that returns a String

// class Person(val name: String, val age: Int)
// object Person:
//     def unapply(p: Person): String = s"${p.name}, ${p.age}"

// val p = Person("Lori", 33)    
// val personAsAString = Person.unapply(p)
 

// Writing an unapply method to work with a match expression

class Person(val name: String, val age: Int)
object Person:
    def unapply(p: Person): Option[(String, Int)] = Some(p.name,p.age)

val p = Person("Lori", 33)
val deconstructedPerson: String = p match
    case Person(n, a) => s"name: $n, age: $a"
    case null => "null!"    