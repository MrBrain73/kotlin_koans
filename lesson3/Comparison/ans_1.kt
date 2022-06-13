package lesson3.Comparison

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other : MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}

/*
* Требуется перегрузить оператор <, но в Kotlin
* он работает как функция CompareTo, поэтому перегружаем
* этот метод. Так у даты есть несколько компонент, то делаем
* проверку по каждому конструкцией when.
*/