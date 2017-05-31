package com.mak.sort.bubblesort

object BubbleSort {
    def sort(a:Array[Double]) : Unit = {
    	for (i <- 0 until a.length-1){
    		for (j <- 0 until a.length-1-i){
    			if (a(j) > a(j+1)){
    				val tmp = a(j)
    				a(j) = a(j+1)
    				a(j+1) = tmp
    			}
    		}
    	}
    } 
}