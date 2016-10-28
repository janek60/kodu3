import java.util.*;
public class Proov1{
	public static void main(String[] arg){
		Kilesukk ks1=new Kilesukk(300, 200, 3000000, 0.045);
		Kilesukk ks2=new Kilesukk(800, 300, 5000000, 0.025);
		Kilesukk ks3=new Kilesukk(700, 250, 2500000, 0.060);
		Kileleht kl1=new Kileleht(600, 3500000, 0.060);
		Kileleht kl2=new Kileleht(700, 2500000, 0.060);
		Vkile vk1=new Vkile(700, 2500000, 0.060);
		List<Arvutaja> kiled=new ArrayList<Arvutaja>();
		kiled.add(ks1);
		kiled.add(kl2);
		kiled.add(vk1);
		for(Arvutaja k: kiled){
			System.out.println("Kile kaalub: "+k.kaal()+" kg");
		}
	}
}