import io.Source._ // "_" is a wildcard that gets all methods in io.Source class

object readFromFiles extends App {
  val fileName = "samplePrograms/src/rainbow.txt"
  for(line <- fromFile(fileName).getLines()){
    println(line.toUpperCase())
  }
  val poemLines = fromFile("samplePrograms/src/poem.txt").getLines().toList
  poemLines.foreach(println)
}
