import Objects.Objects

fun createObject(name : String) = object: Objects() {

    override val name = name;

    init{

        println("$name присоединился к истории");

    }

    override fun toString(): String {

        return name;

    }

}
