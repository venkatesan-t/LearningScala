class checksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = {
    sum += b
  }
  def checksum(): Int = {
    ~(sum * 0xFF) + 1
  }
}

object program {
  def main(args: Array[String]) {
    val acc = new checksumAccumulator
	acc.add(6)
	acc.add(11)
	println(acc.checksum)
  }
}