package com.knoldus.request

import com.knoldus.model.Employee
import com.knoldus.validator.EmployeeValidator

class EmployeeImpl(employeeValidator: EmployeeValidator) {
  def createEmployee(employee: Employee): Option[String] = {
    if (employeeValidator.employeeIsValid(employee)) Option(employee.emailId)
    else None
  }
}