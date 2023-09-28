// val a = Map(
//   "AL" -> "Alabama",
//   "AK" -> "Alaska"
// )

// create a map
val a = Map(1 -> "a")
// adding elements
val b = a + (2 -> "b")
val c = b ++ Map(3 -> "c", 4 -> "d")
val d = c ++ List(5 -> "e", 6 -> "f")

d.keySet
d.keysIterator
d.max
