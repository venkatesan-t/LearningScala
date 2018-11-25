object IfInImperativeStyle {

  def main(args: Array[String]): Unit = {
    var filename = "default.txt"
    if(!args.isEmpty)
      filename = args(0)
	println(filename)
  }
}