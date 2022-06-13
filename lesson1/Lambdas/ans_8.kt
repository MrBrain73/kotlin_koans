package lesson1.Lambdas

fun containsEven(collection: Collection<Int>): Boolean =
    collection.any{ (it % 2) == 0 }

/*
* Так как нам требуется только один параметр в лямда-функции,
* то можно использовать it вместо: (it: Int) -> Boolean.
*/