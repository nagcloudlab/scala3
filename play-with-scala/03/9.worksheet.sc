
// Using Traits to Create Modules

trait AddService:
    def add(a: Int, b: Int) = a + b
    def getInt:Int
trait MultiplyService:
    def multiply(a: Int, b: Int) = a * b

// object AddService extends AddService
// AddService.add(12,12)    

object MathService extends AddService, MultiplyService:
    def getInt: Int = 100
    
import MathService._

add(12,12)
multiply(12,12)