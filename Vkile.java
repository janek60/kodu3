public class Vkile extends Arvutaja{
	double laius, paksus;
	public Vkile(double laius, double pikkus, double paksus){
		super(pikkus);
		this.laius=laius;
		this.paksus=paksus;
	}
	public double ristloige(){
		return laius*paksus*2;
	}
}