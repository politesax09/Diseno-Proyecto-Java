package Ataques2_decorator;
import CrearEnemigos_abstractfactory.*;


public class BT extends Decorator
{
	protected final String NAME = "Botella";


	public BT(Component component)
	{
		super(component);
		// TODO Auto-generated constructor stub



	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getDays() {
		return -1;
	}

	@Override
	public void updateDays() {

	}

	//	protected void addAfines(Politico politico)
//	{
//		politico.setFollowers+= 0.2* [ACCEDER A GENTEQUENOVOTA]
//	}
}
