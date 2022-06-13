package lesson6.`HTML builder`

fun renderProductTable(): String {
    return html {
        table {
            tr (color = getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for ((i, j) in products.withIndex()) {
                tr {
                    td (color = getCellColor(i, 0)) {
                        text(j.description)
                    }
                    td (color = getCellColor(i, 1)) {
                        text(j.price)
                    }
                    td (color = getCellColor(i, 2)) {
                        text(j.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, column: Int) = if ((index + column) % 2 == 0) "#dce4ff" else "#eff2ff"

/*
*
*/