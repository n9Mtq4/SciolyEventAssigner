package com.n9mtq4.eventplacer.datamodel.info

/**
 * Created by will on 12/2/2017 at 10:30 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * Type alias for a list of coaches
 * */
typealias CoachesList = List<Coach>

/**
 * Creates a new coach list with the coaches as arguments
 * added to that new list by default.
 *
 * @param coaches the people to initially add to this new list
 * */
internal fun newCoachList(vararg coaches: Coach): CoachesList = coaches.toList()

/**
 * Data structure for storing coach data.
 * 
 * @param name the coaches name
 * @param events what event the coach is coaching
 * @param practiceBlockList what events the coach can come to practice
 * */
data class Coach(val name: String, val events: EventInfoList, val practiceBlockList: PracticeBlockList)
