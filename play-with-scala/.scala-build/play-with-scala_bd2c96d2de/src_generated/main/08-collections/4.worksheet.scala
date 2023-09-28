
package `08$minuscollections`



final class `4$u002Eworksheet$_` {
def args = `4$u002Eworksheet_sc`.args$
def scriptPath = """08-collections/4.worksheet.sc"""
/*<script>*/
// Collections: Common Sequence Methods

val list = List.range(1, 10)
val events = list.filter(_ % 2 == 0)

for
  e <- list
  if e % 2 == 0
yield e

/*

Filtering methods
Methods that can be used to filter a collection include collect, diff,
distinct, drop, dropRight, dropWhile, filter, filterNot,
filterInPlace, find, foldLeft, foldRight, head,
headOption, init, intersect, last, lastOption, slice, tail,
take, takeRight, takeWhile, and union.

 */

/*

Transformer methods
Transformer methods take at least one input collection to create a new output
collection, typically using an algorithm you provide. They include +, ++, +:,
++:, appended, appendedAll, diff, distinct, collect,
concat, flatMap, flatten, inits, map, mapInPlace, patch,
reverse, sorted, sortBy, sortWith, sortInPlace,
sortInPlaceWith, sortInPlaceBy, tails, takeWhile,
updated, zip, and zipWithIndex.

 */

/*

Grouping methods
These methods let you take an existing collection and create multiple groups
from that one collection. They include groupBy, grouped, groupMap,
partition, sliding, span, splitAt, and unzip.

 */

/*

Informational and mathematical methods
These methods provide information about a collection, and include
canEqual, contains, containsSlice, count, endsWith,
exists, find, findLast, forAll, indexOf, indexOfSlice,
indexWhere, isDefinedAt, isEmpty, last, lastOption,
lastIndexOf, lastIndexOfSlice, lastIndexWhere, length,
lengthIs, max, maxBy, maxOption, maxByOption, min, minBy,
minOption, minByOption, nonEmpty, product,
segmentLength, size, sizeIs, startsWith, and sum. The methods
foldLeft, foldRight, reduceLeft, and reduceRight can also be
used with a function you supply to obtain information about a collection.

 */

val x = Vector(1, 1, 2, 3, 3, 4)
val y = x.distinct
val z = x.toSet

/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `4$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `4$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `4$u002Eworksheet_sc`.script as `4$u002Eworksheet`

