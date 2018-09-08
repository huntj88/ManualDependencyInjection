package me.jameshunt.di

import me.jameshunt.m.*

class Component private constructor(private val thingName: String) {

    fun inject(thing: Thing) {

        val thingDependencyProvider = ThingDependencyProvider(thingName)
        thing.thingDependency = thingDependencyProvider.get()
    }

    data class Builder(val thingName: String) {

        fun build(): Component {
            return Component(thingName)
        }
    }
}