package com.knoldus.validator


import com.knoldus.model.User
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends AnyFlatSpec {

  val userValidator = new UserValidator()

  "User" should "be valid as company exists and email is valid" in {

    val testUser: User = User("DIVYANSH",
      "div@knoldus.com",
      "Knoldus")

    val result = userValidator.isValid(testUser)

    assert(result)

  }

  it should "not be valid as email is not valid" in {

    val testUser: User = User("DIVYANSH",
      "div$123@hp.com",
      "hp")

    val result = userValidator.isValid(testUser)

    assert(!result)

  }




  it should "not be valid as email is not valid and company doesn't exists" in {

    val testUser: User = User("DIVYANSH",
      "div$123@hp.com",
      "hp")

    val result = userValidator.isValid(testUser)

    assert(!result)

  }

}