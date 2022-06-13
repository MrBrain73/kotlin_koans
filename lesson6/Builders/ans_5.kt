package lesson6.Builders

import Answer.*

enum class Answer { a, b, c }

val answers = mapOf<Int, Answer?>(
    1 to c, 2 to b, 3 to b, 4 to c
)

/*
* 1) td - это вызов функции, передали туда лямбда функцию
* 2) color - имя передаваемого агрумента
* 3) Представлена лямбда функция
* 4) this ссылается на параметр приемника
*/