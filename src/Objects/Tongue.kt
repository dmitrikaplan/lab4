package Objects

class Tongue(name : String) : Objects() {

    override val name : String = name;

    init{

        println("$name присоединился к истории");

    }

    fun displayEvent(){

        println("Вверху снова высунулся $name")

    }

    override fun toString(): String {
        return name;
    }

}