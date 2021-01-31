package com.knoldus.validators
import com.knoldus.models.EMAIL
import com.knoldus.validators.EMAIL_VALIDATOR
import org.scalatest.flatspec.AnyFlatSpec

class EMAIL_VALIDATOR_TEST extends AnyFlatSpec {
  val emailValidator:EMAIL_VALIDATOR=new EMAIL_VALIDATOR()
  "This Email" should "be valid"  in{

    val email:EMAIL=new EMAIL("divyansh@gmail.com")
    assert(emailValidator.isEmailValid(email))


  }
  it should " not valid " in{

    val email:EMAIL=new EMAIL("devrani@gmail..com") // two dots are not allowed.
    assert(!emailValidator.isEmailValid(email))
  }

}
