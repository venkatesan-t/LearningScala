def processFile(fileName: String, width: Int) = {
  def processLine(line: String) = {
	if(line.length > width)
	  println(fileName + ": " + line.trim)
  }
  
  val source = Source.fromFile(fileName)
  for(line <- source.getLines()) {
    processLine(line)
  }
}