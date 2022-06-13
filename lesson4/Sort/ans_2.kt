package lesson4.Sort

// Return a list of customers, sorted in the descending by number of orders they have made
fun Shop.getCustomersSortedByOrders(): List<Customer> =
    customers.sortedByDescending{ it.orders.size }

/*
* Пользуемся функцией sortedByDescending{}, так как
* сортировку требуется произвести по количеству orders.
*/