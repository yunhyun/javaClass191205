package javaClass_191217;

public class Ex04_NaverMember {
	// 아이디, 비밀번호, 이름, 생년월일, 성별, 이메일, 휴대전화
	private String id;
	private String password;
	private String name;
	private String birth;
	private String gender;
	private String email;
	private String phone;
	
	// id 필드값을 저장하고 가져오고 싶을 때 
	// getter, setter 메소드
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Ex04_NaverMember [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth
				+ ", gender=" + gender + ", email=" + email + ", phone=" + phone + "]";
	}

	public Ex04_NaverMember(String id, String password, String name, String birth, String gender, String email,
			String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	
	// 기본 생성자 선언
	Ex04_NaverMember() {
		
	}
	
	// 모든 필드를 매개변수로하는 생성자 선언 후 
	// main 클래스에서 신규 회원을 하나 등록해보세요 
	
}













