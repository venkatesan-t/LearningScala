someNumbers.filter(x => x > 0)
//Placeholder syntax - the above expression can be rewritten as below using Placeholder syntax
someNumbers.filter(_ > 0)
//sometimes, when you use underscores as placeholders for parameters, the compiler might not have enough information to infer missing parameter types. For example, suppose you write _ + _by itself, compiler will throw "error: missing parameter type for expanded function"
val f = (_:Int) + (_:Int)
f(5, 10)