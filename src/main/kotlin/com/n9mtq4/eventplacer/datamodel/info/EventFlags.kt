package com.n9mtq4.eventplacer.datamodel.info

/**
 * Created by will on 11/28/2017 at 7:12 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * Typealias for list of event flags
 * */
typealias EventFlagList = List<EventFlag>

/**
 * The possible event flags in a list
 * */
// TODO: i don't like the name of this
val DEFAULT_FLAGS: EventFlagList = listOf(BuildingEvent(), RegularEvent(), AlternateEvent())

/**
 * The superclass of all event flags.
 * Has the name of the flag, and an apply on event
 * function.
 * 
 * @param name the name of the flag
 * */
open class EventFlag(val name: String) {
	
	open fun applyOnEvent(eventInfo: EventInfo) {}
	
}

/**
 * [EventFlag] that indicates that this event is 
 * a building event.
 * */
class BuildingEvent : EventFlag("Building Event")

/**
 * [EventFlag] that indicates that this event is
 * an option for regular team members to do.
 * */
class RegularEvent : EventFlag("Regular Event")

/**
 * [EventFlag] that indicates that this event is
 * an option for alternate team members to do.
 * */
class AlternateEvent : EventFlag("Alternate Event")
