
package `02`



final class `05_classes_2$u002Eworksheet$_` {
def args = `05_classes_2$u002Eworksheet_sc`.args$
def scriptPath = """02/05_classes_2.worksheet.sc"""
/*<script>*/
import scala.io.Source

// Assigning a Block or Function to a (lazy) Field

class FileReader(filename: String):
    // assign this block of code to the 'text' field
    lazy val text =
        // 'fileContents' will either contain the file contents,
        // or the exception message as a string
        val fileContents =
            try
                Source.fromFile(filename).getLines.mkString
            catch
                case e: Exception => e.getMessage
        println(fileContents)
        // print the contents
        fileContents


var reader=FileReader("/etc/passwd")
reader.text


//----------------------------------------------------------------

val x={
    println("eager computation")
    42    
}


lazy val y={
    println("lazy computation")
    42    
}

//----------------------------------------------------------------

y


/*</script>*/ /*<generated>*/
/*</generated>*/
}

object `05_classes_2$u002Eworksheet_sc` {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new `05_classes_2$u002Eworksheet$_`

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export `05_classes_2$u002Eworksheet_sc`.script as `05_classes_2$u002Eworksheet`

