//  Implementing a Static Factory with apply


trait Animal:
    def speak(): Unit

private class Dog extends Animal:
    override def speak() = println("woof")
private class Cat extends Animal:
    override def speak() = println("meow")    

object Animal:
    def apply(s:String):Animal=
        if s=="dog" then Dog() else Cat()    


val cat=Animal("cat")
val dog=Animal("dog")
