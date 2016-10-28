public class Kileleht extends Arvutaja{
	double laius, paksus;
	public Kileleht(double laius, double pikkus, double paksus){
		super(pikkus);
		this.laius=laius;
		this.paksus=paksus;
	}
	public double ristloige(){
		return laius*paksus;
	}
}