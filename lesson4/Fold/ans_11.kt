package lesson4.Fold

// // Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    var allProducts = customers.flatMap{ it.getOrderedProducts() }.toSet()
    return customers.fold(allProducts) { initProducts, customer ->
        initProducts.intersect(customer.getOrderedProducts()) }
}

fun Customer.getOrderedProducts(): List<Product> =
    orders.flatMap{ it.products }

/*
* С мощоью функции fold(), мы проходимся по списку всех продуктов
* и ищем пересечение (intersect()) с покупками,
* которые сделали все customers.
*/