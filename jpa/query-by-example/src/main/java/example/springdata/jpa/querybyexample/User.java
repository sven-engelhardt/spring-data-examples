/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.springdata.jpa.querybyexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * Sample user class.
 *
 * @author Mark Paluch
 */
@Entity
@Data
public class User {

	@Id @GeneratedValue //
	private Long id;
	private String firstname;
	private String lastname;
	private Integer age;

	public User() {
		super();
	}

	public User(String firstname, String lastname, Integer age) {

		super();

		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

}