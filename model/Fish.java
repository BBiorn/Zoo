package model;
//Bradley Biorn
public class Fish 
{
   private double weight;//in pounds
   private double length;//in inches
   private String type;//Type of fish
   
   public Fish()
   {
      super();
   }
   
   public Fish(double wt, double len, String fishType)
   {
	   this.weight = wt;
	   this.length = len;
	   this.type = fishType;
   }
   
   //Weight get and set
   public double getWeight()
   {
	   return this.weight;
   }
   public void setWeight(double newWeight)
   {
	   this.weight = newWeight;
   }
   
   //Length get and set
   public double getLength()
   {
	   return this.length;
   }
   public void setLength(double newLength)
   {
	   this.length = newLength;
   }
   
   //Type get and set
   public String getType()
   {
	   return this.type;
   }
   public void setType(double newType)
   {
	   this.weight = newType;
   }
   
   public String speak()
   {
	   return "Blub Blub";
   }
}
