package lesson1.`Named arguments`

fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")

/*
* Метод joinToString каждый элемент списка (в нашем случае options)
* добавляет в строку, с разделителем по-умолчанию ", ". Поэтому нам
* нужно изменить только аргумент prefix и postfix:
*   prefix - что будет стоять в самом начале строки
*   postfix - что будет стоять в самом конце строки.
*/