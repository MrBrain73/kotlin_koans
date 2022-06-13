package lesson5.`Delegates example`

class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy {
        initializer()
    }
}

/*
* Воспользовались Lazy properties.
*/