package com.knoldus.validator

import com.knoldus.db.CompanyReadto
import com.knoldus.model.{Company, User}

class UserValidator {
  def isValid(user: User): Boolean = {
    // company should exist in db
    val companyReadDto = new CompanyReadto()
    val dbResult: Option[Company] = companyReadDto.getCompanyByName(user.companyName)

    // email should be valid
    val emailValidator = new EmailValidator()
    val emailValidatorResult = emailValidator.emailIdIsValid(user.emailId)

    if (dbResult.isDefined && emailValidatorResult) return true

    false
  }
}