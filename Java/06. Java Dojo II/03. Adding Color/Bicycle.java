class Bicycle {
    private String name;
    private String color;
  
    Bicycle(String name, String color) {
      this.name = name;
      this.color = color;
    }
  
    public void printData() {
      System.out.println("Name: " + this.name);
      System.out.println("Color: " + this.color);
    }
  }
  