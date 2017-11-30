package com.n9mtq4.eventplacer.datamodel

/**
 * Created by will on 11/28/2017 at 7:24 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * Data structure for storing how a person ranked some event.
 * 
 * @param eventInfo the info of the event they ranked
 * @param want the score they gave it filling out the survey
 * @param adjustedWant the z-score of this event compared to the rest of them the person ranked
 * */
data class EventRanking(val eventInfo: EventInfo, val want: Double, val adjustedWant: Double)


