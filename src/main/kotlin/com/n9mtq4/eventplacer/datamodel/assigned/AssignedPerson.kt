package com.n9mtq4.eventplacer.datamodel.assigned

import com.n9mtq4.eventplacer.datamodel.info.Person

/**
 * Created by will on 12/2/2017 at 10:21 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * Class to store information on a person who has been
 * assigned to an event.
 * 
 * @param person the person
 * @param eventAssignments the list of event assignments that the person is on
 * */
data class AssignedPerson(val person: Person, val eventAssignments: AssignedEventList) {
}
