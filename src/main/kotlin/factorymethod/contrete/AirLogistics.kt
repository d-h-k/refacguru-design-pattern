package factorymethod.contrete

import factorymethod.Logistics
import factorymethod.component.Delivery

class AirLogistics :Logistics{
    override fun deliveryFactory(): Delivery {
        TODO("Not yet implemented")
    }

    override fun logisticsOperations2() {
        TODO("Not yet implemented")
    }
}