package Battle

import Objects.Objects
import Persons.Bandits

class Steal(private val x1 : Bandits, private val x2 : Bandits, private val x3 : Bandits, private val x4 : Objects) : Battle{

    override fun displayEvent() {

        println("\nБандиты $x1 , $x2 и $x3 украли $x4");

    }


}