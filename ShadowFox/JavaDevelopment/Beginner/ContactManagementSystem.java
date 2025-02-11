// Source code is decompiled from a .class file using FernFlower decompiler.
class Contact {
   public String name;
   public String phoneNumber;
   public String email;

   Contact(String var1, String var2, String var3) {
      this.name = var1;
      this.phoneNumber = var2;
      this.email = var3;
   }

   public void display() {
      System.out.println("Name: " + this.name + ", Phone: " + this.phoneNumber + ", Email: " + this.email);
   }
}
