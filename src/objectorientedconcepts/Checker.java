package objectorientedconcepts;

import java.util.Comparator;
	
	class Checker implements Comparator<Player> {
	    @Override
	    public int compare(Player a, Player b) {
	        // Compare by score in decreasing order
	        if (a.score != b.score) {
	            return Integer.compare(b.score, a.score);
	        } else {
	            // If scores are equal, compare by name alphabetically
	            return a.name.compareTo(b.name);
	        }
	    }
	}


