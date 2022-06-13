package lesson5.Properties

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(num) {
            field = num
            counter++
        }
}

/*
* Прописали обычный setter, который при каждом
* изменении поля propertyWithCounter, инкрементирует
* counter.
*/