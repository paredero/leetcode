package leetcode.selfcrossing;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean isSelfCrossing(int[] x) {
        Set<Coordinate> path = new HashSet<Coordinate>();
        Coordinate c = new Coordinate(0,0);
        path.add(c);
        Direction direction = Direction.NORTH;
        for (int i = 0; i< x.length; i ++) {
        	for (int j = 0;j<x[i];j++) {
        		c = c.walk(direction);
        		if (path.contains(c)) {
        			return true;
        		}
        		path.add(c);
        	}
        	direction = direction.nextDirection();
        }
        return false;
    }
}
enum Direction {
	NORTH {
		@Override
		public Direction nextDirection() {
			return WEST;
		}
	}, WEST {
		@Override
		public Direction nextDirection() {
			return SOUTH;
		}
	}, SOUTH {
		@Override
		public Direction nextDirection() {
			return EAST;
		}
	}, EAST {
		@Override
		public Direction nextDirection() {
			return NORTH;
		}
	};
	public abstract Direction nextDirection();
}
class Coordinate {
	int x;
	int y;
	public Coordinate(
			int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}


	public Coordinate walk(Direction direction) {
		switch (direction) {
		case NORTH:
			return new Coordinate(this.x, this.y-1);
		case WEST:
			return new Coordinate(this.x-1, this.y);
		case SOUTH:
			return new Coordinate(this.x, this.y+1);
		case EAST:
			return new Coordinate(this.x+1, this.y);	
			}
		return null;
	}
}