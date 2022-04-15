package Persons

data class Detectives(override val name : String)  : Persons.Enemies(){

    override val weapon : String = "Glock 18"

    init{
        println("Detective $name присоединился к истории")
    }

    override fun getClass() : String{
        return "Detectives";
    }

    override fun toString() : String{
        return "" + name;
    }

}