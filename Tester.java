public class Tester
{
   public static void main(String[] args)
   {
      Weapon legSword = new Weapon("The Sword of Light",2,4,15);
      System.out.println("You swing " + legSword.getName() + ",\ndealing " + legSword.attackDmg(1) + " damage!");
   }
}