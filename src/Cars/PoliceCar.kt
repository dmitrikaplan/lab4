package Cars

class PoliceCar(car: TypeOfCar) : Cars{

    init{

        println("Полицейские сели в $car и начали преследование");

    }

    override fun exitCar(){

        println();
        println("Полицейские вышли из машина");

    }

}