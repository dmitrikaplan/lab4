package Battle

import Persons.Bandits

class Help(private val x1 : Bandits,private val x2 : Bandits,private val leader : Bandits) : Battle {

    override fun displayEvent() {

        println("Бандиты ${x1.toString()} и ${x2.toString()} бросились выручать ${leader.toString()}");

    }
}