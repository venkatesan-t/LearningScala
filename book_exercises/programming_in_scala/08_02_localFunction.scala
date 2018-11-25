def processFile(fileName: String, width: Int) = {
  def processLine(fileName: String,
      width: Int, line: String) = {
	if(line.length > width)
	  println(fileName + ": " + line.trim)
  }
  
  val source = Source.fromFile(fileName)
  for(line <- source.getLines()) {
    processLine(fileName, width, line)
  }
}