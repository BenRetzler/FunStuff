import java.util.Random;

public class Weapon
{
   private int strengthMod, playerStrength, baseDmg;
   private String name;
   private Random random;
   
   public Weapon()
   {
      strengthMod = 0;
      playerStrength = 0;
      baseDmg = 0;
      name = "undefined weapon";
      random = new Random();
   }
   public Weapon(String n, int sm, int ps, int dmg)
   {
      strengthMod = sm;
      playerStrength = ps;
      baseDmg = dmg;
      name = n;
      random = new Random();
   }
   
   public String getName()
   {
      return name;
   }
   public int getStrMod()
   {
      return strengthMod;
   }
   public int getPlyStr()
   {
      return playerStrength;
   }
   public int getBaseDmg()
   {
      return baseDmg;
   }
   public int attackDmg(int amt)
   {
      int randomDmg = 0;
      for(int j = 0; j < amt; j++)
      {
         for(int i = 0; i < playerStrength; i++)
            randomDmg += random.nextInt(strengthMod) + 1;
      }
      return randomDmg + (baseDmg * amt);
   }
}