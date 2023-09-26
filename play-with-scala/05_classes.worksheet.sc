// Creating a Primary Constructor

class Employee(var firstName: String, var lastName: String):
    // a statement
    println("the constructor begins ...")

    // some class fields (variable assignments)
    var age=0
    private var salary = 0d

    // a method call
    printEmployeeInfo()

    override def toString = s"$firstName $lastName is $age years old"
    def printEmployeeInfo() = println(this) //uses toString

    // any statement or field prior to the end of the class
    // definition is part of the class constructor
    println("the constructor ends")

// optional 'end' statement
end Employee    


val e=Employee("John", "Doe")
e.firstName="Nag"
e.lastName="N"
e.age=40


//  Controlling the Visibility of Constructor Fields

class Person1(var name:String)
val p = Person1("Mark Sinclair Vincent")

p.name
p.name = "John"
p.name


class Person2(val name:String)
val p2 = Person2("Mark Sinclair Vincent")

p2.name
//p2.name="John"

class SuperEncryptor(password: String):
    private def encrypt(s:String)=s.map(c=>(c+1).toChar)
    def getEncryptedPassword=encrypt(password)


val se=SuperEncryptor("1234")
// se.password
se.getEncryptedPassword


// Adding private to val or var

enum Role:
    case HumanResources, WorkerBee
import Role.*

class Employee1(var name: String, private var salary: Double):
    def getSalary(r: Role): Option[Double] = r match
        case HumanResources => Some(salary)
        case _ => None

val e3 = Employee1("Steve Jobs", 1.0)        

// to access the salary field you have to use getSalary
e3.name
e3.getSalary(WorkerBee)
e3.getSalary(HumanResources)

// e3.salary


//  Defining Auxiliary Constructors for Classes

enum CrustSize:
    case Small, Medium, Large

enum CrustType:
    case Thin, Regular, Thick

import CrustSize.*, CrustType.*

class Pizza (var crustSize: CrustSize, var crustType: CrustType):
    
    def this(crustSize: CrustSize)=
        this(crustSize,Pizza.DefaultCrustType)

    def this(crustType:CrustType)=
        this(Pizza.DefaultCrustSize,crustType)    

    def this()=
        this(Pizza.DefaultCrustSize,Pizza.DefaultCrustType)    

    override def toString = s"A $crustSize pizza with a $crustType crust"

object Pizza:
     val DefaultCrustSize= Medium
     val DefaultCrustType=Regular


import Pizza.{DefaultCrustSize, DefaultCrustType}

// use the different constructors
val p11 = Pizza(DefaultCrustSize, DefaultCrustType)
val p21 = Pizza(DefaultCrustSize)
val p31 = Pizza(DefaultCrustType)
val p41 = Pizza


object Util:
    def m1=println("m1")
    def m2=println("m2")


//  Defining a Private Primary Constructor

class Student private (var name: String)
// val s=new Student("s1")
object  Student:
    def getInstance(name:String)=Student(name)

val s1=Student.getInstance("stud-1")


object FileUtils:
    def readFile(filename: String): String = ???
    def writeFile(filename: String, contents: String): Unit = ???

// val contents = FileUtils.readFile("input.txt")
// FileUtils.writeFile("output.txt", contents)




//  Providing Default Values for Constructor Parameters


// class Socket(val timeout: Int):
//     def this() = this(10_000)

// class Socket(val timeout: Int = 10_000)
// val s = Socket()
// s.timeout

// val s2 = Socket(5_000)
// s2.timeout


class Socket(val timeout: Int = 1_000, val linger: Int = 2_000):
    override def toString = s"timeout: $timeout, linger: $linger"

println(Socket())
println(Socket(3_000))
println(Socket(3_000,4_000))

Socket(timeout=3_000, linger=4_000)
Socket(linger=4_000, timeout=3_000)
Socket(timeout=3_000)
Socket(linger=4_000)



// Handling Constructor Parameters When Extending a Class
 
class Person(val name: String)
class Worker(name: String, val age: Int)  extends Person(name):
    override def toString = s"$name is $age years old"

val joe = Worker("Joe", 33)


class Todo private(val title:String)
object Todo:
    def apply(title:String):Todo = new Todo(title)


val todo1=Todo.apply("learn scala")
val todo2=Todo("learn life")


