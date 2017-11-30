package com.n9mtq4.eventplacer.datamodel

/**
 * Created by will on 11/28/2017 at 7:18 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * Data structure for storing information on a person
 * 
 * @param name the person's name
 * @param grade the grade the person is in
 * @param availableBlocks what time blocks the person can practice in
 * @param eventRanking the ranking of all this person's events
 * @param availableCompos the competitions that this person can go to
 * */
// TODO: add support for a friends list. gives them a higher chance to be on events with people they like
data class Person(val name: String, val grade: Int, val availableBlocks: PracticeBlockList, val eventRanking: String, val availableCompos: CompetitionList) {
	
	/**
	 * Can this person go to states?
	 * 
	 * @return boolean yes or no
	 * */
	fun canGoToStates(): Boolean {
		availableCompos.firstOrNull { it.type == CompetitionType.STATES }?.let { 
			return canGoToCompetition(it)
		}
		throw NoSuchElementException("There is no state competition in the person's list.")
	}
	
	/**
	 * Can this person go to a competition?
	 * Searches through [availableCompos] to see if
	 * [competition] is in it
	 * 
	 * @param competition the competition to search for
	 * @return boolean yes or no
	 * */
	fun canGoToCompetition(competition: Competition): Boolean {
		return competition in availableCompos
	}
	
}
