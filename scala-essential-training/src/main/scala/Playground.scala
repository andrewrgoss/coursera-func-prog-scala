object Playground {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    if (args.length == 0) {
      println("no args provided!")
    } else println(args(0))

    //int declared as a pointer, points to first argument in arguments list (variable length)
    def sum(args:Int*) = {
      var result = 0
      for(arg <- args) result += arg
      result
    }
    println(sum(1,2,3,4,5))
  }
}