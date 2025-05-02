package db.evaluation.springboot.entity;

public class GenericResponse<T> {
	
	private Integer code;
	private String message;
	private T response;
	
	public GenericResponse() {
		
	}

	public GenericResponse(Integer code, String message, T response) {
		this.code = code;
		this.message = message;
		this.response = response;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

}
