package Objects

class TV(name : String) : Objects() {

    override val name : String = name;
    init{

        println("Телевизор $name вдруг выключился");

    }
}