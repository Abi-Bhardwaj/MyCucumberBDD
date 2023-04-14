Feature: Add to cart

#To run using CLI -> (do -> mvn clean test) then -> mvn exec:java -Dexec.classpathScope=test -Dexec.mainClass=io.cucumber.core.cli.Main
#To Run on cli with mvn clean test using multiple plugins (comma separated) -> mvn clean test "-Dcucumber.plugin=pretty,html:target/cucumber.html" 

  @Smoke
  	Scenario Outline: Add one quantity from store
  		Given Im on store page
  		When I add a "<product_name>" to the cart
  		Then I should see 1 "<product_name>" in the cart
  		Examples:
  		 |product_name|
  		 |Blue Shoes	|
  		 |Anchor Bracelet|
  
  #@Scenario_Outline
  #	Scenario Outline: Add one quantity from store - examples
  #		Given Im on store page
  #		When I add a "<product_name>" to the cart
  #		Then I should see 1 "<product_name>" in the cart
  #	Examples: 
    #	|product_name			|
    #	|Dark Brown Jeans	|
    #	|Blue Tshirt			|
    
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
