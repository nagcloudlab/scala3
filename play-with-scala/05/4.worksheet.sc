//  Using Parameter Names When Calling a Method


enum CrustSize:
    case Small, Medium, Large
enum CrustType:
    case Regular, Thin, Thick

import CrustSize.*, CrustType.*

class Pizza:
    var crustSize = Medium
    var crustType = Regular
    def update(crustSize: CrustSize, crustType: CrustType) =
        this.crustSize = crustSize
        this.crustType = crustType
    override def toString = s"A $crustSize inch, $crustType crustpizza."

val p = Pizza()
p.update(crustSize = Large, crustType = Thick)
p.update(crustType = Thick, crustSize = Large)


//  Setting Default Values for Method Parameters


class Connection:
    def makeConnection(timeout: Int = 5_000, protocol: String ="https") =
        println(f"timeout = ${timeout}%d, protocol = ${protocol}%s")
        // more code here

val c = Connection()
c.makeConnection()
c.makeConnection(2_000)
c.makeConnection(3_000, "http")



 //Creating Methods That Take Variable-Argument Fields

 def printAll(strings: String*) =strings.foreach(println)
printAll()
printAll("a")
printAll("a", "b")
printAll("a", "b", "c")

val fruits = List("apple", "banana", "cherry")
printAll(fruits(0),fruits(1),fruits(2))
printAll(fruits: _*) // de-structuring

class Pizzaa:
    // no parentheses after 'crustSize'
    def crustSize = 12


val pz=Pizzaa()
pz.crustSize   



//  Supporting a Fluent Style of Programming

class Person:
    protected var _firstName = ""
    protected var _lastName = ""
    def setFirstName(firstName: String): this.type =
        _firstName = firstName
        this
    // note
    def setLastName(lastName: String): this.type =
        _lastName = lastName
        this
end Person

class Employee extends Person:
    protected var employeeNumber = 0
    def setEmployeeNumber(num: Int): this.type =
        this.employeeNumber = num
        this
    override def toString = s"$_firstName, $_lastName,$employeeNumber"
end Employee

val employee = Employee()
// use the fluent methods
employee
.setFirstName("Maximillion")
.setLastName("Alexander")
.setEmployeeNumber(2)

println(employee)



// Adding New Methods to Closed Classes with Extension Methods

extension (s: String)
    def hello: String = s"Hello, ${s.capitalize}"
    def increment: String = s.map(c => (c + 1).toChar)
    def hideAll: String = s.replaceAll(".", "*")

var myName="Nag"

myName.hello
myName.increment
myName.hideAll

extension (s: String)
    def makeInt(radix: Int): Int = Integer.parseInt(s, radix)

"123".toInt
"1010".makeInt(2)    