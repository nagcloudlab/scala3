// Defining Abstract Fields in Traits


trait PizzaTrait:
    def maxNumToppings: Int


class SmallPizza extends PizzaTrait:
    // val maxNumToppings = 4
    // lazy val maxNumToppings =
    //     Thread.sleep(1_000)
    //     4
    var maxNumToppings = 6    


trait Foo:
    def bar: Int // abstract
    val a = 1 // concrete val
    var b = 2 // concrete var


trait SentientBeing:
    var uuid = 0// concrete

class Person extends SentientBeing:
    uuid = 1


trait Cat:
    val numLives = 9 // concrete

class BetterCat extends Cat:
    override val numLives = 10


    