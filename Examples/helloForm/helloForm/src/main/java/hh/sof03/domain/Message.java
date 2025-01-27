package hh.sof03.domain;

public class Message {
	
	private Long id;
	
   
	private String msgText;
    
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
	public String getMsgText() {
		return this.msgText;
	}
	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}
	
	@Override
	public String toString() {
		return "Message [msg=" + this.msgText + "]";
	}
}
