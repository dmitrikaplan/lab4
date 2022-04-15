package Battle

import ExceptionMoney
import Persons.Goat

class GoatPay(private val goat : Goat, private val cntSantiks : Int) : Battle{

    inner class Transacton{

        fun pay(water : Int, soap : Int, towel : Int){

            if ((cntSantiks - water - soap - towel) < 0) throw ExceptionMoney()
            println("$goat смог умыться");

        }

    }


    override fun displayEvent() {

        println("$goat собирается заплатить за воду, мыло и полотенце");

    }
}