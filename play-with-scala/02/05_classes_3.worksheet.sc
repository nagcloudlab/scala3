//  Setting Uninitialized var Field Types

class Address(val city: String, val state: String, val zip: String)
class Person(var username: String, var password: String):
    var age=0
    var firstName: String = ""
    var lastName: String = ""
    var address: Option[Address] = None

val p = Person("alvinalexander", "secret")
p.address = Some(Address("Talkeetna", "AK", "99676"))

p.address.foreach {a=>
    println(s"${a.city}, ${a.state}, ${a.zip}")
}