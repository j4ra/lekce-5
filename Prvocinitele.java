/* Vypise rozklad na prvocinitele. */
public class Prvocinitele {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		while (scanner.hasNextInt()) {
			int cislo = scanner.nextInt();
			
			if (cislo < 1) {
				System.out.printf("%d neresim.\n", cislo);
				continue;
			}

			System.out.printf("%d =", cislo);
			Prvocinitel(cislo);
		}
	}
  
  public static void Prvocinitel(int n)
  {
      int delitel = 2;
			while (delitel <= n) {
				if ((n % delitel) == 0) {
          if(IsPrime(delitel))
          {
            System.out.printf(" %d", delitel);
          }
          else
          {
            Prvocinitel(delitel);            
          }
					n /= delitel;
          continue;
				}
				delitel++;
			}
			System.out.println();
  }
  
  public static Boolean IsPrime(int n)
  {
    for(int i = 2; i < n / 2; i++)
    {
      if(n % i == 0)
      {
        return false;
      }
    }
    return true;
  }
}
