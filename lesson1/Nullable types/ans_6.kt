package lesson1.`Nullable types`

fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
) {
    if (message == null) return
    var email : String = client?.personalInfo?.email ?: return
    mailer.sendMessage(email, message)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

/*
* В качестве решения я использовал оператор elvis: если
* client будет null, или personalInfo будет null, или email будет null,
* то функция закончит работу (return).
*/