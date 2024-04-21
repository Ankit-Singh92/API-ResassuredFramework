package com.POJO;

import java.util.List;

public class DataBase {
/*
 {
    "sorts": [
        {
        "property": "Name",
        "direction": "ascending"
        }
    ]
}
 * 
 */
     private List<Sorts> sorts;

	public List<Sorts> getSorts() {
		return sorts;
	}

	public void setSorts(List<Sorts> sorts) {
		this.sorts = sorts;
	}
	public static class Sorts{
		private String property;
        private String direction;
		public String getProperty() {
			return property;
		}
		public void setProperty(String property) {
			this.property = property;
		}
		public String getDirection() {
			return direction;
		}
		public void setDirection(String direction) {
			this.direction = direction;
		}	
		
	}
}

