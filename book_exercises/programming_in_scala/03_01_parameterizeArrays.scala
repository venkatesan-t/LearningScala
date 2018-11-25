val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ","
greetStrings(2) = "Scala!!!"

for(i <- 0 to 2)
  println(greetStrings(i))