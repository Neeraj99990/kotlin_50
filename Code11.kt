fun main() {
    var a = 5
    var b = 10

    println("Before swap: a = $a, b = $b")

    // Swap using destructuring declarations
    a = b.also { b = a }

    println("After swap: a = $a, b = $b")
}
