package Battle

import Cars.TypeOfCar

class CallHelp(private val car1 : TypeOfCar, private val car2 : TypeOfCar) : Battle{

    override fun displayEvent() {

        println("Полицейские вызвали на подмогу $car1 и $car2");

    }

}