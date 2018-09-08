package me.jameshunt.m

// constructor injection
class ThingDependency(
        private val thingAction: ThingAction,
        private val thingHelper: ThingHelper,
        private val thingRepo: ThingRepo
) {

    fun doYourThing() {
        thingAction.doAction()
        thingHelper.help()
    }

    fun getCoolString(): String = thingRepo.getSomeString()
}