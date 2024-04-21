package com.POJO;

import java.util.List;

public class PostQueryDataBase {

	/*
{
    "filter": {
        "property": "Status",
        "select": {
            "equals": "Reading"
        }
    },
    "sorts": [
        {
        "property": "Name",
        "direction": "ascending"
        }
    ]
}
	 */

	private Filter filter;
	private List<Sorts> sorts;

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	public List<Sorts> getSorts() {
		return sorts;
	}

	public void setSorts(List<Sorts> sorts) {
		this.sorts = sorts;
	}

	// create inner class of Filter
	public static class Filter {
		private String property;
		private Select select;

		public String getProperty() {
			return property;
		}

		public void setProperty(String property) {
			this.property = property;
		}

		public Select getSelect() {
			return select;
		}

		public void setSelect(Select select) {
			this.select = select;
		}

		

	}
	// created inner class of Select
			public static class Select {

				private String equals;

				public String getEquals() {
					return equals;
				}

				public void setEquals(String equals) {
					this.equals = equals;
				}
			}
//creating inner class of Sorts
	public static class Sorts{
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
		private String property;
		private String direction;
		
		
	}
	
}
