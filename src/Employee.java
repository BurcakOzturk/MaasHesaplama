
public class Employee {

		String name;
		double maas;
		int calismaSaati;
		int iseAlinanYil;
		
		
public  Employee(String name,double maas,int calismaSaati,int iseAlinanYil)
	{
		this.name = name;
		this.maas = maas;
		this.calismaSaati = calismaSaati;
		this.iseAlinanYil = iseAlinanYil;
		
	}
	double tax()
	{ if (maas<=1000) {
		return 0.0;
	}
	else {
		double tax = maas*0.03;
		
		return tax;
	}
				
	}
		public double bonus() {
			
			if(calismaSaati>40)
			{
			double bonus = (calismaSaati-40);
				
			return bonus;
			}
			
			return 0.0;
		}
		
		public double raiseSalay()
		{
			int nowYear = 2021;
			
			double experience = nowYear-iseAlinanYil;
			
			if (experience<10)
				
			{
			return this.maas*0.05;
			
			}
		if(experience>9 && experience<20) {
			return this.maas*0.10;
			
		}
		else {
		}
		return this.maas*0.15;
		}
		
		

public void printScore() {
    System.out.println("Adı :" + this.name);
    System.out.println("Maaşı :" + this.maas);
    System.out.println("Çalışma Saati :" + this.calismaSaati);
    System.out.println("Başlangıç Yılı :" + this.iseAlinanYil);
    System.out.println("Vergi :" + tax());
    System.out.println("Bonus :" + bonus());
    System.out.println("Maaş Artışı :" + raiseSalay());
    System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.maas + bonus() - tax()));
    System.out.println("Toplam Maaş :" + (this.maas + bonus() - tax() + raiseSalay()));

} }
				
			