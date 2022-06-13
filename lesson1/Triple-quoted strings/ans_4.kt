package lesson1.`Triple-quoted strings`

const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

fun main() {
    println(tripleQuotedString)
}

/*
* Метод trimMargin() убирает отступы в начале строки.
* По-умолчанию значок "|" - значок отступа у необработанных строк,
* но нам нужно убрать отступы у строк со значком "#",
* поэтому аргумент у функции trimMargin("#").
*/