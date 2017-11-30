package com.n9mtq4.eventplacer.datamodel

/**
 * Created by will on 11/28/2017 at 7:08 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * Typealias for a list of days
 * */
typealias DayList = List<Day>

/**
 * A list of possible days that
 * practice blocks can be on
 * 
 * Contains: SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
 * */
enum class Day {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
}

/**
 * Turns a string list of days (separated by commas) to a 
 * [DayList] of the days that the string contains.
 * 
 * @receiver a string of days separated by commas
 * @return a list of all the days that the string contains
 * */
fun String.stringToDayList(): DayList {
	return this
			.split(",")
			.map { it.trim().toUpperCase() }
			.filter { it.isNotEmpty() }
			.map { Day.valueOf(it) }
}
