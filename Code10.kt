fun main(args: Array<String>) {

    val year = 2012
    var leap = false

    leap = when {
        year % 4 == 0 -> {
            when {
                year % 100 == 0 -> year % 400 == 0
                else -> true
            }
        }
        else -> false
    }

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}