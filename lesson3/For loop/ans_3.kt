package lesson3.`For loop`

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var current: MyDate = start;
            override fun next() : MyDate {
                if (!hasNext()) throw NoSuchElementException()
                val res : MyDate = current
                current = current.followingDate()
                return res
            }
            override fun hasNext(): Boolean = current <= end
        }
    }
}

/*
* В задании требуется прописать итератор для
* собственной структуры данных, функция итератора возращает тип
* Iterator<>, имеет две функции next() и hasNext().
* Также использованы анониманые объекты: object : Iterator<>.
*/