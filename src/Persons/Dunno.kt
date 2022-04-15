package Persons

class Dunno(override val name : String) : Persons.Person() {

    override fun toString(): String {

        return name;

    }

}