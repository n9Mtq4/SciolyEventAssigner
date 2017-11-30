package com.n9mtq4.eventplacer.datamodel

/**
 * Created by will on 11/28/2017 at 7:11 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * Data structure to store and check event conflicts.
 * Events can conflict if they meet at the same time.
 * 
 * Stores and verifies the relationships of these
 * conflicts.
 * 
 * @param eventNames A list of a list of event names that meet in the same block.
 * */
class EventIncompatibilities(val eventNames: List<List<EventInfo>>) {
	
	/**
	 * Checks to make sure the two events don't practice in the same block.
	 * 
	 * @param eventInfo the first event
	 * @param eventInfo1 the second event
	 * @return true if the events conflict, false otherwise
	 * */
	fun areCompatable(eventInfo: EventInfo, eventInfo1: EventInfo): Boolean {
		
		eventNames.forEach { conflicting ->
			
			// do the two events appear in a conflict list?
			val firstInList = conflicting.any { it == eventInfo }
			val secondInList = conflicting.any { it == eventInfo1 }
			
			// if they are both contained in the same list entry, they meet at the same time
			if (firstInList && secondInList) return false
			
		}
		
		// checked everything and found no conflicts. all good!
		return true
		
	}
	
}

/**
 * Data structure to store event information.
 * 
 * Note about maxTeamSize: this is the max number of people on each team. So,
 * if this event is a regular and alternate event and is two per team, this number
 * should be 2, **not 4**
 * 
 * @param name the name of the event, should match with name given to [EventIncompatibilities]
 * @param maxTeamSize the max number of people this event can have
 * @param flags Other information about the event. See [EventFlag]
 * */
data class EventInfo(val name: String, val maxTeamSize: Int, val flags: EventFlagList) {
	
}
