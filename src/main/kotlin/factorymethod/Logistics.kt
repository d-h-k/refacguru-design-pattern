package factorymethod

import factorymethod.component.Delivery

interface Logistics {
    fun deliveryFactory(): Delivery
    fun logisticsOperations1() {}
    fun logisticsOperations2()
}


