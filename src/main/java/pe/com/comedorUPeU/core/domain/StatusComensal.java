package pe.com.comedorUPeU.core.domain;

public class StatusComensal extends BaseType{
	
	private static final long serialVersionUID = 1L;

//	public static String COMENSAL_ACT = "COMENSAL_ACT";
//	public static String COMENSAL_INACT = "COMENSAL_INACT";
	

	public enum Status {
		COMENSAL_ACT("COMENSAL_ACT"), COMENSAL_INACT("COMENSAL_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
