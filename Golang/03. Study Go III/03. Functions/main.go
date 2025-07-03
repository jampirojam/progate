package main

import "fmt"

func main() {
	// Cut and paste the code below
	// var input string
	// fmt.Println("Please input the following word: dog")
	// fmt.Scan(&input)
	// fmt.Printf("%s was input", input)
	// Cut and paste the code above
	
	// Call the ask function
	ask()
	
}

// Define the ask function
func ask() {
	var input string
	fmt.Println("Please input the following word: dog")
	fmt.Scan(&input)
	fmt.Printf("%s was input", input)    
}
