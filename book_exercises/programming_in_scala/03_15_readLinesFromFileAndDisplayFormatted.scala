import scala.io.Source

if(args.length > 0)
{
  val lines = Source.fromFile(args(0)).getLines().toList
  //for(line <- lines)
  //  maxWidth = maxWidth.max(widthOfLength(line))
  val longestLine = lines.reduceLeft(
    (a, b) => if(a > b) a else b
  )
  val maxWidth = widthOfLength(longestLine)
  for(line <- lines) {
    var padding = " " * (maxWidth - widthOfLength(line))
    println(padding + line.length + " | " + line)
  }    
}
else
{
  Console.err.println("please enter filename")
}

def widthOfLength(s: String) = s.length.toString.length