class Main {
    public static void main(String[] args) {
      // Assign a string to the name variable
      String name = "Kate Jones";
      
      // Assign an integer to the age variable
      int age = 27;
      
      // Assign a double to the height variable (i.e. 1.6)
      double height = 1.6;
      
      // Assign a double to the weight variable (i.e. 50.0)
      double weight = 50.0;
      
      // Calculate the BMI and assign it into the bmi variable
      double bmi = weight / height / height;
      
      // Print name, age, height, weight, and BMI
      System.out.format("My name is %s\nI am %d years old\n", name, age);
      System.out.println(String.format("My height is %s meters\nMy weight is %s kilograms\nMy BMI is %s", height, weight, bmi));
    }
  }
  