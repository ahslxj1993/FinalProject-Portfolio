package com.Pet_Topia.domain;

public class MailVO {
	private String from= "ahslxj1993@naver.com"; //mail.properties에서 작성한 아이디에 해당하는 이메일 주소 작성합니다.
	private String to;
	private String subject="반려동물 서비스 제휴 사이트 <펫토피아> 회원 가입을 축하드립니다!";
	private String content="회원 가입을 축하드립니다. - 내용";
	
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
				
	
	
}
