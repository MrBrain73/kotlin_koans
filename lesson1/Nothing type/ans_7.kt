package lesson1.`Nothing type`

import java.lang.IllegalArgumentException

fun failWithWrongAge(age: Int?) : Nothing {
    throw IllegalArgumentException("Wrong age: $age")
}

fun checkAge(age: Int?) {
    if (age == null || age !in 0..150) failWithWrongAge(age)
    println("Congrats! Next year you'll be ${age + 1}.")
}

fun main() {
    checkAge(10)
}

/*
* Выражение throw имеет тип Nothing, поэтому
* тип, который вернёт функция failWithWrongAge(),
* это Nothing.
*/