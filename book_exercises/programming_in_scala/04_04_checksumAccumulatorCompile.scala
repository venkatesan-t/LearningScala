import checksumAccumulator.calculate

object Program {
  def main(args: Array[String]) {
    for(arg <- args)
	{
	  println(arg + ": " + calculate(arg))  
	}
  }
}

//scalac 04_03_checksumAccumulatorCompanionObject.scala 04_04_checksumAccumulatorCompile.scala
//fsc 04_03_checksumAccumulatorCompanionObject.scala 04_04_checksumAccumulatorCompile.scala