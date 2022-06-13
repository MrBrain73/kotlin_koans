package lesson1.`Default arguments`

fun foo(name: String, number: Int = 42, toUpperCase : Boolean = false) =
    (if (toUpperCase) name.uppercase() else name) + number

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)

/*
* Мы использовали для аргументов функции значения
* по-умолчанию: если при вызове функции передать, например, только
* агрумент name, то значения других аргументов будут по-умолчанию.
*/