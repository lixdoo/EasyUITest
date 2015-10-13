package lixdoo.practise.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user" ,catalog="easyui")
public class UserEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="id",unique =true,nullable = false) //主键
	private Integer id;
	private String cardId;
	private String name;
	private String age;
	private Boolean gender;
	
	public UserEntity(){
		
	}
	//minimal constructor
	public UserEntity(String cardId,String name,String age){
		this.cardId = cardId;
		this.name = name;
		this.age= age;
		
	}
	//full constructor
	public UserEntity(String cardId,String name,String age,Boolean gender ){
		this.cardId = cardId;
		this.name = name;
		this.age= age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	
	
}
