package api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id;

    private String firstName;

    private String lastName;
    
    private String userName;
    
    private String password;
    
    @Column(name="createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    
    private Date createdAt;
    
    @Column(name="updatedAt")
    @Temporal(TemporalType.TIMESTAMP)
    
    private Date  updatedAt;
    

    public User(String firstName, String lastName, String userName, String password, Date createdAt,
			Date updatedAt) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}    
}
