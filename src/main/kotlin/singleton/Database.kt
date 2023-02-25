package singleton

class Database() {

    private final val database: Database = Database()

    //코틀린은 스테틱메서드가 없음
    fun getMyInstance():Database {
        return this.database
    }

     fun query( query:String) {

    }



}