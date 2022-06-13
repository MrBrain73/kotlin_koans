package lesson3.Ranges

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}

/*
* Нужно проветить, принадлежит ли data интервалу [first; last].
*/