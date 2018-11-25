(x: Int) => x + 1
var increase = (x: Int) => x + 1
increase(10) //now it prints 11
//since increase is a var, we can reassign different function to it
increase = (x: Int) => x + 9999
increase(10) //now it prints 10009
//multi-statement function literal
increase = (x: Int) => {
  println("We")
  println("are")
  println("here!")
  x + 1
}
//function literal usage in foreach method
val someNumbers = List(-11, 10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x))
//function literal usage in filter method
someNumbers.filter((x: Int) => x > 0)
//short forms of function literals
//concise notion, compiler can find out the type of x using target typing
someNumbers.filter((x) => x > 0)
//more concise notion
someNumbers.filter(x => x > 0)
//Placeholder syntax
someNumbers.filter(_ > 0)
