class Car(var brand: String, var model: String, var year: Int) {
    override fun toString(): String {
        val car2Str = "{brand = ${brand}, model = ${model}, year = ${year}}"
        return car2Str
    }
}

fun main() {
    val c1 = Car("Ford", "Mustang", 1969)
    val c2 = Car("BMW", "X5", 1999)
    val c3 = Car("Tesla", "Model S", 2020)
    println(c1.brand)
    println(c1.toString())

    val c1Str = c1.toString()
    println(c1Str)

    println(arrayListOf(c1,c2,c3))
}
fun tests()
{
    test(3)
    anotherMethod()
    counting()
    trips()

    println(birthdayGreeting(age = 16, name = "Chris"))
    println(birthdayGreeting(name = "Chris", age = 16))
    println(birthdayGreeting(age = 16))
    println(switching(2))
    myArrays()
    myRanges()
}

fun test(addOne: Int)
{
    val myNum: Int = 100000
    var score = myNum + addOne
    val myWord: String = "The score is:"
    println(myWord + " " + score)
}

fun anotherMethod() {
    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")
}

fun counting() {
    var count = 10
    println("You have $count unread messages.")
    count++
    println("You have $count unread messages.")
}

fun trips() {
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
    val sum = 1 + 2
    val another = 9.5
    println("$sum")
}

fun birthdayGreeting(name: String = "Rover", age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun switching(day:Int):String {
    //val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    return result
//println(result)
//Outputs "Thursday" (day 4)
}

fun myArrays() {
    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }
}

fun myRanges() {
    for (chars in 'a'..'x') {
        println(chars)
    }
}