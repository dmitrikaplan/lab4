class ExceptionMoney : Exception() {

    override fun toString(): String {
        return "too little money"
    }
    override fun printStackTrace() {
        super.printStackTrace()
    }

    override val message: String?
        get() = super.message;

}