package lesson4.Introduction

fun Shop.getSetOfCustomers(): Set<Customer> =
    customers.toSet()

/*
* Класс Shop содержит properties customers типа List<>,
* а значит, чтобы сдлеать множество Set<Customer> нужно применить
* встроенный метод toSet().
*/