
//  Defining Auxiliary Constructors for CaseClasses

case class Person(var name: String, var age: Int)


object Person:
    def apply()=new Person("<no name",0)
    def apply(name:String)=new Person(name,0)

val p = Person("John Smith", 30)
val p2=Person()
val p3=Person("John Smith")