package me.jameshunt.di

import me.jameshunt.m.ThingDependency
import me.jameshunt.m.ThingHelper
import me.jameshunt.m.ThingRepo

class ThingDependencyProvider(private val thingName: String) {

    fun get(): ThingDependency {
        val sub0 = ThingActionProvider(thingName = thingName).get()
        val sub1 = ThingHelper()
        val sub2 = ThingRepo()

        return ThingDependency(
                thingAction = sub0,
                thingHelper = sub1,
                thingRepo = sub2
        )
    }
}