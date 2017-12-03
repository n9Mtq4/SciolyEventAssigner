package com.n9mtq4.eventplacer

import com.n9mtq4.eventplacer.datamodel.info.EventInfo
import kotlinx.html.*
import kotlinx.html.dom.create
import kotlin.browser.document

/**
 * Created by will on 11/28/2017 at 9:14 PM.
 *
 * @author Will "n9Mtq4" Bresnahan
 */

fun main(args: Array<String>) {
	renderNotDoneYetPage()
}

fun renderNotDoneYetPage() {
	
	println("Rendering page")
	
	val myDiv = document.create.div("panel") { 
		h1 {
			id = "pid"
			+"n9Mtq4's Science Olympiad Event Assigner"
		}
		p {
			+("This will be a place to get the computer to do the complicated balancing of practice " +
					"blocks, what events people want, and how much people can work on those events.")
		}
		h4 { 
			+"Coming Soon!"
		}
		
		div {
			val event = EventInfo("WIDI", 2, listOf())
			val str = "Test Event String: $event"
			+str
		}
		
	}
	document.getElementById("container")!!.appendChild(myDiv)
	
}
