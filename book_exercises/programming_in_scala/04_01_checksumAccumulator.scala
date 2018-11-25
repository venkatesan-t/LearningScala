class checksumAccumulator {
  var sum = 0
}

object program {
  def main(args: Array[String]) = {
    val acc = new checksumAccumulator
	val csa = new checksumAccumulator
	acc.sum = 5
	csa.sum = 8
	println(acc.sum)
	println(csa.sum)
  }
}