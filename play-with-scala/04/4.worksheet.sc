//  Using apply Methods in Objects as Constructors

// class Person private (val name: String):
//     override def toString = name


// object Person:
// // the “constructor”
//     def apply(name: String): Person = new Person(name)



// val Regina1 = Person("Regina")
// val Regina2 = Person.apply("Regina")
// val a = List(Person("Regina"), Person("Robert"))



class Person private(var name: String, var age: Int):
    override def toString = s"$name is $age years old"

object Person:
    // three ways to build a Person
    def apply(): Person = new Person("", 0)
    def apply(name: String): Person = new Person(name, 0)
    def apply(name: String, age: Int): Person = new Person(name, age)    

println(Person())
println(Person("Regina"))
println(Person("Robert", 22))    