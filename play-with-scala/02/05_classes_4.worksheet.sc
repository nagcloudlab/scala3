//  Generating Boilerplate Code with Case Classes

// class Student private (val id: Int, val name: String):
//     override def toString(): String = ???
//     override def equals(x: Any): Boolean = ???
//     override def hashCode(): Int = ???
// object Student:
//     def apply(id: Int, name: String)= new Student(id, name)
//     def unapply(s:Student) : Option[(Int,String)]= 
//         Some((s.id, s.name))

case class Student(id: Int, name: String)

val s1 = Student(1, "s1")
val s2 = Student(1, "s1")

s1
s1 == s2
s1.hashCode()
s2.hashCode()

s1 match
    case Student(id,name) => println(s"$id, $name")


case object O1:
    val v=12


 object O2:    
    val v=12



O1 match
    case O1 => println("O1")
    