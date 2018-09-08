package me.jameshunt.m

import me.jameshunt.di.Component


fun main(vararg cow: String) {
    Thing()
}



// kinda like an activity or fragment,
// lets pretend we need to do member injection here

class Thing {

    // @Inject (if this was dagger)
    lateinit var thingDependency: ThingDependency

    init {
        Component
                .Builder("wow")
                .build()
                .inject(thing = this)

        doCoolStuff()
    }

    private fun doCoolStuff() {
        thingDependency.doYourThing()

        println(thingDependency.getCoolString())
    }
}