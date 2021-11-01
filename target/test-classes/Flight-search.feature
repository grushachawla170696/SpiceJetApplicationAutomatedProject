@SearchFlightFeature
Feature: Search Flight Action

Scenario: Search for Flight
	Given Browser is open
	When User Navigate to SpiceJet Website
	And User selects round trip radio button
	And User click on From button
	And User selects From location
	And User clicks on destination button
	And User selects destination location
	And user selects departure date
	And user selects return date
	And user clicks on Currency button
	And user selects GBP currency
	And user selects student radio button
	And user clicks on search flight button
	Then Pop up message appears on screen
