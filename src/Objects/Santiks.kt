package Objects

class Santiks(override val name : String) : Objects(){

    init {

        println("$name присоединился к истории\n");

    }
    fun displayEvent(obj : Objects){

        println("$name исчезли в утробе ${obj.name}а\n")

    }
}
