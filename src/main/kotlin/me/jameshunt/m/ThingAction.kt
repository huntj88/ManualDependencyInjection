package me.jameshunt.m

// constructor injection
class ThingAction(private val actionString: ActionString, private val subAction: SubAction) {

    fun doAction() {
        println("i did an action: ${actionString.getCoolString()}")

        subAction.doSubAction()
    }
}

// constructor injection
class ActionString(private val thingName: String) {
    fun getCoolString(): String = "$thingName is super cool"
}

class SubAction {
    fun doSubAction() {
        println("${this.javaClass.simpleName} did an action")
    }
}












