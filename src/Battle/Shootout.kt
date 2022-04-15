package Battle

import Persons.Bandits
import Persons.Police

class Shootout(private val x1 : Bandits, private val x2 : Bandits, private val x3 : Bandits, private val y1 : Police,private val y2 : Police, private val y3 : Police) : Battle {

    private val listOfPersons = listOf(x1, x2, x3, y1, y2, y3);
    override fun displayEvent() {
        for(i in 1..6) {

            val a = (0..5).random();
            println("${listOfPersons[a].toString()} использует ${listOfPersons[a].weapon}");
        }


    }
}
