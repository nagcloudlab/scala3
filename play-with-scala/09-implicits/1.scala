object App1 {

  def main(args: Array[String]): Unit = {

    val message = "hello "
    implicit val name = "world!"

    def disp(implicit nm: String) = message + nm

    // Implicit parameter will be passed here
    val result = disp

    // Implicit parameters will not be passed
    val result2 = disp("GFG!")

    println("With Implicit parameters:")
    println(result)
    println("Without Implicit parameters:")
    println(result2)

  }

}
