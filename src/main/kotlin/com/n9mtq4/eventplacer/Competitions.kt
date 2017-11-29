package com.n9mtq4.eventplacer

/**
 * Created by will on 11/28/2017 at 7:20 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * typealias for a list of competitions
 * */
typealias CompetitionList = List<Competition>

/**
 * Data structure of competitions
 * 
 * @param name name of the competition
 * @param type the type. See [CompetitionType]
 * @see CompetitionType
 * */
data class Competition(val name: String, val type: CompetitionType) {
	
	
	
} 

/**
 * The possible types of competitions.
 * 
 * Contains: NATIONALS, STATES, REGIONAL, INVITATIONAL
 * 
 * @param importance how important it is that people can go to it.
 * @see Competition
 * */
enum class CompetitionType(val importance: Int) {
	
	NATIONALS(0),
	STATES(1),
	REGIONAL(2),
	INVITATIONAL(3)
	
}
