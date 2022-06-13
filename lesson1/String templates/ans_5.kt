package lesson1.`String templates`

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} $month \d{4}"""

/*
*  С помощью значка $ мы обращаемся к переменной month в строке.
*/