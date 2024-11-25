package vn.iostar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity		//dùng để khai báo với Spring Boot rằng đây là 1 entity biểu diễn table trong db
@Data		//annotation này dẽ tự động khai báo getter and setter cho class
@AllArgsConstructor 	//dùng để khai báo constructor với tất cả các properties
@NoArgsConstructor		//ùdng để khai báo constructor rỗng không có param
public class UserInfo {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	private String roles;

}
