package singleton

class Database {

    val database: Database

    constructor() {
        this.database = Database()
    }

    //코틀린은 스테틱메서드가 없음
    fun getMyInstance():Database {
        return this.database
    }

     fun query( query:String) {

    }



}