package lesson4.`Filter Map`

// Find all the different cities the customers are from
fun Shop.getCustomerCities(): Set<City> =
    customers.map{ it.city }.toSet()

// Find the customers living in a given city
fun Shop.getCustomersFrom(city: City): List<Customer> =
    customers.filter{ it.city == city }

/*
* С помощью filter мы отобрали только customer с
* заданным городом.
* С помощью map мы создали множество всех городов.
*/