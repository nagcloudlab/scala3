//tuple

def getValues() =
  (1, 2, 3, "hello", true)

getValues()

var t1 = ("hello", "World")
t1._1
t1(0)
t1._2
t1(1)

case class Stock(symbol: String, price: Double)
val aapl = Stock("AAPL", 123.45)

val t = Tuple.fromProduct(aapl)
t
