package Exceptions

class UnfairFight : StackOverflowError() {

    override fun toString(): String {
        return "Нечестный бой"
    }
    override fun printStackTrace() {
        super.printStackTrace()
    }

    override val message: String?
        get() = super.message;

}
