// Resolving Method Name Conflicts and Understanding super


trait Hello:
    def greet = "hello"
trait Hi:
    def greet = "hi"

// class Greeter extends Hello,Hi 


// Override greet with custom behavior

// resolve the conflict by overriding 'greet' in the class
class Greeter extends Hello, Hi:
    override def greet = "I greet thee!"

// the 'greet' method override works as expected
val g = Greeter()
g.greet == "I greet thee!"
 // true    


 // Invoke greet using super

trait Parent:
    def speak = "make your bed"
trait Granddad:
    def speak = "get off my lawn"

// resolve the conflict by calling 'super.speak'
class Speaker extends Parent, Granddad:
    override def speak = super.speak    

Speaker().speak

// Control which super you call

trait Helloo:
    def greet = "hello"
trait Hii:
    def greet = "hi"
trait Yo:
    def greet = "yo"

class Greeterr extends Helloo, Hii, Yo:
    override def greet = super.greet
    def greetHello = super[Helloo].greet
    def greetHi= super[Hii].greet
    def greetYo= super[Yo].greet
end Greeter    

val gg=Greeterr()
gg.greet
gg.greetHello
gg.greetHi
gg.greetYo