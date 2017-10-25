object HelloWorld {
  def main(args: Array[String]): Unit = { // colon specifies return type. unit is similar to void, meaning it doesn't return anything
    // this is my first Scala program
    println("Hello, world!")
    /*
     * declare variables
     */
    var firstName:String = "Andrew"
    val age:Int = 30 // immutable data type (cannot change)
    println(firstName + ", is "+age+" years old")
    var sum = 10 + 25 // scala can infer data type, as it does here
    def function1:Unit = {
      println("This is function1")
    }
    function1 // invoke function call
  } // lambdas are anonymous functions
}