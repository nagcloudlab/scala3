// ----------------------------------------------------------------
// for Loops and for Expressions
// ----------------------------------------------------------------

for i <- List(1, 2, 3) do println(i)

for
  i <- 1 to 10
  if i > 3
  if i < 6
do println(i)

val listOfInts = for
  i <- 1 to 10
  if i > 3
  if i < 6
yield i * 10

// ----------------------------------------------------------------
// if/then/else-if Expressions
// ----------------------------------------------------------------

val a = 0
val absValue = if a < 0 then -a else a
def compare(a: Int, b: Int): Int = if a < b then -1
else if a == b then 0
else 1
end compare

// ----------------------------------------------------------------
// match Expressions and Pattern Matching
// ----------------------------------------------------------------

def isTrue(a: Matchable): Boolean = a match
  case false | 0 | "" => false
  case _              => true

// ----------------------------------------------------------------
//   try/catch/finally Blocks
// ----------------------------------------------------------------

/*

try
catch
    case e1: Exception1Type => // handle that exception case e2: Exception2Type => // handle that exception
finally
      // close your resources and do anything else necessary here

 */

def toInt(s: String): Option[Int] = try Some(s.toInt)
catch case e: NumberFormatException => None

toInt("1") // Option[Int] = Some(1)
toInt("Yo") // Option[Int] = None

// ----------------------------------------------------------------
// while Loops
// ----------------------------------------------------------------

var i = 0
while i < 10 do
  println(i)
  i += 1

// ----------------------------------------------------------------
// Looping over Data Structures with for
// ---    
