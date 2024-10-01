// defining a value
val meaningOfLife: Int = 65

// Int, Boolean, Char, Double, Float, String
val aBoolean = true

// string and string operations
var aString = "Hello world from scala!"
var aComposedString = "Hello" + " " + "from" + " " + "scala"
var anInterpolatedString = s"value of meaningOfLife = $meaningOfLife"

// expression is a structure that can be reduced to a value
var aExpression = 2 + 7

// if expression 
var ifExpression = if (meaningOfLife > 40) "pos" else "neg"
val chainedIfExpression = 
    if (meaningOfLife > 50) "G50"
    else if (meaningOfLife > 0) "pos"
    else if (meaningOfLife < 0) " neg"
    else 0

// code block
val aCodeBlock = {
    // definitions
    val aLocalVariable = 32

    // value of the block is value of the last expression
    aLocalVariable + 9
}

// define a function
def myFunction(x: Int, y:String): String = {
    y + " " + x 
}

// recursive function
def factorial(n: Int): Int = 
    if (n<=1) 1
    else n * factorial(n-1)

// In scala we don't use loops or iterations, we use RECURSION!

// the Unit type === Void, None, Null
def myUnitFunction(): Unit = {
    println("This function does not return anything.")
}

val theUnit = ()
