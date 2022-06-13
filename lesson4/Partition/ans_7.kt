package lesson4.Partition

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
    customers.filter{
        var (trueDelivered, falseDelivered) =
            it.orders.partition{ it.isDelivered }
        falseDelivered.size > trueDelivered.size
    }.toSet()