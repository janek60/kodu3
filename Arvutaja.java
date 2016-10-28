public abstract class Arvutaja{
	double pikkus;
	public Arvutaja(double uusPikkus){
		pikkus=uusPikkus;
	}
	public abstract double ristloige();
	public double kaal(){
		return ristloige()*pikkus/1000000*0.928;
	}
}