//  Creating Static Members with Companion Objects

// Pizza class
class Pizza (var crustType: String):
    override def toString = s"Crust type is $crustType"

// companion object
object Pizza:
    val CRUST_TYPE_THIN = "THIN" // static fields
    val CRUST_TYPE_THICK = "THICK"
    def getPrice = 0.0 // static method    

println(Pizza.CRUST_TYPE_THIN)
println(Pizza.getPrice)   



// class Foo:
//     private val secret = 42
// object Foo:
// // access the private class field `secret`
//     def doubleFoo(foo: Foo) = foo.secret * 2    

// val f = Foo()
// println(Foo.doubleFoo(f))

object Foo:
    private val obj = "Foo’s object"

class Foo:
// access the private object field `obj`
    def printObj = println(s"I can see ${Foo.obj}")
