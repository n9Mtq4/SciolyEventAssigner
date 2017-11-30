package com.n9mtq4.eventplacer.datamodel

/**
 * Created by will on 11/28/2017 at 7:08 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * Typealias for a list of practice blocks
 * */
typealias PracticeBlockList = List<PracticeBlock>

/**
 * A data structure for storing information about
 * practice blocks that they team holds.
 * 
 * @param day what day it is on
 * @param timeSlot what timeSlot it happens
 * */
data class PracticeBlock(val day: Day, val timeSlot: Int) {
	
	/**
	 * Checks to see if this block conflicts with the
	 * other block.
	 * 
	 * @param other the other block to check with
	 * @return true if conflicts, false otherwise
	 * */
	fun conflictsWith(other: PracticeBlock): Boolean {
		// currently only a not equals, but may change when things get more complicated
		return this != other
	}
	
}
