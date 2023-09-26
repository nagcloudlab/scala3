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