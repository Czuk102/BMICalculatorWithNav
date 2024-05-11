package ControlFlow.Exercise2

fun main() {
    whileLoop()
    doWhileLoop()
}

fun doWhileLoop() {
    var pizzaSlices = 0
    do { println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices ++
    } while (pizzaSlices < 8)
    println ("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun whileLoop() {
    var pizzaSlices = 0
    while (pizzaSlices < 8) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    }
}