package Battle

import Persons.Dunno
import Persons.Goat

class Fail(private val dunno : Dunno, private val goat : Goat) : Battle{

    override fun displayEvent(){

        println("$dunno и $goat не смогли досмотреть этот захватывающий фильм до конца");

    }
}