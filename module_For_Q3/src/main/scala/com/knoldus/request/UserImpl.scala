package com.knoldus.request

import com.knoldus.model.User
import com.knoldus.validator.UserValidator

class UserImpl(userValidator: UserValidator) {
  def createUser(user: User): Option[String] = {
    if (userValidator.isValid(user)) return Option(user.emailId)
    None
  }
}