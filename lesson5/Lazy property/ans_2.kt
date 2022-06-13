package lesson5.`Lazy property`

class LazyProperty(val initializer: () -> Int) {
    var firstAccess : Int? = null;
    val lazy: Int
        get() {
            if (firstAccess == null) firstAccess = initializer()
            return firstAccess!!
        }
}