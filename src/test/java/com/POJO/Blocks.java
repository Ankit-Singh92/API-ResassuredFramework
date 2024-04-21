package com.POJO;

import java.util.List;

public class Blocks {
	
	private  List<Children>children;
	
	public List<Children> getChildren() {
		return children;
	}

	public void setChildren(List<Children> children) {
		this.children = children;
	}

	public static class Children{
		private String object;
		private String type;
		private Heading_2 heading_2;
		private Paragraph paragraph;
		public String getObject() {
			return object;
		}
		public void setObject(String object) {
			this.object = object;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Heading_2 getHeading_2() {
			return heading_2;
		}
		public void setHeading_2(Heading_2 heading_2) {
			this.heading_2 = heading_2;
		}
		public Paragraph getParagraph() {
			return paragraph;
		}
		public void setParagraph(Paragraph paragraph) {
			this.paragraph = paragraph;
		}
		
		//creating inner claas of Heading_2
		
		public static class Heading_2{
			
			private List<Rich_text> rich_text;

			public List<Rich_text> getRich_text() {
				return rich_text;
			}

			public void setRich_text(List<Rich_text> rich_text) {
				this.rich_text = rich_text;
			}
			
		}
		
		public static class Rich_text{
			private String type;
			private Text text;
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public Text getText() {
				return text;
			}
			public void setText(Text test) {
				this.text = test;
			}
		
		}
		public static class Text{
			private String content;
			private Link link;

			public Link getLink() {
				return link;
			}

			public void setLink(Link link) {
				this.link = link;
			}

			public String getContent() {
				return content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
		
		public static class Link{
			
			private String url;

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
		
		
		public static class Paragraph{
			
			private List<Rich_text>rich_text;

			public List<Rich_text> getRich_text() {
				return rich_text;
			}

			public void setRich_text(List<Rich_text> rich_text) {
				this.rich_text = rich_text;
			}
		}
	}
	
	
	
	
	/*
{
	"children": [
		{
			"object": "block",
			"type": "heading_2",
			"heading_2": {
				"rich_text": [{ "type": "text", "text": { "content": "Lacinato kale" } }]
			}
		},
		{
			"object": "block",
			"type": "paragraph",
			"paragraph": {
				"rich_text": [
					{
						"type": "text",
						"text": {
							"content": "Lacinato kale is a variety of kale with a long tradition in Italian cuisine, especially that of Tuscany. It is also known as Tuscan kale, Italian kale, dinosaur kale, kale, flat back kale, palm tree kale, or black Tuscan palm.",
							"link": { "url": "https://en.wikipedia.org/wiki/Lacinato_kale" }
						}
					}
				]
			}
		}
	]
}
 */
	
	
	

}
