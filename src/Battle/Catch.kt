import Battle.*

class Catch(private val police : String, private val detective : String, private val bandits : String) : Battle {

    override fun displayEvent() {

        println("$police и $detective ловят $bandits");

    }

}