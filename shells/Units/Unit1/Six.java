import edu.fcps.Digit;
public class Six extends Digit
{
   public Six(int x, int y) 
   {
      super(x, y);
   }
   public void display()
   {
      segment1_On();
      segment2_Off();
      segment3_On();
      segment4_On();
      segment5_On();
      segment6_On();
      segment7_On();
   }
}