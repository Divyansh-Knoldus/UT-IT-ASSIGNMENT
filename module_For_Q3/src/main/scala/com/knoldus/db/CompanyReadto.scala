package com.knoldus.db

import com.knoldus.model.Company

import scala.collection.immutable.HashMap

class CompanyReadto {


  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val hpCompany: Company = Company("hp", "hp@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "hp" -> hpCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}