public class Kilesukk extends Arvutaja{
	double laius, sisseviik, paksus;
	public Kilesukk(double laius, double sisseviik, double pikkus, double paksus){
		super(pikkus);
		this.laius=laius;
		this.sisseviik=sisseviik;
		this.paksus=paksus;
	}
	public double ristloige(){
		return pikkus*laius;
	}
}