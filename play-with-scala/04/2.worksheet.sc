// Creating Singletons with object


object CashRegister:
    def open() = println("opened")
    def close() = println("closed")

object StringUtils:
    def isNullOrEmpty(s: String): Boolean =
    if s==null || s.trim.equals("") then true else false
    def leftTrim(s: String): String = s.replaceAll("^\\s+", "")
    def rightTrim(s: String): String = s.replaceAll("\\s+$", "")
    def capitalizeAllWordsInString(s: String): String =
    s.split(" ").map(_.capitalize).mkString(" ")