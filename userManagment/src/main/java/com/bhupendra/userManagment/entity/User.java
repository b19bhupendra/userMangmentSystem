
package com.bhupendra.userManagment.entity;


import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

	@Id
	private String id;
	private String name;
	private String email;
	private LocalDateTime createdAt;
}
