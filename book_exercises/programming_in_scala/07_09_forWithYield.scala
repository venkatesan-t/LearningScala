def scalaFiles = {
  val filesHere = (new java.io.File(".")).listFiles
  for{
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file
}