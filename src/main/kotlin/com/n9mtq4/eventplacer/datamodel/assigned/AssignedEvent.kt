package com.n9mtq4.eventplacer.datamodel.assigned

import com.n9mtq4.eventplacer.datamodel.info.EventInfo
import com.n9mtq4.eventplacer.datamodel.info.PersonList
import com.n9mtq4.eventplacer.datamodel.info.PracticeBlockList
import com.n9mtq4.eventplacer.datamodel.info.newPersonList

/**
 * Created by will on 12/2/2017 at 10:22 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * Type alias for a list of event assignments
 * */
typealias AssignedEventList = List<AssignedEvent>

/**
 * A data object for event assignments.
 * 
 * @param eventInfo the event that this event assignment corresponds to
 * @param people a list of the people that have been put on this event
 * @param possibleBlocks a list of possible blocks that this event could practice on
 * */
data class AssignedEvent(val eventInfo: EventInfo, val people: PersonList, var possibleBlocks: PracticeBlockList, val coaches: PersonList = newPersonList())
