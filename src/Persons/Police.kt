package Persons

data class Police(override val name : String) : Persons.Enemies() {

    override val weapon : String = "M4A1-S";

    init{
        println("Policeman $name присоединился к истории");
    }

    override fun toString(): String {
        return "" + name;
    }

    override fun getClass() : String{
        return "Police";
    }

    fun Grab(person : Bandits){

        println();
        println("Полицейские пытаются схватать $person");

    }
}