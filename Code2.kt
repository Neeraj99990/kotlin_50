fun main(args: Array<String>) {
    var first = 1.20f
    var second = 2.45f

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")

    val tem  = first
    first = second 
    second = tem 

    println("--after swap--")
    println("First Number = $first")
    println("Second Number = $second")
}