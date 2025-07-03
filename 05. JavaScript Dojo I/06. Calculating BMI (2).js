var height = 1.7;
var weight = 60;

// Write your code below
var bmi = weight / height / height;
console.log("Your BMI is " + bmi);

var idealWeight = height * height * 22;
console.log("Your ideal weight is " + idealWeight + "kg");

if (bmi < 18.5){
  console.log("This is lower than the ideal range");
} else if (bmi >= 18.5 && bmi <= 25){
  console.log("This is within the ideal range");
} else {
  console.log("This is higher than the ideal range");
}
