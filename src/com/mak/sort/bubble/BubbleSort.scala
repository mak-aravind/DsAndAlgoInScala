package com.mak.sort.bubble

object BubbleSort {
    def sort(a:Array[Double]) : Unit = {
    	for (i <- 0 until a.length){
    		for (j <- 0 until a.length-i){
    			if (a(j) > a(j+1)){
    				val tmp = a(j)
    				a(j) = a(j+1)
    				a(j+1) = tmp
    			}
    		}
    	}
    } 
}