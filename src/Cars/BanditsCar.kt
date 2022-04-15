package Cars

class BanditsCar(car : TypeOfCar) : Cars {

    init{

        println("Бандиты сели в $car и начали уходить от погони");

    }

    override fun exitCar(){

        println();
        println("Бандиты вышли из машины");

    }

}