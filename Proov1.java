import java.util.*;
public class Proov1{
	public static void main(String[] arg){
		Kilesuk ks1=new Kilesukk(600, 400, 1600, 0.045);
		System.out.println(ks1.kaal());
		List<Arvutaja> kiled=new ArrayList<Arvutaja>();
		kiled.add(ks1);
		for(Arvutaja k: kiled){
			System.out.println(k.kaal());
		}
	}
}