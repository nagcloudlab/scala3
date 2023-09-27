
// design & peformance issues

// => tight-coupling b/w dependent & dependency
    // -> can't extend with new features
// => unit-testing not possible
    // -> dev/bug-fix slow
// => too many dependency objects created & destroyed
    // -> slow/resource use high


//why these issues?

// => dependent itself managing it's own dependencies

// solution:

// => Don't create dependency in dependent's home(class) , do lookup in Factory

// Limitation on Factory

// => Factory locationtight-coupling

// best solution:

// => dont'create/lookup , get dependency from third-party (IOC)






//-----------------------------------------
// PriceMatrix
//-----------------------------------------


trait  PriceMatrix:
    def getPrice(itemCode:String):Double


class ExcelPriceMatrix extends PriceMatrix:
    def getPrice(itemCode:String):Double=
        //..
        100


class DBPriceMatrix extends PriceMatrix:
    def getPrice(itemCode:String):Double=
        //..
        200

//-----------------------------------------
// Billing
//-----------------------------------------

trait Billing:
    def getTotalPrice(cart:List[String]):Double

class BillingImpl(val priceMatrix:PriceMatrix) extends Billing:
    def getTotalPrice(cart:List[String]):Double=
        val priceList=for 
            itemCode <- cart
        yield
            priceMatrix.getPrice(itemCode)
        priceList.sum    

//-----------------------------------------

val excelPriceMatrix=ExcelPriceMatrix()
val databasePriceMatrix=new DBPriceMatrix()
val billing=BillingImpl(databasePriceMatrix)

val cart1=List("123","456","789")
billing.getTotalPrice(cart1)
val cart2=List("123","456")
billing.getTotalPrice(cart2)

//-----------------------------------------