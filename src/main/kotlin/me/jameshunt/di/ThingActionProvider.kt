package me.jameshunt.di

import me.jameshunt.m.ActionString
import me.jameshunt.m.SubAction
import me.jameshunt.m.ThingAction

class ThingActionProvider(private val thingName: String) {

    fun get(): ThingAction {

        val actionString = ActionString(thingName)
        val subAction = SubAction()

        return ThingAction(actionString = actionString, subAction = subAction)
    }
}