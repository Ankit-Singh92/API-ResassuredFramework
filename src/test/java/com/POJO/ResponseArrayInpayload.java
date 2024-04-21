package com.POJO;

import java.util.List;
/*
 * {
	"method": "get",
	"path": "/hello-world-delayed",
	"responses": [
		{
			"status": 200,
			"content": "Hello world!",
			"content_type": "text/plain",
			"delay": 3000
		}
	]
}
*/


public class ResponseArrayInpayload {
	private String method;
	private String path;
	private List<Responses> responses;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<Responses> getResponses() {
		return responses;
	}

	public void setResponses(List<Responses> responses) {
		this.responses = responses;
	}

	public static class Responses {
		private int status;
		private String content;
		private String content_type;
		private int delay;

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getContent_type() {
			return content_type;
		}

		public void setContent_type(String content_type) {
			this.content_type = content_type;
		}

		public int getDelay() {
			return delay;
		}

		public void setDelay(int delay) {
			this.delay = delay;
		}

	}

}
