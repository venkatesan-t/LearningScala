val greetStrings = new Array[String](3)

greetStrings.update(0, "Hello")
greetStrings.update(1, ",")
greetStrings.update(2, "Scala!!!")

for(arg <- (0).to(2))
  println(greetStrings.apply(arg))