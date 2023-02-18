package singleton

class SingletonApplication {
    fun main () {
        val foo = Database().getMyInstance()
        foo.query("SELECT * FROM ...")
    }
}