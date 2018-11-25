import checksumAccumulator.calculate

object ProgramAppTrait extends App {
  for(season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}