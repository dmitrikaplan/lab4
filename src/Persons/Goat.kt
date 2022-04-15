package Persons

class Goat(override val name : String) : Persons.Person() {

    override fun toString(): String {

        return name;

    }

    fun say(){

        println("$name сказал:");

    }

    fun washUp(){

        println("$name подошел к рукомойнику");

    }
}