package ceit.projeto.business;

public class PassoVO {
	
	private Long pacoteId;
	private String from;
	private String to;
	
	public PassoVO(Long pacoteId, String from, String to) {
		super();
		this.pacoteId = pacoteId;
		this.from = from;
		this.to = to;
	}

	public Long getPacoteId() {
		return pacoteId;
	}

	public void setPacoteId(Long pacoteId) {
		this.pacoteId = pacoteId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
