package com.n9mtq4.eventplacer

import kotlin.math.sqrt

/**
 * Created by will on 11/29/2017 at 10:20 PM.
 * 
 * A file that contains functions for the statistical manipulation
 * of numbers.
 * 
 * @author Will "n9Mtq4" Bresnahan
 */

/**
 * Converts a list of points into a list of z-scores.
 * 
 * @param list a list of doubles of points
 * @return a list of doubles of z-scores
 * */
fun zscores(list: List<Double>): List<Double> {
	
	val mean = list.average()
	val stdDev = sampleStdDeviation(list)
	
	return list.map { zscorePoint(it, mean, stdDev) }
	
}

/**
 * Get the zscore of a value based off the mean and standard deviation.
 * 
 * @param value the value of the point
 * @param mean the mean of all the points
 * @param stdDev the standard deviation of all the points
 * @return the z-score of the point
 * */
fun zscorePoint(value: Double, mean: Double, stdDev: Double): Double = (value - mean) / stdDev

/**
 * Calculates the sample standard deviation of a list of
 * points.
 * 
 * @param list a list of doubles of points
 * @return the sample standard deviation
 * */
fun sampleStdDeviation(list: List<Double>): Double {
	
	val mean = list.average()
	val radicand = list.map { it - mean }.map { it * it }.sum() / (list.size - 1)
	
	return sqrt(radicand)
	
}
