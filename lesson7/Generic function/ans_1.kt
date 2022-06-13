package lesson7

import java.util.*

fun <T,H: MutableCollection<T>> Collection<T>.partitionTo(listOne : H, listTwo: H, predicate : (T) -> Boolean ) : Pair<H,H> {
    this.forEach{
        if(predicate(it)) listOne.add(it)
        else listTwo.add(it)
    }
    return Pair(listOne, listTwo)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
        .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
        .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}

/*
* Функция пробегается по каждому элементу
* коллекции, у которой вызвана данная функция, если
* элемент удовлетворяет усовию, то его добавляем в одну коллеция,
* иначе в другую.
*/