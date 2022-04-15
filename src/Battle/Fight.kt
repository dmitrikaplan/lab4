package Battle

import Exceptions.UnfairFight
import Persons.Bandits
import Persons.Detectives
import Persons.Police

class Fight(private val x1 : Bandits, private val x2 : Bandits, private val x3 : Bandits, private val y1 : Police,private val y2 : Police, private val y3 : Police) : Battle {

    val listOfPersons = listOf(x1, x2, x3, y1, y2, y3);
    override fun displayEvent() {
        for(i in 1..6) {

            if(listOfPersons.size % 2 != 0) throw UnfairFight();
            when {

                i % 2 == 0 -> {

                    val a = (0..2).random();
                    val b = (3..5).random();
                    println("${listOfPersons[a].toString()} ударил ${listOfPersons[b].toString()}");

                }

                else -> {

                    val a = (3..5).random();
                    val b = (0..2).random();
                    println("${listOfPersons[a].toString()} ударил ${listOfPersons[b].toString()}");

                }

            }

        }

    }

}