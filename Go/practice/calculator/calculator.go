package main

import (
	"fmt"
	"math"
)

func main() {
	const inflationRate = 6.5
	var invetmentAmount float64
	var years float64
	expectedReturnRate := 5.5

	fmt.Print("Investment Amount: ")
	fmt.Scan(&invetmentAmount)

	fmt.Print("Expected Retrun Rate: ")
	fmt.Scan(&expectedReturnRate)

	fmt.Print("Invetment Horizon: ")
	fmt.Scan(&years)

	futureValue := invetmentAmount * math.Pow(1+expectedReturnRate/100, years)
	futureRealValue := futureValue / math.Pow(1+inflationRate/100, years)

	formattedFV := fmt.Sprintf("Future Value: %.1f\n", futureValue)
	formattedRFV := fmt.Sprintf("Future Value (adjusted for Inflation): %.2f\n", futureRealValue)
	// fmt.Println("Future Value: ", futureValue)
	//fmt.Printf("Future Value: %.0f\n", futureValue)
	//fmt.Println("Future Value (adjusted for Inflation):", futureRealValue)
	//fmt.Printf("Future Value (adjusted for Inflation): %.2f\n", futureRealValue)
	fmt.Print(formattedFV, formattedRFV)
}
