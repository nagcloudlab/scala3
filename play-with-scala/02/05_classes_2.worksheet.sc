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

