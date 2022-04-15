package Objects

class Screen(name : String) : Objects() {

    override val name : String = name;

    fun light(){

        println("$name тот час же засветился, и на нем замелькали кадры фильма");

    }

    fun displayEvent(){

        println("$name замелькал по-прежнему")

    }

}