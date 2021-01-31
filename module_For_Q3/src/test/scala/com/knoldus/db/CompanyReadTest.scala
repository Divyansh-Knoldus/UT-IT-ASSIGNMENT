package com.knoldus.db

import org.scalatest.flatspec.AnyFlatSpec

class CompanyReadTest extends AnyFlatSpec {

  behavior of "getCompanyByName method"

  val companyReadDto: CompanyReadto = new CompanyReadto()

  it should "return the company object from db" in {

    val result = companyReadDto.getCompanyByName("Knoldus")

    assert(result.isDefined)

  }

  it should "not return the company object as it does not exists in db" in {

    val result = companyReadDto.getCompanyByName("xyz")

    assert(result.isEmpty)

  }

}