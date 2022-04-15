package Battle

import Persons.Persons

class WatchFilm(private val x1 : Persons.Person, private val x2 : Persons.Person) : Battle {


    override fun displayEvent() {

        println("${x1.name} и ${x2.name} смотрели фильм с середины и никак не могли понять, что в нем происходит.\nИм очень хотелось выяснить этот вопрос");

    }
}