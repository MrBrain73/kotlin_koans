package lesson6.`Function literals with receiver`

fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { this % 2 != 0 }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}

/*
* Так как внутри тела литерала объект-приёмник становится неявным,
* то мы можем обратиться к нему через кдючевое слово this.
*/