package Persons

data class Bandits( override val name : String) : Persons.Enemies(){

    override val weapon : String = "AK 47";

    init{
        println("Bandit $name присоединился к истории")
    }

    override fun toString() : String{
        return "" + name;
    }

    override fun getClass() : String{
        return "Bandits";
    }

}