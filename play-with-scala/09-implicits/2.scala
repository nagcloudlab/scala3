object App2 {

  def main(args: Array[String]): Unit = {

    def print(s: String) = println(s)

    implicit def makeString(value: Int): String = value.toString

    print("hello")
    print(123)

  }

}
