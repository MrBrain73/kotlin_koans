package lesson3.`Operators overloading`

import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

data class TimeIntervalAmount(val timeIntervals : TimeInterval, val num : Int)

operator fun TimeInterval.times(num : Int) : TimeIntervalAmount =
    TimeIntervalAmount(this, num)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
    addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(time: TimeIntervalAmount): MyDate =
    addTimeIntervals(time.timeIntervals , time.num)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

/*
* Были написан класс данных, который хранит TimeInterval
* умноженный на Int.
*/