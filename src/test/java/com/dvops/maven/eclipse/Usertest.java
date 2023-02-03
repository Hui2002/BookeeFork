package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Usertest {
	
	User user = new User("Avatar.png", "kim@mail.com" , "kimmy" , "P@ssword", "female", "12 Orchard road" );

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetProfilePicture() {
		//Arrange
		String expected = "Avatar.png";
		//Act
		String actual = user.getProfilePicture();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetEmail() {
		//Arrange
		String expected = "kim@mail.com";
		//Act
		String actual = user.getEmail();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetUsername() {
		//Arrange
		String expected = "kimmy";
		//Act
		String actual = user.getUsername();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetPassword() {
		//Arrange
		String expected = "P@ssword";
		//Act
		String actual = user.getPassword();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetGender() {
		//Arrange
		String expected = "female";
		//Act
		String actual = user.getGender();
		//Assert
		assertEquals(expected , actual);
	}

	@Test
	void testGetAddress() {
		//Arrange
		String expected = "12 Orchard road";
		//Act
		String actual = user.getAddress();
		//Assert
		assertEquals(expected , actual);
	}

}
